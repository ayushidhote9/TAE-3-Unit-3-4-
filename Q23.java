class ChatApplication {

    // Thread for sending messages
    static class SendMessage extends Thread {

        public void run() {
            try {
                System.out.println("Sending message...");
                Thread.sleep(1000); // simulate delay
                System.out.println("Message sent successfully");
            } catch (InterruptedException e) {
                System.out.println("Sending interrupted");
            }
        }
    }

    // Thread for receiving messages
    static class ReceiveMessage extends Thread {

        public void run() {
            try {
                System.out.println("Receiving message...");
                Thread.sleep(1000); // simulate delay
                System.out.println("Message received successfully");
            } catch (InterruptedException e) {
                System.out.println("Receiving interrupted");
            }
        }
    }

    public static void main(String[] args) {

        SendMessage sender = new SendMessage();
        ReceiveMessage receiver = new ReceiveMessage();

        // Thread lifecycle demonstration
        System.out.println("Sender thread state before start: " + sender.getState());

        sender.start();
        receiver.start();

        System.out.println("Sender thread state after start: " + sender.getState());
    }
}