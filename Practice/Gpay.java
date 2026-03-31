package Practice;

class GPay {
    // Overloaded payment methods
    void payment(double amount) {
        System.out.println("Payment of Rs " + amount);
    }

    void payment(double amount, String method) {
        System.out.println("Payment of Rs " + amount + " using " + method);
    }
        public static void main(String[] args) {
            // Create objects
            GPay g1 = new GPay();
            g1.payment(500);
            g1.payment(1000, "UPI");

        }
}