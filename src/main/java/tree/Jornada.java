package main.java.tree;

public class Jornada {


    public Habilidade criarArvore() {


        // Raiz da árvore
        Habilidade raiz = new Habilidade(
                1,
                "Ingressar no IFRN",
                "Instituição",
                "O aluno finalmente descobriu onde fica a sala de aula. A aventura começa."
        );


        // Primeiro nível
        Habilidade cafeinado = new Habilidade(
                2,
                "O Cafeinado",
                "Trilha da Determinação",
                "O café torna-se seu combustível oficial."
        );


        Habilidade talentoso = new Habilidade(
                3,
                "O Talentoso",
                "Trilha da Confiança",
                "O aluno demonstra facilidade para aprender."
        );


        // Segundo nível
        Habilidade pensador = new Habilidade(
                4,
                "Pensador Nato",
                "Prof. Lucia",
                "Desenvolve telepatia para prever perguntas da prova."
        );


        Habilidade oratoria = new Habilidade(
                5,
                "Oratória Perfeita",
                "Prof. Alexandre",
                "Domina a arte da comunicação e apresentações."
        );



        // Criando os relacionamentos da árvore
        
        raiz.adicionarFilho(cafeinado);
        raiz.adicionarFilho(talentoso);

        talentoso.adicionarFilho(pensador);
        talentoso.adicionarFilho(oratoria);



        return raiz;
    }
}