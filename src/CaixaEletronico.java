public class CaixaEletronico {
    public static void main(String[] args) {
        Cliente cli1 = new Cliente();
        cli1.setNome("José da Silva");

        Conta cc = new ContaCorrente(cli1);
        Conta cp = new ContaPoupanca(cli1);

        cc.depositar(100);
        cc.transferir(10, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}
