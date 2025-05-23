public class Poupanca extends Conta {

    private double juros;

    @Override

    void imprimirConta() {
        System.out.println("Numero: " + getNumero());
        System.out.println("Saldo: " + getSaldo());
        System.out.printf("Taxa: %.2f\n", getTaxa());
        System.out.printf("Juros: %.2f\n", juros);
        System.out.printf("Saldo com juros: %.2f\n", calcularSaldo());
    }

    public Poupanca(String numero, double saldo, double taxa, double juros) {
        super(numero, saldo, taxa); 
        this.juros = juros;         
    }

    public Poupanca() {
        super("", 0.0, 0.0); 
        this.juros = 0.0;   
    }

    public double getJuros() {
        return juros;
    }

    public void setJuros(double juros) {
        this.juros = juros;
    }

    @Override
    public double calcularSaldo() {
        return super.calcularSaldo() * (1 + getJuros() / 100);
    }

    @Override
    public String getNumero() {
        return super.getNumero();
    }

    @Override
    public double getSaldo() {
        return super.getSaldo();
    }

    @Override
    public double getTaxa() {
        return super.getTaxa();
    }
    
    
}