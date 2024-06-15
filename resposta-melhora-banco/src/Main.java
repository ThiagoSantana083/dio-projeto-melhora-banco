public class Main {

    public static void main(String[] args) {
        // Criando um Cliente
        Cliente venilton = new Cliente();
        venilton.setNome("Venilton");
        // Criando contas corrente e poupança pro cliente
        Conta cc = new ContaCorrente(venilton);
        Conta poupanca = new ContaPoupanca(venilton);

        Cliente abraao = new Cliente();
        abraao.setNome("Abraao");
        // Criando contas corrente e poupança pro cliente
        Conta cA = new ContaCorrente(abraao);
        Conta pA = new ContaPoupanca(abraao);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        // Criando outras contas correntes e poupanças
        Cliente aabsalao = new Cliente();
        aabsalao.setNome("Aabsalao");
        Conta cAA = new ContaCorrente(aabsalao);
        Conta pAA = new ContaPoupanca(aabsalao);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

        // Criando um Banco
        Banco santander = new Banco("Santander");
        santander.adicionarContaNoBanco(cc);
        santander.adicionarContaNoBanco(cA);
        santander.adicionarContaNoBanco(cAA);
        santander.ordenarPorNomeCliente();
        santander.exibirContasPorNomeCliente();
    }

}