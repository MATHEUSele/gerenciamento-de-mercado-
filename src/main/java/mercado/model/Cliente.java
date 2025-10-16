package mercado.model;

public class Cliente {
    private String nome;
    private int cpf;
    private String email;

    public Cliente(int cpf, String email, String nome) {
        this.cpf = cpf;
        this.email = email;
        this.nome = nome;
    }

    public Cliente(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
