public class TicketCreateService {

    public void createANewTicket(Movie movie, Cinema cinema, Guest guest, Ticket ticket) {
        if (cinema.getFreeSits() == 0) {
            System.out.println("No seats available for the screening");
        } else if (guest.getAge() < movie.getAgeRequired()) {
            System.out.println("The movie is available to people above " + movie.getAgeRequired() + " years");
        } else {
            ticket.setTicketId(ticket.getTicketId() + 1);
            ticket.setTicketPersonData(guest.getFirstName() + " " + guest.getLastName());
            ticket.setTicketMovieTitle(movie.getMovieTitle());
            cinema.setFreeSits(cinema.getFreeSits() -1);
        }
    }


}


