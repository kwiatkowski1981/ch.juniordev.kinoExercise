public class CinemaSystem {


    public static void main(String[] args) {

        Guest guest1 = new Guest("Jan", "Kowalski", 17);
        Movie movie1 = new Movie();
        Ticket ticket1 = new Ticket();
        Cinema cinema1 = new Cinema();

        TicketCreateService ticketCreateService = new TicketCreateService();
        TicketPrintService ticketPrintService = new TicketPrintService();

        ticketCreateService.createANewTicket(movie1, cinema1, guest1, ticket1);
        ticketPrintService.printATicket(movie1, ticket1);
        ticketPrintService.cinemaSitsService(cinema1);


        Guest guest2 = new Guest("Anna", "Zalewska", 19);
        Ticket ticket2 = new Ticket();

        ticketCreateService.createANewTicket(movie1, cinema1, guest2, ticket2);
        ticketPrintService.printATicket(movie1, ticket2);
        ticketPrintService.cinemaSitsService(cinema1);


        Guest guest3 = new Guest("Michael", "Jordan", 54);
        Ticket ticket3 = new Ticket();

        ticketCreateService.createANewTicket(movie1, cinema1, guest3, ticket3);
        ticketPrintService.printATicket(movie1, ticket3);
        ticketPrintService.cinemaSitsService(cinema1);

    }



//    public static void main(String[] args) {
//        String movieTitle = "Omen";
//        String movieType = "horror";
//        int movieTime = 128;
//        int ageRequired = 16;
//        int maxSeats = 72;
//        int freeSeats = 72;
//        String firstName1 = "Jan";
//        String lastName1 = "Kowalski";
//        int age1 = 15;
//        int ticket1Id = 0;
//        String ticket1PersonData = null;
//        String ticket1MovieTitle = null;
//
//        if (freeSeats == 0) {
//            System.out.println("Brak wolnych miejsc na seans");
//        } else if (age1 < ageRequired) {
//            System.out.println("Film dostępny dla osób powyżej " + ageRequired + " lat");
//        } else {
//            ticket1Id = 1;
//            ticket1PersonData = firstName1 + " " + lastName1;
//            ticket1MovieTitle = "Omen";
//            freeSeats--;
//        }
//
//        String firstName2 = "Anna";
//        String lastName2 = "Zalewska";
//        int age2 = 19;
//        int ticket2Id = 0;
//        String ticket2PersonData = null;
//        String ticket2MovieTitle = null;
//        if (freeSeats == 0) {
//            System.out.println("Brak wolnych miejsc na seans");
//        } else if (age2 < ageRequired) {
//            System.out.println("Film dostępny dla osób powyżej " + ageRequired + " lat");
//        } else {
//            ticket2Id = ticket1Id + 1;
//            ticket2PersonData = firstName2 + " " + lastName2;
//            ticket2MovieTitle = "Omen";
//            freeSeats--;
//        }
//
//        System.out.println("Sprzedane bilety");
//        if (ticket1Id != 0) {
//            System.out.println(ticket1Id + " | " + ticket1PersonData + " | " + ticket1MovieTitle + " - " + movieType + " - " + movieTime + "min");
//        }
//        if (ticket2Id != 0) {
//            System.out.println(ticket2Id + " | " + ticket2PersonData + " | " + ticket2MovieTitle + " - " + movieType + " - " + movieTime + "min");
//        }
//
//        System.out.println("Liczba pozostałych miejsc: " + freeSeats);
//        System.out.println("Liczba sprzedanych biletów: " + (maxSeats - freeSeats));
//    }
}
