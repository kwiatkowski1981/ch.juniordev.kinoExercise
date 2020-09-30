public class Ticket {

  private   String ticketPersonData = null;
  private   String ticketMovieTitle = null;
  private   int ticketId = 0;

    public String getTicketPersonData() {
        return ticketPersonData;
    }

    public void setTicketPersonData(String ticketPersonData) {
        this.ticketPersonData = ticketPersonData;
    }

    public String getTicketMovieTitle() {
        return ticketMovieTitle;
    }

    public void setTicketMovieTitle(String ticketMovieTitle) {
        this.ticketMovieTitle = ticketMovieTitle;
    }

    public int getTicketId() {
        return ticketId;
    }


    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }


    //    public Ticket(String ticketPersonData, String ticketMovieTitle, int ticketId) {
//        this.ticketPersonData = ticketPersonData;
//        this.ticketMovieTitle = ticketMovieTitle;
//        this.ticketId = ticketId;
//    }
//    public String printTicketPersonData(Guest guest){
//        String ticketPersonData = guest.firstName + guest.lastName;
//        return ticketPersonData ;
//
//    }

//

}
