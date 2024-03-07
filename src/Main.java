import entities.Dipendente;

import java.lang.reflect.Array;
import java.util.Arrays;

import static entities.Dipartimento.*;

public class Main {
    public static void main(String[] args){
        Dipendente dipendente1 = new Dipendente( 10.00, AMMINISTRAZIONE );

        Dipendente dipendente2 = new Dipendente( 10.00, PRODIZIONE );

        Dipendente dipendente3 = new Dipendente( 10.00, VENDITE );
        ;

        Dipendente[] arrayDipendenti = new Dipendente[]{dipendente1, dipendente2, dipendente3};
        System.out.println(Arrays.toString(arrayDipendenti));

        for (int i = 0; i < arrayDipendenti.length; i++) {

            System.out.println(arrayDipendenti[i].getMatricola());

        }


    }
}