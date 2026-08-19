package Desafio2;

public class NinjaBasico implements Ninja {
    String nome;
    int idade;
    TipoHabilidade habilidade;

    public NinjaBasico(String nome, int idade, TipoHabilidade habilidade) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
    }

    public NinjaBasico(String s) {
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("=== Informações Ninja ===");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }

    @Override
    public void executarHabilidade() {
        System.out.println("Habilidade: " + habilidade);
        System.out.println("==========================");
    }

}
