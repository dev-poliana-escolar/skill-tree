
# skill-tree

Um painel onde os jogadores desbloqueiam habilidades, sendo que habilidades avançadas dependem do desbloqueio de habilidades anteriores.

O projeto simula a jornada acadêmica de um aluno do IFRN como uma **árvore de habilidades** (skill tree), no estilo de árvores de talento de RPG: cada habilidade só pode ser desbloqueada se sua habilidade pré-requisito (o "pai" na árvore) já estiver ativa.

## Tecnologias utilizadas

- **Java**
- **IDE: Apache NetBeans**

## Autores / Integrantes

- Maria Poliana
- Matheus Eduardo
- Rainara Duarte

## Estrutura do projeto

```
src/main/java/tree/
├── Habilidade.java   # Nó da árvore (id, nome, professor, descrição, pai, filhos)
├── Jornada.java      # Monta a árvore completa de habilidades (criarArvore)
└── Main.java         # Interface em modo texto (console)
```

### Como funciona

- Cada `Habilidade` guarda uma referência ao seu `pai` e uma lista de `filhos`.
- `desbloquear()` só ativa a habilidade se ela **não tiver pai** (é a raiz) ou se o **pai já estiver ativo**.
- `Jornada.criarArvore()` instancia todas as habilidades e conecta pais e filhos via `adicionarFilho()`.
- `Main.java` exibe a árvore inteira no terminal, pede o `id` de uma habilidade e tenta desbloqueá-la, mostrando mensagem de sucesso ou indicando qual pré-requisito falta.

## Árvore de habilidades

```
[1] Ingressar no IFRN (raiz, começa desbloqueada)
 ├── [2] O Cafeinado — Caminho da Determinação
 │     ├── [10] Eu sou a velocidade — Prof. Jurandy
 │     │     ├── [12] Presença onipresente — Prof. Diego
 │     │     └── [13] Como um computador — Prof. Tadeu
 │     └── [11] O mago — Prof. Givas
 │           ├── [14] Nada me afeta — Prof. Higor
 │           └── [15] Banco vivo — Prof. Marcelinho
 └── [3] O Talentoso — Caminho da Confiança
      ├── [4] Pensador Nato — Prof. Lucia
      │     ├── [6] Eu faço meu próprio estágio — Prof. Andreza
      │     └── [7] Sem piscar — Prof. Daniel
      └── [5] Oratória Perfeita — Prof. Alexandre
            ├── [8] Quase uma IA — Prof. Valerio
            └── [9] Eu não preciso disso — Prof. Marcelão
```

## Descrição de cada habilidade

| Id | Habilidade | Professor | Descrição |
|---|---|---|---|
| 1 | Ingressar no IFRN | Instituição (raiz) | O aluno finalmente descobriu onde fica a sala de aula. A aventura começa. |
| 2 | O Cafeinado | Trilha da Determinação | O café torna-se seu combustível oficial. Caminho da determinação. |
| 3 | O Talentoso | Trilha da Confiança | O aluno demonstra facilidade para aprender. Caminho da confiança. |
| 4 | Pensador Nato | Prof. Lucia | Desenvolve telepatia para prever as perguntas da prova. |
| 5 | Oratória Perfeita | Prof. Alexandre | O aluno domina a arte da comunicação. Aumenta o poder de apresentações e seminários. |
| 6 | Eu faço meu próprio estágio | Prof. Andreza | O aluno abre sua própria empresa e cria oportunidades em vez de procurá-las. |
| 7 | Sem piscar | Prof. Daniel | Resolve desafios sem hesitar. O tempo de resolução de problemas é reduzido. |
| 8 | Quase uma IA | Prof. Valerio | A inteligência aumenta drasticamente, permitindo analisar problemas complexos em segundos. |
| 9 | Eu não preciso disso | Prof. Marcelão | Todo conhecimento adquirido torna-se mais eficiente. Todas as habilidades recebem +2 de nível. |
| 10 | Eu sou a velocidade | Prof. Jurandy | Patins acadêmicos aumentam a velocidade de locomoção pelo campus. |
| 11 | O mago | Prof. Givas | Tarefas do cotidiano parecem muito mais fáceis graças ao domínio da lógica. |
| 12 | Presença onipresente | Prof. Diego | Uma vez a cada duas semanas, sua presença é registrada mesmo sem comparecer à sala. |
| 13 | Como um computador | Prof. Tadeu | O aluno processa várias tarefas ao mesmo tempo, aumentando drasticamente sua eficiência. |
| 14 | Nada me afeta | Prof. Higor | O aluno torna-se imune aos efeitos da preguiça e da procrastinação. |
| 15 | Banco vivo | Prof. Marcelinho | Todo conhecimento adquirido é armazenado permanentemente. |

