package main.java.tree;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Jornada jornada = new Jornada();

        Habilidade raiz = jornada.criarArvore();


        Scanner scanner = new Scanner(System.in);


        int opcao;


        do {

            System.out.println("\n=== ARVORE DE HABILIDADES ===\n");

            exibirArvore(raiz, 0);


            System.out.println("\nDigite o ID da habilidade para desbloquear:");
            System.out.println("0 - Sair");


            opcao = scanner.nextInt();


            if (opcao != 0) {

                Habilidade habilidade = buscarPorId(raiz, opcao);


                if (habilidade == null) {

                    System.out.println("Habilidade não encontrada!");

                } else {

                    if (habilidade.isAtiva()) {

                        System.out.println(
                            "Essa habilidade já está desbloqueada."
                        );

                    } else if (habilidade.desbloquear()) {

                        System.out.println(
                            "Habilidade desbloqueada: "
                            + habilidade.getNome()
                        );

                    } else {

                        System.out.println(
                            "Nao foi possivel desbloquear. "
                            + "Desbloqueie primeiro: "
                            + habilidade.getPai().getNome()
                        );

                    }
                }
            }


        } while (opcao != 0);


        scanner.close();

    }



    // Busca recursiva pelo ID
    public static Habilidade buscarPorId(Habilidade atual, int id) {


        if (atual.getId() == id) {
            return atual;
        }


        for (Habilidade filho : atual.getFilhos()) {

            Habilidade encontrada = buscarPorId(filho, id);


            if (encontrada != null) {
                return encontrada;
            }
        }


        return null;
    }



    public static void exibirArvore(Habilidade habilidade, int nivel) {

        String espaco = "    ".repeat(nivel);


        String status = habilidade.isAtiva()
                ? "[ATIVA]"
                : "[BLOQUEADA]";


        System.out.println(
                espaco + status +
                " [ID:" + habilidade.getId() + "] "
                + habilidade.getNome()
        );
        System.out.println(
                espaco + "    Professor: " + habilidade.getProfessor()
        );


        if (habilidade.getPai() == null) {

            System.out.println(
                    espaco + "    Pai: Nenhum"
            );

        } else {

            System.out.println(
                    espaco + "    Pai: "
                    + habilidade.getPai().getNome()
            );
        }


        if (!habilidade.getFilhos().isEmpty()) {

            System.out.println(
                    espaco + "    Filhos:"
            );


            for (Habilidade filho : habilidade.getFilhos()) {

                exibirArvore(filho, nivel + 1);

            }
        }
    }
}