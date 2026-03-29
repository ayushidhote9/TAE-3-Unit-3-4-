class ThreadPrioritySystem extends Thread {

    public ThreadPrioritySystem(String name) {
        super(name);
    }

    public void run() {
        System.out.println(Thread.currentThread().getName() +
                " is running with priority " +
                Thread.currentThread().getPriority());
    }

    public static void main(String[] args) {

        ThreadPrioritySystem t1 = new ThreadPrioritySystem("Thread 1");
        ThreadPrioritySystem t2 = new ThreadPrioritySystem("Thread 2");
        ThreadPrioritySystem t3 = new ThreadPrioritySystem("Thread 3");

        // Assign priorities
        t1.setPriority(Thread.MIN_PRIORITY);   // priority 1
        t2.setPriority(Thread.NORM_PRIORITY);  // priority 5
        t3.setPriority(Thread.MAX_PRIORITY);   // priority 10

        // Start threads
        t1.start();
        t2.start();
        t3.start();
    }
}