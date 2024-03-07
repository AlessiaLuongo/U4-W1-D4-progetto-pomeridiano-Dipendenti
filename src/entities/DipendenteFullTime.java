package entities;

public class DipendenteFullTime extends Dipendente{


    public DipendenteFullTime( Dipartimento dipartimento) {
        super( dipartimento);
    }

    @Override
    public double calculateSalary() {
        return (1800);
    }
}

