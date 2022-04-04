import java.util.Arrays;
import java.util.Scanner;

public class OpdrachtZeven {
    public static void main(String[] args) {
        char[] hetWoord = new char[] {'f','i', 'e', 't', 's'};
        System.out.println("_ _ _ _ _");
        Scanner newScanner = new Scanner(System.in);
        System.out.println("kies een woord dat bestaat uit 5 letters");
        String geradenWoord = newScanner.nextLine();
        char[] geradenChar = geradenWoord.toCharArray();
        System.out.println(geradenChar);
        for (int i=0; i<geradenChar.length; i++) {
            if (hetWoord[i] == geradenChar[i]){
                System.out.println("2");
            } else if (){ // geen idee
                System.out.println("1");
            } else {
                System.out.println("0");
            }
        }
        //converteer input naar een char array
        //vergelijk plekken array met hetWoord + vergelijk letter array met alle letters hetWoord.

    }
}
//hetWoord[i] == geradenWoord.charAt(i)

