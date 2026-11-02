package jobsheet10;

public class studyCase3 {
    public static void main(String[] args) {
        char ch = 'a';
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
