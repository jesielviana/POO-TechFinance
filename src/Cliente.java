import java.time.LocalDate;

public class Cliente {
    private String nome; // private, -(default) protected, public
    private String cpf;
    private LocalDate dataNascimento;
    private Conta conta;

    public Cliente(String nome, String cpf, LocalDate dataNascimento, Conta conta) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.conta = conta;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Conta getConta() {
        return this.conta;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }
}
