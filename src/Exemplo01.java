import java.util.stream.IntStream;

public class Exemplo01 {
    public static void main(String[] args) {
        int[] v = {3, 5, 6, 2, 1, 10};
        IntStream fluxo = IntStream.of(v);

        //SELECIONAR OS NUMEROS PARES E FAZER A IMPRESSAO
//        fluxo.filter(valor -> valor % 2 == 0)
//                .sorted()
//                .forEach(valor -> System.out.println(valor));

//        fluxo.filter(valor -> valor % 2 == 0)
//                .sorted()
//                .forEach(System.out::println);

        //SELECIONAR APENAS OS NUMEROS MAIORES QUE 3,
        //EM SEGUIDA SOMAR DUAS UNIDADES EM CADA VALOR,
        //ORDENAR E IMPRIMIR
//        fluxo.filter(valor -> valor > 3)
//                .map(valor -> valor + 2)
//                .sorted()
//                .forEach(System.out::println);

        //SOMAR OS ELEMENTOS USANDO A FUNCAO REDUCE
        int soma = fluxo.reduce(0, (total, i) -> total + i);
        System.out.println(soma);
    }
}
