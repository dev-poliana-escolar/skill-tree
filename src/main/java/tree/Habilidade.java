package main.java.tree;

import java.util.ArrayList;
import java.util.List;

// Classe que representa cada Nó da árvore de habilidades
class Habilidade {  
    private int id;
    private String nome;
    private String professor;
    private String descricao;
    private boolean ativa;

    private Habilidade pai;
    private List<Habilidade> filhos;


    public Habilidade(int id, String nome, String professor, String descricao) {
        this.id = id;
        this.nome = nome;
        this.professor = professor;
        this.descricao = descricao;
        this.ativa = false;
        this.filhos = new ArrayList<>();
    }


    public void adicionarFilho(Habilidade habilidade) {
        habilidade.pai = this;
        filhos.add(habilidade);
    }

    public boolean desbloquear() {

        // Se não tem pai, é a raiz e pode ser ativada
        if (pai == null) {
            ativa = true;
            return true;
        }

        // Verifica se o pai está desbloqueado
        if (pai.isAtiva()) {
            ativa = true;
            return true;
        }


        return false;
    }

    public int getId() {
        return id;
    }


    public String getNome() {
        return nome;
    }


    public String getProfessor() {
        return professor;
    }


    public String getDescricao() {
        return descricao;
    }


    public boolean isAtiva() {
        return ativa;
    }


    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }


    public Habilidade getPai() {
        return pai;
    }


    public List<Habilidade> getFilhos() {
        return filhos;
    }
}