package main.java.tree;

public class Jornada {


    public Habilidade criarArvore() {

        // Raiz da árvore
        Habilidade raiz = new Habilidade(
                1,
                "Ingressar no IFRN",
                "Instituicao",
                "O aluno finalmente descobriu onde fica a sala de aula. A aventura começa."
        );


        // Primeiro nível
        Habilidade cafeinado = new Habilidade(
                2,
                "O Cafeinado",
                "Trilha da Determinacao",
                "O café torna-se seu combustível oficial. Caminho da determinação."
        );


        Habilidade talentoso = new Habilidade(
                3,
                "O Talentoso",
                "Trilha da Confianca",
                "O aluno demonstra facilidade para aprender. Caminho da confianca."
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
                "Oratoria Perfeita",
                "Prof. Alexandre",
                "O aluno domina a arte da comunicacao. Aumenta o poder de apresentacoes e seminarios."
        );


        // Terceiro nível - Ramo pensador nato
        Habilidade andreza = new Habilidade(
                6,
                "Eu faco meu proprio estagio",
                "Prof. Andreza",
                "O aluno abre sua propria empresa e cria oportunidades em vez de procura-las."
        );


        Habilidade daniel = new Habilidade(
                7,
                "Sem piscar",
                "Prof. Daniel",
                "Resolve desafios sem hesitar. O tempo de resolucao de problemas é reduzido."
        );


        // Terceiro nível - Ramo Oratoria
        Habilidade valerio = new Habilidade(
                8,
                "Quase uma IA",
                "Prof. Valerio",
                "A inteligencia aumenta drasticamente, permitindo analisar problemas complexos em segundos."
        );


        Habilidade marcelao = new Habilidade(
                9,
                "Eu nao preciso disso",
                "Prof. Marcelao",
                "Todo conhecimento adquirido torna-se mais eficiente. Todas as habilidades recebem +2 de nivel."
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