package entities;

public class Dirigente extends Dipendente {
    public Dirigente(double stipendio, entities.Dipartimento dipartimento) {
        super(stipendio, dipartimento);
    }

    @Override
    public int calculateSalary() {
        return 0;
    }
}
