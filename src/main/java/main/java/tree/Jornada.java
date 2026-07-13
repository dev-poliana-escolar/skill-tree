package main.java.tree;

public class Jornada {


    public Habilidade criarArvore() {

        // Raiz da árvore
        Habilidade raiz = new Habilidade(
                1,
                "Ingressar no IFRN",
                "Instituição",
                "O aluno finalmente descobriu onde fica a sala de aula. A aventura comeca."
        );


        // Primeiro nível
        Habilidade cafeinado = new Habilidade(
                2,
                "O Cafeinado",
                "Trilha da Determinacao",
                "O cafe torna-se seu combustivel oficial. Caminho da determinacao."
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
                "Lucia (Pensador nato)",
                "Prof. Lucia",
                "Desenvolve telepatia para prever as perguntas da prova."
        );


        Habilidade oratoria = new Habilidade(
                5,
                "Alexandre (Oratoria perfeita)",
                "Prof. Alexandre",
                "O aluno domina a arte da comunicacao. Aumenta o poder de apresentacoes e seminarios."
        );


        // Terceiro nível - Ramo Lucia
        Habilidade andreza = new Habilidade(
                6,
                "Andreza (Eu faco meu proprio estagio)",
                "Prof. Lucia",
                "O aluno abre sua propria empresa e cria oportunidades em vez de procura-las."
        );


        Habilidade daniel = new Habilidade(
                7,
                "Daniel (Sem piscar)",
                "Prof. Lucia",
                "Resolve desafios sem hesitar. O tempo de resolucao de problemas e reduzido."
        );


        // Terceiro nível - Ramo Alexandre
        Habilidade valerio = new Habilidade(
                8,
                "Valerio (Quase uma IA)",
                "Prof. Alexandre",
                "A inteligencia aumenta drasticamente, permitindo analisar problemas complexos em segundos."
        );


        Habilidade marcelao = new Habilidade(
                9,
                "Marcelao (Eu nao preciso disso)",
                "Prof. Alexandre",
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
        
        // =========================
// Bloco 2
// =========================

// Segundo nível - Ramo Cafeinado

        Habilidade jurandy = new Habilidade(
                10,
                "Jurandy (Eu sou a velocidade)",
                "Prof. Jurandy",
                "Patins academicos aumentam a velocidade de locomocao pelo campus."
        );

        Habilidade givas = new Habilidade(
                11,
                "Givas (O mago)",
                "Prof. Givas",
                "Tarefas do cotidiano parecem muito mais faceis gracas ao dominio da logica."
        );


        // Terceiro nível - Ramo Jurandy

        Habilidade diego = new Habilidade(
                12,
                "Diego (Presenca onipresente)",
                "Prof. Jurandy",
                "Uma vez a cada duas semanas, sua presenca e registrada mesmo sem comparecer a sala."
        );

        Habilidade tadeu = new Habilidade(
                13,
                "Tadeu (Como um computador)",
                "Prof. Jurandy",
                "O aluno processa varias tarefas ao mesmo tempo, aumentando drasticamente sua eficiencia."
        );


        // Terceiro nível - Ramo Givas

        Habilidade higor = new Habilidade(
                14,
                "Higor (Nada me afeta)",
                "Prof. Givas",
                "O aluno torna-se imune aos efeitos da preguica e da procrastinacao."
        );

        Habilidade marcelinho = new Habilidade(
                15,
                "Marcelinho (Banco vivo)",
                "Prof. Givas",
                "Todo conhecimento adquirido e armazenado permanentemente."
        );


        // Ligações da árvore

        cafeinado.adicionarFilho(jurandy);
        cafeinado.adicionarFilho(givas);

        jurandy.adicionarFilho(diego);
        jurandy.adicionarFilho(tadeu);

        givas.adicionarFilho(higor);
        givas.adicionarFilho(marcelinho);
        


        return raiz;
    }
}