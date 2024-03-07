package entities;

import java.util.Random;
import static entities.Dipartimento.AMMINISTRAZIONE;
public abstract class Dipendente {
    private int matricola;
    private double stipendio;
    private Dipartimento dipartimento;

    public Dipendente( Dipartimento dipartimento) {
        Random matricolaDipendente = new Random();
        this.matricola = matricolaDipendente.nextInt(1,1000);
        this.stipendio = getStipendio();
        this.dipartimento = dipartimento;

    }

    public abstract double calculateSalary();

    public int getMatricola() {
        return matricola;
    }

    public double getStipendio() {
        return calculateSalary();
    }

    public Dipartimento getDipartimento() {
        return dipartimento;
    }

    public void setDipartimento(String dipartimento) {
        dipartimento = dipartimento;
    }

    @Override
    public String toString() {
        return "Dipendente{" +
                "matricola='" + matricola + '\'' +
                ", stipendio=" + stipendio +
                ", Dipartimento='" + dipartimento + '\'' +
                '}';
    }

}
