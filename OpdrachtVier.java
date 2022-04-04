import java.util.Arrays;
import java.util.Random;

public class OpdrachtVier {

    public static void main(String[] args) {
        int[] array = new int[10];
        Random rand = new Random();
        for (int i = 0; i < array.length; i++)
            array[i] = rand.nextInt();
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        for (int i = array.length - 1; i >= 0; i--)
            System.out.print(array[i] + " ");
        System.out.println();
    }
}

//    public static void main(String[] args) {
//        Random rand = new Random();
//        int[] myArray = new int[10];
//        for (int i = 0; i < myArray.length; i++){
//           myArray[i] = rand.nextInt();
//           Arrays.sort(myArray);
//           //System.out.println(myArray[i]);
//            System.out.println(Arrays.toString(myArray));
//            for (int i = myArray.length -1 ;i>0; i--)
//                System.out.println(myArray[1] + "");
//            System.out.println();
//        }
//    }
