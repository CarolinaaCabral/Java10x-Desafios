package Desafios.Desafio1;

public class Ninja {
    String nome;
    int idade;
    String missao;
    String nivelDificuldade;
    String statusMissao;


    public void mostrarInformacoes() {
        System.out.println("=== Informações do Ninja ===");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Missao: " + missao);
        System.out.println("Nivel dificuldade: " + nivelDificuldade);
        System.out.println("Status: " + statusMissao);
        System.out.println("=============================");
    }


}
