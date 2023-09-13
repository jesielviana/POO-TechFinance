import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente("Cliente 1", "99999999", LocalDate.now(), new Conta("123", "01"));

        System.out.println(cliente.getConta().saldo);

        cliente.getConta().deposita(100);
        cliente.getConta().deposita(200);
        cliente.getConta().saque(50);

        System.out.println(cliente.getConta().saldo);

        System.out.println("##### Extrato ######");
        System.out.println(cliente.getNome());
        cliente.getConta().exibeExtrato();

    }
}