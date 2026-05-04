public class Funcionario {

    private String nome;
    private String cpf;
    private String cargo;
    private double salario;
    private boolean ativo;

    public Funcionario(String nome, String cpf, String cargo, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.cargo = cargo;
        this.salario = salario;
        this.ativo = true;
    }

    public Funcionario() {
        this.nome = "Indefinido";
        this.cpf = "000.000.000-00";
        this.cargo = "Indefinido";
        this.salario = 0.0;
        this.ativo = false;
    }

    public void alterarDados(String nome, String cpf, String cargo, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.cargo = cargo;
        this.salario = salario;
    }

    public void aplicarReajuste(double percentual) {
        salario = salario + (salario * percentual / 100);
    }

    public void demitir() {
        ativo = false;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public double getSalario() {
        return salario;
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salario: " + salario);

        if (ativo) {
            System.out.println("Status: ATIVO");
        } else {
            System.out.println("Status: INATIVO");
        }

        System.out.println("------------------");
    }
}