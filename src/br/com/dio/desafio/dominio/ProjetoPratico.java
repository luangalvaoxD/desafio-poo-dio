package br.com.dio.desafio.dominio;

public class ProjetoPratico extends Conteudo {

    private int dificuldade; // 1 a 5

    @Override
    public double calcularXp() {
        return XP_PADRAO * dificuldade * 2;
    }

    public ProjetoPratico() {
    }

    public int getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(int dificuldade) {
        this.dificuldade = dificuldade;
    }

    @Override
    public String toString() {
        return "ProjetoPratico{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", dificuldade=" + dificuldade +
                '}';
    }
}
