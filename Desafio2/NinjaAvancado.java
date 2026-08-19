package Desafio2;

public class NinjaAvancado extends NinjaBasico implements Ninja {
    String especialidade;

    public NinjaAvancado(String nome, int idade, TipoHabilidade habilidade, String especialidade) {
        super(nome, idade, habilidade);
        this.especialidade = especialidade;
    }

    @Override
    public void mostrarInformacoes() {
        super.mostrarInformacoes();
        System.out.println("Especiabilidade: " + especialidade);
    }

    @Override
    public void executarHabilidade() {
        super.executarHabilidade();
    }

}
