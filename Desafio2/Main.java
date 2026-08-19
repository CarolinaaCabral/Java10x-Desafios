package Desafio2;

public class Main {
    public static void main(String[] args) {
        NinjaBasico rocklee = new NinjaBasico("Rock Lee", 16, TipoHabilidade.TAIJUTSU);
        rocklee.mostrarInformacoes();
        rocklee.executarHabilidade();

        NinjaAvancado kakashi = new NinjaAvancado(
                "Kakashi Hatake",
                26, TipoHabilidade.NINJUTSU,
                "Copiar ninjutsus usando o Sharingan");
        kakashi.mostrarInformacoes();
        kakashi.executarHabilidade();
    }
}
