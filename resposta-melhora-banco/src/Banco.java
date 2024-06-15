import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Banco {

    private String nome;
    private List<Conta> contas;

    public Banco(String nome) {
        this.contas = new ArrayList<>();
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

    // Métodos do Banco para ordenar e exibir as Contas com base no Nome do Cliente em ordem alfabética

    public void adicionarContaNoBanco (Conta conta) {
        contas.add(conta);
    }

    // Método para ordenar as contas pelo nome do cliente
    public List<Conta> ordenarPorNomeCliente() {
        List<Conta> ordenadaNomeCliente = new ArrayList<>(contas);
        ordenadaNomeCliente.sort(Comparator.comparing(c -> c.getCliente().getNome()));
        return ordenadaNomeCliente;
    }

    // Método para exibir as contas ordenadas pelo nome do cliente
    public void exibirContasPorNomeCliente() {
        List<Conta> contasOrdenadas = ordenarPorNomeCliente(); // Utilize a lista ordenada
        System.out.println("============CONTAS DO BANCO: " + this.getNome() + "=================");
        for (Conta conta : contasOrdenadas) {
            System.out.println("Conta: " + conta.getNumero() + ", Titular da conta: " + conta.getCliente().getNome() +
                    ", Saldo: " + conta.getSaldo());
        }
    }

}