package Tarefa4;

public class Desenvolvedor extends FuncionarioTI {
    private String linguagemPrincipal;
    private String nivel; // Júnior, Pleno, Sênior

    public Desenvolvedor(String nome, int matricula, String linguagemPrincipal, String nivel) {
        super(nome, matricula);
        this.linguagemPrincipal = linguagemPrincipal;
        this.nivel = nivel;
    }

    public void desenvolverProjeto() {
        System.out.println("Desenvolvendo projeto em " + linguagemPrincipal + "...");
    }

    public void atualizarProjeto() {
        System.out.println("Projeto atualizado.");
    }

    public void exibirTecnologiasUsadas() {
        System.out.println("Tecnologia principal: " + linguagemPrincipal);
    }

    public void revisarCodigo() {
        System.out.println("Revisando código como desenvolvedor " + nivel + "...");
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Linguagem Principal: " + linguagemPrincipal);
        System.out.println("Nível: " + nivel);
    }
}

