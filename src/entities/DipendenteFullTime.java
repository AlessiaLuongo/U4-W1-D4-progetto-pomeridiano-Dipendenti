package entities;

public class DipendenteFullTime extends Dipendente{


    public DipendenteFullTime( Dipartimento dipartimento) {
        super( dipartimento);
    }

    @Override
    public double calculateSalary() {
        return (1800);
    }

    @Override
    public void checkInAtWork() {
        System.out.println("Io lavoro dalle 9 alle 18");
    }
}

