package Tarefa4;

public class AdministradorRede extends FuncionarioTI {
    private String certificacao;
    private String sistemaOperacionalResponsavel;

    public AdministradorRede(String nome, int matricula, String certificacao, String sistemaOperacionalResponsavel) {
        super(nome, matricula);
        this.certificacao = certificacao;
        this.sistemaOperacionalResponsavel = sistemaOperacionalResponsavel;
    }

    public void monitorarRede() {
        System.out.println("Monitorando rede em " + sistemaOperacionalResponsavel + "...");
    }

    public void realizarBackup() {
        System.out.println("Backup realizado com base na certificação " + certificacao);
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Certificação: " + certificacao);
        System.out.println("Sistema Operacional Responsável: " + sistemaOperacionalResponsavel);
    }
}

