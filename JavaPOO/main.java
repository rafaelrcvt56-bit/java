public class main{

    public static void main(String[] args){

        deposito conta = new deposito();
        sacar saque = new sacar();

        conta.depositar(1000);
        

        saque.saldo = conta.saldo;

        saque.sacar(300);
        
    }
}