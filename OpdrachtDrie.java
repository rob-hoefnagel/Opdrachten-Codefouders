public class OpdrachtDrie {

    public static void main(String[] args) {
        int myArray[] = {15, 20, 9, 72};
        int sum = 0;
        for(int i=0; i < myArray.length; i++){
            sum = sum + myArray[i];
        }

        System.out.println("Het totaal van de nummers is: " + sum);
    }
}
