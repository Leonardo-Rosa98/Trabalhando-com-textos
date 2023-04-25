public class MetodoFormat {
    public static void main(String[] args) {
        String nome = "Leonardo";
        int idade = 25;
        double peso = 80.05;

        System.out.println(String.format("Meu nome é %s, eu tenho %d anos e peso %.2f kilos.", nome, idade, peso));

       String mensagem = """
                        Olá, %s!
                        Boas vindas ao curso de JAVA.
                        Ouvi dizer que você pesa %.2f, gordo afu eu diria.
                        Coisas da vida lek.
                        """.formatted(nome,peso);
        System.out.println(mensagem);

    }   
}
