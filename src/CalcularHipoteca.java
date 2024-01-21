public class CalcularHipoteca {
    private final static byte MESES = 12;
    private final static byte PERCENTUAL = 100;
    private int quantidade;
    private float jurosAnuais;
    private byte anos;

    public CalcularHipoteca(int quantidade, float jurosAnuais, byte anos) {
        this.quantidade = quantidade;
        this.jurosAnuais = jurosAnuais;
        this.anos = anos;
    }

    public double[] getBalanco(){
        double[] balancos = new double[getNumeroDePagamentos()];
        for (short mes = 1; mes <= getNumeroDePagamentos(); mes++) {
            double balanco = CalcularBalanco(mes);
            balancos[mes - 1] = balanco;
        }
    return balancos;
    }

    public double CalcularBalanco(short pagamentosRealizados) {
        float taxaMensal = getTaxaMensal();
        float numeroDePagamentos = getNumeroDePagamentos();
        double balanco = quantidade * (Math.pow(1 + taxaMensal, numeroDePagamentos) - Math.pow(1 + taxaMensal, pagamentosRealizados))
                / (Math.pow(1 + taxaMensal, numeroDePagamentos) - 1);

        return balanco;
    }
    public double CalcularHipoteca() {
        float taxaMensal = getTaxaMensal();
        float numeroDePagamentos = getNumeroDePagamentos();
        double hipoteca = quantidade * taxaMensal / (1 - Math.pow(1 + taxaMensal, -numeroDePagamentos));

        return hipoteca;
    }

    private int getNumeroDePagamentos() {
        return anos * MESES;
    }

    private float getTaxaMensal() {
        return jurosAnuais / (PERCENTUAL * MESES);
    }

    public byte getAnos() {
        return anos;
    }

    public byte getMeses() {
        return MESES;
    }
}
