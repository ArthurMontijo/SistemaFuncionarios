public class TesteSistema {

    public static void main(String[] args) {

        Departamento dept = new Departamento("Tecnologia da Informação");

        Funcionario f1 = new Funcionario("Arthur", "111.222.333.54", "Desenvolvedor", 3000);
        Funcionario f2 = new Funcionario("Rodrigo", "222.333.444.55", "Analista", 2500);
        Funcionario f3 = new Funcionario("otavio", "333.444.555.56", "Gerente", 5000);
        Funcionario f4 = new Funcionario();

        f4.alterarDados("isa", "444.555.666.57", "Estagiaria", 1200);

        dept.adicionarFuncionario(f1);
        dept.adicionarFuncionario(f2);
        dept.adicionarFuncionario(f3);
        dept.adicionarFuncionario(f4);

        f1.aplicarReajuste(15);

        f3.demitir();

        dept.listarFuncionarios();

        double total = dept.calcularFolhaSalarial();
        System.out.println("Total da folha salarial: " + total);
    }
}