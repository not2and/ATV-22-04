public class TestePoupanca {

    public static void main(String[] args) {
        
        Poupanca poupanca = new Poupanca();

        poupanca.setNumero("54321");
        poupanca.setSaldo(1000.0);
        poupanca.setTaxa(10.0);
        poupanca.setJuros(0.5);

        System.out.println("\n\t\t\t Poupança \n");
        poupanca.imprimirConta();

    }

}