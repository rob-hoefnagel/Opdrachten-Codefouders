public class OpdrachtTwee {

    public static void main(String[] args) {
        String myString = "scheermesje";
        int count = 0;
        for (int i=0; i<myString.length(); i++){
            if(myString.charAt(i) =='e')
                count++;
        }

        System.out.println("Totaal aantal letters 'e' is " + count);
    }
}
