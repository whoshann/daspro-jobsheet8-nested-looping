package jobsheet10;

public class studyCase4 {
    public static void main(String[] args) {

        for (int n = 1; n <= 5; n++) {
            int total = 0;

            System.out.print("n = " + n + " -> sum of squares = ");

            for (int i = 1; i <= n; i++) {
                int kuadrat = i * i;
                total = total + kuadrat;

                if (i > 1) {
                    System.out.print(" + ");
                }
                System.out.print(kuadrat);
            }

            if (n > 1) {
                System.out.print(" = " + total);
            }
            System.out.println();
        }
    }
}