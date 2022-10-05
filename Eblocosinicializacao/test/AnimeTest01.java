package javacore.CsobreCargaMetodos.Eblocosinicializacao.test;

import javacore.CsobreCargaMetodos.Eblocosinicializacao.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
       // 1 - alocado espaco em memoria pro objeto
        // 2- Cada atributo de calsse é criado e inicializado com valores default ou quer passada
        // 3 - Bloco de inicialização é executado
        // 4 - Construtor é execultado


        Anime anime = new Anime();

        for (int episodeo : anime.getEpisodeos()) {
        System.out.print(episodeo + " ");
        }


    }
}
