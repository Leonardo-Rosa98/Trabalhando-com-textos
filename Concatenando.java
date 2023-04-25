import java.util.spi.LocaleNameProvider;

public class Concatenando {
    public static void main(String[] args) {
        String nome = "Leonardo";
        String mensagem = """
                        Olá, bem vindo!
                        Aqui você vai aprender a concatenar texto com o
                        """;

        System.out.println(mensagem + nome);



    }
}
