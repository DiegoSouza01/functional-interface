import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class SupplierExample {

    // Usa o Supplier com expressão lambda para fornecer uma saudação personalizada
    public static void main(String[] args) {
        Supplier<String> saudacao = () -> "Olá, Seja bem-vindo(a)!";

        // Usar o Supplier para obter uma lista com 10 saudações
        List<String> listaSaudacoes = Stream.generate(() -> "Olá, Seja bem-vindo(a)!")
                .limit(10)
                .toList();

        // Imprimir as saudações geradas
        listaSaudacoes.forEach(s -> System.out.println(s));
    }
}
