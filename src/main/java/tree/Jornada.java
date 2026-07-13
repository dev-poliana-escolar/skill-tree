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
                "O café torna-se seu combustível oficial. Caminho da determinação."
        );


        Habilidade talentoso = new Habilidade(
                3,
                "O Talentoso",
                "Trilha da Confiança",
                "O aluno demonstra facilidade para aprender. Caminho da confiança."
        );


        // Segundo nível
        Habilidade pensador = new Habilidade(
                4,
                "Pensador Nato",
                "Prof. Lucia",
                "Desenvolve telepatia para prever as perguntas da prova."
        );


        Habilidade oratoria = new Habilidade(
                5,
                "Oratória Perfeita",
                "Prof. Alexandre",
                "O aluno domina a arte da comunicação. Aumenta o poder de apresentações e seminários."
        );


        // Terceiro nível - Ramo Lucia
        Habilidade andreza = new Habilidade(
                6,
                "Andreza",
                "Prof. Lucia",
                "O aluno abre sua própria empresa e cria oportunidades em vez de procurá-las."
        );


        Habilidade daniel = new Habilidade(
                7,
                "Daniel",
                "Prof. Lucia",
                "Resolve desafios sem hesitar. O tempo de resolução de problemas é reduzido."
        );


        // Terceiro nível - Ramo Alexandre
        Habilidade valerio = new Habilidade(
                8,
                "Valerio",
                "Prof. Alexandre",
                "A inteligência aumenta drasticamente, permitindo analisar problemas complexos em segundos."
        );


        Habilidade marcelao = new Habilidade(
                9,
                "Marcelão",
                "Prof. Alexandre",
                "Todo conhecimento adquirido torna-se mais eficiente. Todas as habilidades recebem +2 de nível."
        );



        // Criando os relacionamentos da árvore 

        raiz.adicionarFilho(cafeinado);
        raiz.adicionarFilho(talentoso);

        talentoso.adicionarFilho(pensador);
        talentoso.adicionarFilho(oratoria);
        
        // Bloco 1 

        pensador.adicionarFilho(andreza);
        pensador.adicionarFilho(daniel);

        oratoria.adicionarFilho(valerio);
        oratoria.adicionarFilho(marcelao);


        // A raiz começa desbloqueada
        raiz.desbloquear();


        // Bloco 2: Habilidade (Jurandy, Diego, Tadeu, Givas, Higor, Marcelinho)
        


        return raiz;
    }
}