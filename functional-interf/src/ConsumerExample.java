import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

    public static void main(String[] args) {
        //Criar uma lista de números inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        //Usar o Consumer com expressão lambda para imprimir números pares
        Consumer<Integer> imprimirNumeropar = numero -> {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
        };

        //Usar o Consumer para imprimir números pares do Stream
        numeros.stream().filter(n -> n % 2 == 0)
                .forEach(System.out::println);
    }
}
