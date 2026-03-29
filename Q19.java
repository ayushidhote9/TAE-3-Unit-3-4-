class OnlineShoppingSystem {

    public static void main(String[] args) {

        // Thread for payment processing
        Thread paymentThread = new Thread(() -> {
            System.out.println("Processing payment...");
        });

        // Thread for order confirmation
        Thread orderThread = new Thread(() -> {
            System.out.println("Order confirmed...");
        });

        // Start both threads
        paymentThread.start();
        orderThread.start();
    }
}