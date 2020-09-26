public class TicketService {

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
    public void printATicket(Movie movie, Cinema cinema, Ticket ticket) {

        System.out.println("Tickets sold");
        if (ticket.getTicketId() != 0) {
            System.out.println(ticket.getTicketId() + " | " + ticket.getTicketPersonData()
                    + " | " + ticket.getTicketMovieTitle()
                    + " - " + movie.getMovieType() + " - " + movie.getMovieTime() + "min");
        }
        System.out.println("Number of remaining seats: " + cinema.getFreeSits());
        System.out.println("Number of tickets sold: " + (cinema.getMaxSits() - cinema.getFreeSits()));
    }
}


