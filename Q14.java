class FileProcessingSystem {

    public static void main(String[] args) {

        try {
            // Simulating file reading
            System.out.println("Reading file...");

            // Simulated exception (optional example)
            int a = 10 / 0;  // This creates an error to demonstrate catch block

        } catch (Exception e) {
            // Handling exception
            System.out.println("An error occurred while reading the file.");
        } finally {
            // Cleanup message
            System.out.println("Closing file resources");
        }
    }
}