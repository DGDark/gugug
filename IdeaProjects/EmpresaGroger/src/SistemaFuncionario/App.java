package SistemaFuncionario;

public class App {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario(
            "bruno","3475853-2",
                200000,
                0
        );
        Gerente gerente = new Gerente(
                "Jefferson",
                "547587584",
                20000,
                1,
                10
                );

        System.out.println(gerente.bonificacao(gerente.salario));
        System.out.println(funcionario.bonificacao(funcionario.salario));

        gerente.teste();
        gerente.teste("Jerfferson");
        gerente.teste("Jerfersson", "Jorge");
    }
}
