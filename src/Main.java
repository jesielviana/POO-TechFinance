public class Main {
    public static void main(String[] args) {

        Conta conta = new Conta("123", "01");

        System.out.println(conta.saldo);

        conta.deposita(100);
        conta.deposita(200);
        conta.saque(50);

        System.out.println(conta.saldo);

        conta.exibeExtrato();

//        System.out.println(conta.historicoTransacoes);
    }
}