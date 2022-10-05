package javacore.CsobreCargaMetodos.FmodificadoreStatico.domain;

public class Anime {
    private String nome;
    private static int [] episodeos ;
    static {
        System.out.println("Dentro do bloco inicialização");
        episodeos = new int[100];
        for (int i = 0; i < episodeos.length ; i++) {
            episodeos[i] = i+1;
        }
    }
    public Anime(String nome) {
        this.nome = nome;
    }
    public Anime() {

        for (int episodio : Anime.episodeos){
            System.out.print(episodio + " ");
        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodeos() {
        return episodeos;
    }
}