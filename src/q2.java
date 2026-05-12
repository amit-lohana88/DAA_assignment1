public class q2 {

    public static void main(String[] args) {

        int amount = 1988;

        // Pakistani currency denominations
        int[] denominations = {5000, 1000, 500, 100, 50, 20, 10, 5, 2, 1};

        System.out.println("Amount = Rs. " + amount);
        System.out.println("\nCurrency Denominations Required:\n");

        for (int note : denominations) {

            if (amount >= note) {

                int count = amount / note;

                System.out.println("Rs. " + note + " x " + count);

                amount = amount % note;
            }
        }
    }
}