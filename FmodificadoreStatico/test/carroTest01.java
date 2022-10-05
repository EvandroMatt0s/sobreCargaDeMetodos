package javacore.CsobreCargaMetodos.FmodificadoreStatico.test;

import javacore.CsobreCargaMetodos.FmodificadoreStatico.domain.Carro;

public class carroTest01 {
    public static void main(String[] args) {
      Carro c1 = new Carro("BMW",280);
      Carro c2 = new Carro("Mercedes",275);
      Carro c3 = new Carro("Audi",290);

      Carro.setVelocidadeLimite(360);

      c1.imprime();
      c2.imprime();
      c3.imprime();

    }
}
