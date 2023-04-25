import java.security.MessageDigest;

public class ConvertendoValores {
    public static void main(String[] args) {
        double nota = 5.5;
        double nota2 = 8.6;
        double nota3 = 4.2;

        //Incluindo (int)
        int media = (int) (nota + nota2 + nota3) / 3;
        System.out.println(media);
    }
}
