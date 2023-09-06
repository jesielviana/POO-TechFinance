import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Conta {
    String numero;
    String agencia;
    double saldo;

    List<Transacao> historicoTransacoes;

    public Conta(String numero, String agencia){
        this.numero = numero;
        this.agencia = agencia;
        this.historicoTransacoes = new ArrayList<>();
    }

    public void deposita(double valor){
        this.saldo += valor;
        addHistoricoTransacao(valor, "Deposito");
    }

    public boolean saque(double valor){
        if(this.saldo >= valor){
            this.saldo -= valor;
            addHistoricoTransacao(valor*-1, "Saque");
            return true;
        }else{
            return false;
        }
    }

    public void exibeExtrato(){
        System.out.println("####### Extrato #########");
        historicoTransacoes.forEach(t -> System.out.println(t));
        System.out.println("Saldo atual: " + this.saldo);
        System.out.println("################");
    }

    private void addHistoricoTransacao(double valor, String tipo){
        Transacao t = new Transacao(LocalDate.now(), valor, tipo);
        historicoTransacoes.add(t);
    }




}
