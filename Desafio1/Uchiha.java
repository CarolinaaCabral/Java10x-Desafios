package NivelIntermediario.Desafios.Desafio1;

public class Uchiha extends Ninja {
    String habilidadeEspecial;


    @Override
    public void mostrarInformacoes() {
        super.mostrarInformacoes();
        System.out.println("Habilidade Especial: " + habilidadeEspecial);
        System.out.println("=============================");
    }
}
