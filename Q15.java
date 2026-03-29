class Q15 {

    
    static void processTransaction() throws Exception {
       
        boolean error = true;

        if (error) {
            throw new Exception("Transaction failed");
        }

        System.out.println("Transaction processed");
    }

    public static void main(String[] args) {

        try {
            processTransaction();
            System.out.println("Transaction processed");
        } catch (Exception e) {
            System.out.println("Exception handled in main");
        }
    }
}