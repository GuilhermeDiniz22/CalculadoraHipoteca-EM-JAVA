import java.util.Scanner;

public class Console {
    private static Scanner sc = new Scanner(System.in);
    public static double LerEntrada(String entrada){
        return sc.nextDouble();
    }
    public static double LerEntrada(String entrada, double min, double max) {
        double valor;
        while (true) {
            System.out.println(entrada);
            valor = sc.nextDouble();
            if (valor >= min && valor <= max) {
                break;
            }
            System.out.println("Entre um valor entre " + min + " e " + max);
        }
        return valor;
    }
}
