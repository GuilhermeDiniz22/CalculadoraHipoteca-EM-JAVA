public class Main {
    public static void main(String[] args) {
        int quantidade = (int) Console.LerEntrada("Quantidade para financiar: ", 1000, 1_000_000);
        float JurosAnuais = (float) Console.LerEntrada("Taxa de Juros anual entre 1 e 30: ", 1, 30);
        byte anos = (byte) Console.LerEntrada("Periodo de financiamento (Anos) entre 1 e 30: ", 1, 30);
        var calc = new CalcularHipoteca(quantidade, JurosAnuais, anos);

        new printHipoteca(calc).printHipoteca();
        new printHipoteca(calc).printPagamentos();

    }

}
