package Tarefa4;

public class FuncionarioTI {
    private String nome;
    private int matricula;

    public FuncionarioTI(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
    }

    public void atualizarCadastro(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
        System.out.println("Cadastro atualizado.");
    }
}

