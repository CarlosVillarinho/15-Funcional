package exercicio01;

public record Empregado(String nome, int anosExperiencia, double salario) {

    @Override
    public String toString() {
        return "Empregado | " +
                "nome = " + nome +
                ", anosExperiencia = " + anosExperiencia +
                ", salario = " + salario;
    }
}