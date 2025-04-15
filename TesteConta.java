public class TesteConta {
    
public static void main(String[] args) {
    
    Conta conta = new Conta("12345", 1000.0, 0.05);

        conta.setNumero("12345");
        conta.setSaldo(1000.0);
        conta.setTaxa(10.0);
    
        System.out.println("\n\t\t\t Conta \n");
    conta.imprimirConta();

    }

    

}
