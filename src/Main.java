import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> listA = new ArrayList<>();
        ArrayList<String> listB = new ArrayList<>();
        ArrayList<String> listC = new ArrayList<>();

        System.out.println("Enter 5 lines for List A:");
        for (int i = 0; i < 5; i++) {
            listA.add(scanner.nextLine());
        }

        System.out.println("List A: " + listA);

        System.out.println("Enter 5 lines for List B:");
        for (int i = 0; i < 5; i++) {
            listB.add(scanner.nextLine());
        }

        System.out.println("List B: " + listB);

        for (int i = 0; i < 5; i++) {
            listC.add(listA.get(i));
            listC.add(listB.get(4 - i));
        }

        System.out.println("List C (merged): " + listC);

        listC.sort((s1, s2) -> s1.length() - s2.length());

        System.out.println("List C (sorted by word length): " + listC);
    }
}