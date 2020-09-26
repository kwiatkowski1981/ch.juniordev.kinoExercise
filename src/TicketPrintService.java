public class TicketPrintService {

    public void printATicket(Movie movie, Ticket ticket) {
        System.out.println("Tickets sold");
        if (ticket.getTicketId() != 0) {
            System.out.println(ticket.getTicketId() + " | " + ticket.getTicketPersonData()
                    + " | " + ticket.getTicketMovieTitle()
                    + " - " + movie.getMovieType() + " - " + movie.getMovieTime() + "min");
        }
    }

    public void cinemaSitsService(Cinema cinema) {
        System.out.println("Number of remaining sits: " + cinema.getFreeSits());
        System.out.println("Number of tickets sold: " + (cinema.getMaxSits() - cinema.getFreeSits()));
    }




}
