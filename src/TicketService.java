public class TicketService {

                   if (freeSeats == 0) {
        System.out.println("Brak wolnych miejsc na seans");
    } else if (age2 < ageRequired) {
        System.out.println("Film dostępny dla osób powyżej " + ageRequired + " lat");
    } else {
        ticket2Id = ticket1Id + 1;
        ticket2PersonData = firstName2 + " " + lastName2;
        ticket2MovieTitle = "Omen";
        freeSeats--;
    }

        System.out.println("Sprzedane bilety");
        if (ticket1Id != 0) {
        System.out.println(ticket1Id + " | " + ticket1PersonData + " | " + ticket1MovieTitle + " - " + movieType + " - " + movieTime + "min");
    }
        if (ticket2Id != 0) {
        System.out.println(ticket2Id + " | " + ticket2PersonData + " | " + ticket2MovieTitle + " - " + movieType + " - " + movieTime + "min");
    }

        System.out.println("Liczba pozostałych miejsc: " + freeSeats);
        System.out.println("Liczba sprzedanych biletów: " + (maxSeats - freeSeats));
}


