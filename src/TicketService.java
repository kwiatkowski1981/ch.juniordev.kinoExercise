public class TicketService {

    public void createANewTicket(Movie movie, Cinema cinema, Guest guest, Ticket ticket) {
        if (cinema.freeSeats == 0) {
            System.out.println("No seats available for the screening");
        } else if (guest.age < movie.ageRequired) {
            System.out.println("The movie is available to people above " + movie.ageRequired + " years");
        } else {
            ticket.ticketId = ticket.ticketId + 1;
            ticket.ticketPersonData = guest.firstName + " " + guest.lastName;
            ticket.ticketMovieTitle = "Omen";
            cinema.freeSeats--;
        }
    }
    public void printATicket(Movie movie, Cinema cinema, Guest guest, Ticket ticket) {

        System.out.println("Tickets sold");
        if (ticket.ticketId != 0) {
            System.out.println(ticket.ticketId + " | " + ticket.ticketPersonData + " | " + ticket.ticketMovieTitle
                    + " - " + movie.movieType + " - " + movie.movieTime + "min");
        }
        System.out.println("Number of remaining seats: " + cinema.freeSeats);
        System.out.println("Number of tickets sold: " + (cinema.maxSeats - cinema.freeSeats));
    }
}


