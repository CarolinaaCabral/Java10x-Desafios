package NivelIntermediario.Desafios.Desafio1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Ninja> listaNinjas = new ArrayList<>();

        System.out.println("=== Seja Bem Vindo(a) ao Gerenciador de Ninjas ===");

        while (true) {
            System.out.println("Selecione uma opção abaixo");
            System.out.println("1 - Exibir informações de ninjas");
            System.out.println("2 - Adicionar novo ninja");
            System.out.println("3 - Remover ninja");
            System.out.println("4 - Atualizar informações de ninja");
            System.out.println("5 - Encerrar gerenciador de ninjas");

            System.out.print("Digite número de opção: ");
            int opcao = input.nextInt();
            input.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("=== Lista de Ninjas ===");

                    if (listaNinjas.isEmpty()) {
                        System.out.println("Nenhum ninja foi encontrado");
                        System.out.println();
                    } else {
                        for (Ninja ninja : listaNinjas) {
                            ninja.mostrarInformacoes();
                        }
                    }
                    break;

                case 2:
                    System.out.println("=== Adicionar Novo Ninja ===");
                    System.out.println("Deseja cadastrar: ");
                    System.out.println("1 - Ninja Comum");
                    System.out.println("2 - Ninja Uchiha");
                    System.out.print("Digite número da opção: ");
                    int tipoNinja = input.nextInt();
                    input.nextLine();

                    System.out.print("Nome do Ninja: ");
                    String nome = input.nextLine();

                    System.out.print("Idade: ");
                    int idade = input.nextInt();
                    input.nextLine();

                    System.out.print("Missão: ");
                    String missao = input.nextLine();

                    System.out.print("Nível de dificuldade de missão: ");
                    String nivelDificuldade = input.nextLine();

                    System.out.print("Status de missão: ");
                    String statusMissao = input.nextLine();

                    if (tipoNinja == 1) {
                        Ninja novoNinja = new Ninja();
                        novoNinja.nome  = nome;
                        novoNinja.idade = idade;
                        novoNinja.missao = missao;
                        novoNinja.nivelDificuldade = nivelDificuldade;
                        novoNinja.statusMissao = statusMissao;

                        listaNinjas.add(novoNinja);
                        System.out.println("=== Ninja adicionada com sucesso! ===");
                    } else if (tipoNinja == 2) {
                        Uchiha novoUchiha = new Uchiha();
                        novoUchiha.nome  = nome;
                        novoUchiha.idade = idade;
                        novoUchiha.missao = missao;
                        novoUchiha.nivelDificuldade = nivelDificuldade;
                        novoUchiha.statusMissao = statusMissao;

                        System.out.print("Habilidade especial: ");
                        String habilidadeEspecial = input.nextLine();

                        novoUchiha.habilidadeEspecial = habilidadeEspecial;

                        listaNinjas.add(novoUchiha);
                        System.out.println("=== Uchiha adicionada com sucesso! ===");
                    } else {
                        System.out.println("Tipo de ninja inválido! Cadastro cancelado");
                    }

                    break;

                case 3:
                    System.out.println("=== Remoção de Ninja ===");
                    System.out.println("Nome do ninja a ser removido: ");
                    String nomeNinjaRemovido = input.nextLine();

                    Ninja ninjaEncontrado = null;

                    for (Ninja ninja : listaNinjas) {
                        if (ninja.nome.equalsIgnoreCase(nomeNinjaRemovido)) {
                            ninjaEncontrado = ninja;
                            break;
                        }
                    }
                    if (ninjaEncontrado != null) {
                        listaNinjas.remove(ninjaEncontrado);
                        System.out.println("Ninja " + ninjaEncontrado.nome + " removido com sucesso!");
                    } else {
                        System.out.println("Ninja " + nomeNinjaRemovido + "não encontrado!");
                    }

                    break;

                case 4:
                    System.out.println("=== Atualização de Habilidades Especiais ===");
                    System.out.println("Nome do ninja: ");
                    String nomeNinjaAtualizado = input.nextLine();

                    Ninja ninjaAtualizado = null;

                    for (Ninja ninja : listaNinjas) {
                        if (ninja.nome.equalsIgnoreCase(nomeNinjaAtualizado)) {
                             ninjaAtualizado = ninja;
                             break;

                        }
                    }

                    if (ninjaAtualizado != null) {
                        if (ninjaAtualizado instanceof Uchiha) {
                            Uchiha uchiha = (Uchiha) ninjaAtualizado;


                             System.out.print("Nova Habilidade Especial: ");
                             uchiha.habilidadeEspecial = input.nextLine();
                             System.out.println(ninjaAtualizado.nome + " atualizado com sucesso!");
                        } else {
                            System.out.println("O ninja " + ninjaAtualizado.nome + " não é um Uchiha");
                        }
                    }
                    break;

                case 5:
                    System.out.println("=== Encerrando Gerenciador de Ninjas ===");
                    input.close();
                    return;
            }
        }
    }
}
