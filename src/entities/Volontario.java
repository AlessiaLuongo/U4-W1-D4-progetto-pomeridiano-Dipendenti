package entities;

public class Volontario {
    private String nome;
    private int eta;
    private String cv;

    public Volontario(String nome, int eta, String cv) {
        this.nome = nome;
        this.eta = eta;
        this.cv = cv;
    }

    @Override
    public String toString() {
        return "Volontario{" +
                "nome='" + nome + '\'' +
                ", eta=" + eta +
                ", cv='" + cv + '\'' +
                '}';
    }
}
