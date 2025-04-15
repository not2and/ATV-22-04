public class Conta {
    
private String numero;
private double saldo;
private double taxa;

    void imprimirConta() {
        System.out.println("Numero: " + numero);
        System.out.println("Saldo: " + saldo);
        System.out.printf("Taxa: %.2f\n", taxa);
        System.out.printf("Saldo com taxa: %.2f\n", calcularSaldo());
    }

    public double calcularSaldo() {
        return saldo * (1 - taxa / 100);

    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    Conta(String numero, double saldo, double taxa) {
        
        this.numero = numero;
        this.saldo = saldo;
        this.taxa = taxa;
    }

}