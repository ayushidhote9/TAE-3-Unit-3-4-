class Restaurant {

    boolean foodReady = false;

    // Chef prepares food
    synchronized void prepareFood() {

        System.out.println("Chef prepared food");
        foodReady = true;

        notify(); // notify waiter that food is ready
    }

    // Waiter serves food
    synchronized void serveFood() {

        while (!foodReady) {
            try {
                wait(); // waiter waits until food is prepared
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }

        System.out.println("Waiter served food");
    }

    public static void main(String[] args) {

        Restaurant r = new Restaurant();

        // Waiter thread
        Thread waiter = new Thread(() -> {
            r.serveFood();
        });

        // Chef thread
        Thread chef = new Thread(() -> {
            r.prepareFood();
        });

        waiter.start();
        chef.start();
    }
}