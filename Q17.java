class DownloadManager implements Runnable {

    String fileName;

    // Constructor
    DownloadManager(String fileName) {
        this.fileName = fileName;
    }

    // Thread task
    public void run() {
        System.out.println("Downloading " + fileName);
    }

    public static void main(String[] args) {

        // Creating multiple download threads
        DownloadManager d1 = new DownloadManager("File1");
        DownloadManager d2 = new DownloadManager("File2");
        DownloadManager d3 = new DownloadManager("File3");

        Thread t1 = new Thread(d1);
        Thread t2 = new Thread(d2);
        Thread t3 = new Thread(d3);

        // Starting threads
        t1.start();
        t2.start();
        t3.start();
    }
}