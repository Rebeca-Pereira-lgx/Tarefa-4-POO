package Tarefa4;


public class Main {
    public static void main(String[] args) {
        Desenvolvedor dev = new Desenvolvedor("Rebeca", 123, "Java", "Sênior");
        AdministradorRede admin = new AdministradorRede("Andrya", 456, "Cisco CCNA", "Linux");

        System.out.println("=== Desenvolvedor ===");
        dev.exibirDados();
        dev.desenvolverProjeto();
        dev.revisarCodigo();
        dev.exibirTecnologiasUsadas();

        System.out.println("\n=== Administrador de Rede ===");
        admin.exibirDados();
        admin.monitorarRede();
        admin.realizarBackup();
    }
}
