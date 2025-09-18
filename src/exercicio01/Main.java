package exercicio01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Empregado> lista = new ArrayList<>();
        lista.add(new Empregado("Carlos", 3, 10));
        lista.add(new Empregado("Jeniffer", 10, 10));
        lista.add(new Empregado("Duda", 10, 100));
        lista.add(new Empregado("Kiki", 25, 1000));

        //MAP ALTERA TUDO | | FILTER SELECIONA ALGO EM ESPECIFICO E ALTERA ELE (essa a diferença)
//        lista.stream()
//                .map(empregado -> new Empregado(empregado.nome(), empregado.anosExperiencia(),
//                        empregado.salario() * (empregado.anosExperiencia() >= 5 ? 1.2 : 1.1))) //ESTOU FAZENDO AS OPERAÇOES DE AUMENTO DE SALARIO
//                .sorted(Comparator.comparing(Empregado::nome)) //USA APENAS SORTED QUANDO A LISTA É APENAS 'string' 'int' 'double'...
//                .forEach(System.out::println);

        //PREDICADO --> filtro lógico para selecionar anos de eperiencia
        //ARMAZENA UM METODO EM UMA VARIAVEL
        Predicate<Empregado> filtro = empregado -> empregado.anosExperiencia() >= 5;

        lista.stream()
                .map(empregado -> new Empregado(empregado.nome(), empregado.anosExperiencia(),
                        empregado.salario() * (filtro.test(empregado) ? 1.2 : 1.1)))
                .sorted(Comparator.comparing(Empregado::nome))
                .forEach(System.out::println);
    }
}
