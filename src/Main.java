import entities.*;

import java.lang.reflect.Array;
import java.util.Arrays;

import static entities.Dipartimento.*;

public class Main {
    public static void main(String[] args){
        DipendenteFullTime dipendente1 = new DipendenteFullTime( PRODIZIONE);
        DipendentePartTime dipendente2 = new DipendentePartTime( VENDITE);
        Dirigente dipendente3 = new Dirigente( AMMINISTRAZIONE);
        DipendenteFullTime dipendente4 = new DipendenteFullTime( PRODIZIONE);
        DipendentePartTime dipendente5 = new DipendentePartTime( VENDITE);
        Dirigente dipendente6 = new Dirigente( AMMINISTRAZIONE);


        Dipendente[] arrayDipendentiFullTime = new DipendenteFullTime[]{dipendente1, dipendente4};
        System.out.println(Arrays.toString(arrayDipendentiFullTime));

        for (int i = 0; i < arrayDipendentiFullTime.length; i++) {
            System.out.println("Sono il dipendente Full Time numero: " + arrayDipendentiFullTime[i].getMatricola() + " e il mio salario fisso è di " + arrayDipendentiFullTime[i].getStipendio());
        }
        //------------------------------------------------------------------------------
        Dipendente[] arrayDipendentiPartTime = new DipendentePartTime[]{dipendente2, dipendente5};
        System.out.println(Arrays.toString(arrayDipendentiPartTime));

        for (int i = 0; i < arrayDipendentiPartTime.length; i++) {
            System.out.println("Sono il dipendente Part Time numero: " + arrayDipendentiPartTime[i].getMatricola() + " e il mio salario fisso è di " + arrayDipendentiPartTime[i].getStipendio());
        }
        //------------------------------------------------------------------------------
        Dipendente[] arrayDirigenti = new Dirigente[]{dipendente3, dipendente6};
        System.out.println(Arrays.toString(arrayDirigenti));

        for (int i = 0; i < arrayDirigenti.length; i++) {
            System.out.println("Sono il Dirigente numero: " + arrayDirigenti[i].getMatricola() + " e il mio salario fisso è di " + arrayDirigenti[i].getStipendio());
        }

        Volontario volontario1 = new Volontario("Alessia", 29, "cv mandato per mail");
        System.out.println(volontario1);

        dipendente4.checkInAtWork();
        volontario1.checkInAtWork();
    }

}