## Funcionalidades implementadas

- **Exibição hierárquica** da árvore inteira no terminal, mostrando status (`[ATIVA]`/`[BLOQUEADA]`), id, nome, professor e pai/filhos de cada habilidade.
- **Percurso** recursivo em pré-ordem (`exibirArvore`).
- **Busca** por id (`buscarPorId`), usada para localizar a habilidade que o usuário quer desbloquear.
- **Desbloqueio** interativo, com verificação de pré-requisito: só desbloqueia se o pai já estiver ativo (ou se for a raiz).

## Como clonar, compilar e rodar no NetBeans

### 1. Clonar o repositório

Pelo terminal (Git precisa estar instalado):

```bash
git clone https://github.com/dev-poliana-escolar/skill-tree.git
```

Ou direto pelo próprio NetBeans:

1. Menu **Team → Remote → Clone...**
2. Cole a URL: `https://github.com/dev-poliana-escolar/skill-tree.git`
3. Escolha a pasta local de destino e clique em **Next → Finish**.
4. Quando o NetBeans perguntar se deseja abrir o projeto clonado, clique em **Open Project**.

### 2. Abrir o projeto (se já tiver clonado por fora)

1. Menu **File → Open Project...**
2. Navegue até a pasta `skill-tree` (a que contém a pasta `src` e o `build.xml`/`nbproject`).
3. Selecione a pasta e clique em **Open Project**.
4. O projeto aparece no painel **Projects**, à esquerda, com o pacote `main.java.tree` contendo `Habilidade.java`, `Jornada.java` e `Main.java`.

### 3. Compilar

- Clique com o botão direito no projeto (painel **Projects**) → **Clean and Build**.
- Ou use o atalho **Shift+F11**.
- O NetBeans compila tudo automaticamente usando o `build.xml` do Ant já incluso no projeto.

### 4. Executar

- Clique com o botão direito em `Main.java` (dentro do pacote `main.java.tree`) → **Run File**.
- Ou selecione `Main.java` e use o atalho **Shift+F6**.
- O menu interativo aparece na aba **Output**, na parte inferior da tela.

> **Importante:** antes de digitar o `id` para desbloquear, clique dentro da janela de **Output** para dar foco a ela. Sem isso, o `Scanner` não recebe o que você digitar e o programa parece "travado".

## Exemplo de uso

```
=== ARVORE DE HABILIDADES ===

[ATIVA] [ID:1] Ingressar no IFRN
    Professor: Instituicao
    Pai: Nenhum
    Filhos:
    [BLOQUEADA] [ID:2] O Cafeinado
        Professor: Trilha da Determinacao
        Pai: Ingressar no IFRN
        ...

Digite o ID da habilidade para desbloquear:
0 - Sair
> 3

Habilidade desbloqueada: O Talentoso
```

> obs: `Habilidade` guarda uma `descricao`, mas o console hoje mostra apenas Professor e Pai/Filhos. 

Tentando pular uma etapa (sem desbloquear o pré-requisito antes):

```
Digite o ID da habilidade para desbloquear:
0 - Sair
> 6

Não é possível desbloquear. Desbloqueie primeiro: Pensador Nato
```

## Roteiro de teste manual

Digite os ids nesta ordem para validar as regras de pré-requisito:

| Passo | Id digitado | Resultado esperado |
|---|---|---|
| 1 | `3` (O Talentoso) | Desbloqueia (pai = raiz, já ativa) |
| 2 | `6` (Eu faço meu próprio estágio) | **Bloqueada** — pai (Pensador Nato) ainda inativo |
| 3 | `4` (Pensador Nato) | Desbloqueia (pai = O Talentoso, ativo no passo 1) |
| 4 | `6` (Eu faço meu próprio estágio) | Desbloqueia agora |
| 5 | `10` (Eu sou a velocidade) | **Bloqueada** — depende de "O Cafeinado" (id 2), ainda fechado |
| 6 | `2` (O Cafeinado) | Desbloqueia (pai = raiz) |
| 7 | `10` (Eu sou a velocidade) e `11` (O mago) | Desbloqueiam agora |
| 8 | `12`, `13`, `14`, `15` | Desbloqueiam, pois seus pais (Jurandy/Givas) já estão ativos |

Se o comportamento acima se confirmar, a árvore está correta.
