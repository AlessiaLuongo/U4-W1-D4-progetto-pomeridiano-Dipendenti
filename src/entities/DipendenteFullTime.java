package entities;

public class DipendenteFullTime extends Dipendente{


    public DipendenteFullTime(double stipendio, entities.Dipartimento dipartimento) {
        super(stipendio, dipartimento);
    }

    @Override
    public int calculateSalary() {
        return 0;
    }
}

