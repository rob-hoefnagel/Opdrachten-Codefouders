import java.util.Arrays;
import java.util.Scanner;

public class OpdrachtZes {
    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);
        System.out.println("Voer iets in");
        String myString = myInput.nextLine();
        char charArray[] = myString.toCharArray();
        Arrays.sort(charArray);
        System.out.println(charArray);
    }
}
