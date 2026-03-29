class RailwayReservation {

    int availableTickets = 1; // only 1 ticket available

    synchronized void bookTicket(String passengerName) {

        if (availableTickets > 0) {
            System.out.println(passengerName + ": Ticket booked successfully");
            availableTickets--;
        } else {
            System.out.println(passengerName + ": No tickets available");
        }
    }

    public static void main(String[] args) {

        RailwayReservation rr = new RailwayReservation();

        // Creating threads using Runnable
        Runnable task1 = () -> rr.bookTicket("Passenger 1");
        Runnable task2 = () -> rr.bookTicket("Passenger 2");

        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);

        // Start threads
        t1.start();
        t2.start();
    }
}