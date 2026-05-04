public class Departamento {

    private String nomeDepartamento;
    private Funcionario[] funcionarios;
    private int contador;

    public Departamento(String nomeDepartamento) {
        this.nomeDepartamento = nomeDepartamento;
        funcionarios = new Funcionario[5];
        contador = 0;
    }

    public void adicionarFuncionario(Funcionario f) {
        if (contador < 5) {
            funcionarios[contador] = f;
            contador++;
        } else {
            System.out.println("Departamento lotado. Não é possível adicionar mais funcionários.");
        }
    }

    public void listarFuncionarios() {
        System.out.println("Departamento: " + nomeDepartamento);

        for (int i = 0; i < contador; i++) {
            funcionarios[i].exibirDados();
        }
    }

    public double calcularFolhaSalarial() {
        double soma = 0;

        for (int i = 0; i < contador; i++) {
            if (funcionarios[i].isAtivo()) {
                soma = soma + funcionarios[i].getSalario();
            }
        }

        return soma;
    }
}