class BankingSystem {

    int balance = 1000; // shared account balance

    void withdraw(String user, int amount) {

        synchronized (this) { // synchronized block

            if (balance >= amount) {
                System.out.println(user + " is withdrawing " + amount);
                balance -= amount;
                System.out.println("Remaining balance: " + balance);
            } else {
                System.out.println(user + ": Insufficient balance");
            }
        }
    }

    public static void main(String[] args) {

        BankingSystem account = new BankingSystem();

        // Thread 1
        Thread t1 = new Thread(() -> {
            account.withdraw("User 1", 700);
        });

        // Thread 2
        Thread t2 = new Thread(() -> {
            account.withdraw("User 2", 500);
        });

        // Start threads
        t1.start();
        t2.start();
    }
}