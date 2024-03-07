import entities.Dipendente;
import entities.DipendenteFullTime;
import entities.DipendentePartTime;
import entities.Dirigente;

import java.lang.reflect.Array;
import java.util.Arrays;

import static entities.Dipartimento.*;

public class Main {
    public static void main(String[] args){
        DipendenteFullTime dipendente1 = new DipendenteFullTime( 1800.00, AMMINISTRAZIONE );
        DipendentePartTime dipendente2 = new DipendentePartTime( 1800.00, PRODIZIONE );
        Dirigente dipendente3 = new Dirigente( 1800.00, VENDITE );
        DipendenteFullTime dipendente4 = new DipendenteFullTime(1800, AMMINISTRAZIONE);
        DipendentePartTime dipendente5 = new DipendentePartTime( 1800.00, PRODIZIONE );
        Dirigente dipendente6 = new Dirigente( 1800.00, VENDITE );
        ;

        Dipendente[] arrayDipendentiFullTime = new DipendenteFullTime[]{dipendente1, dipendente4};
        System.out.println(Arrays.toString(arrayDipendentiFullTime));

        for (int i = 0; i < arrayDipendentiFullTime.length; i++) {
            System.out.println("Le matricole dei dipendenti FullTime sono: " + arrayDipendentiFullTime[i].getMatricola() + "e il mio salario fisso è di " + arrayDipendentiFullTime[i].getStipendio());
        }


    }
}