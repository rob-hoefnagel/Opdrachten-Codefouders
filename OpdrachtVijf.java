/*Maak twee klassen aan: Monteur en Auto.
De auto heeft booleans voor 4 kapotte onderdelen.
In de constructor bepaal je met behulp van een array aan booleans welke onderdelen kapot zijn en niet.
De toString methode toont je welke onderdelen kapot en niet kapot zijn. Het gaat om de onderdelen.
- boolean motor;
- boolean deur;
- boolean voorruit;
- boolean uitlaat;

De monteur loopt deze booleans af en repareert ze.
Het repareren heeft een prijs: elk onderdeel dat is gerepareerd kost 25 euro extra.*/

//3 classes. monteur heeft extra methode met als argument een parameter heeft van het type auto


public class OpdrachtVijf {
    public static void main(String[] args) {
        Monteur henk = new Monteur();
        Auto auto1 = new Auto();
        auto1.deur = true;
        auto1.motor = true;
        auto1.voorruit = false;
        auto1.uitlaat = true;
        henk.repareren(auto1);
        System.out.println(henk.bedrag);

    }

}

    class Monteur {
        int bedrag = 0;
        void repareren(Auto deAuto) {
            if (deAuto.deur == true) {
                System.out.println("dit moet gerepareed worden");
                bedrag += 25;
            } else {
                System.out.println("de auto is nog heel");
            }
        }
    }
    class  Auto {
        boolean deur;
        boolean motor;
        boolean voorruit;
        boolean uitlaat;


    }