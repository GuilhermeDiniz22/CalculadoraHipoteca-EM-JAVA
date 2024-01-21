import java.text.NumberFormat;

public class printHipoteca {

    private final NumberFormat currencyInstance;
    private CalcularHipoteca calculadoraHipoteca; //injeção da classe calculadoraHipoteca

    public printHipoteca(CalcularHipoteca calculadoraHipoteca) {
        this.calculadoraHipoteca = calculadoraHipoteca;
        currencyInstance = NumberFormat.getCurrencyInstance();
    }

    public void printPagamentos() {
        System.out.println();
        System.out.println("PAGAMENTOS");
        System.out.println("--------");
        for(double balanco : calculadoraHipoteca.getBalanco()){
            System.out.println(currencyInstance.format(balanco));
        }
    }

    public void printHipoteca() {
        double hipoteca = calculadoraHipoteca.CalcularHipoteca();
        String hipotecaFormatada = currencyInstance.format(hipoteca);
        System.out.println();
        System.out.println("HIPOTECA");
        System.out.println("--------");
        System.out.println("Valor mensal da Hipoteca: " + hipotecaFormatada);
    }
}
