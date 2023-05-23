package Pacote2;

import java.util.InputMismatchException;

import Pacote3.Acelerador;
import Pacote3.Autenticador;
import Pacote3.Carro;
import Pacote3.Motorista;

public class App {
    public static void main(String[] args) throws Exception {
        /* Limpa o terminal */
        System.out.print("\033[H\033[2J");
        System.out.flush();
        /* Limpa o terminal */

        Acelerador[] aceleradores = new Acelerador[3];
        Motorista mot = new Motorista("João", 2345);

        aceleradores[0] = new Carro("ABC1234", 23454, mot);
        aceleradores[1] = new Carro("DEF4321", 23454, new Motorista("Maria", 634634));
        aceleradores[2] = mot;

        for (Acelerador a : aceleradores) {
            System.out.printf("Chamada do método em objeto do tipo %s", a.getClass().getSimpleName());
            System.out.printf(" - Velocidade atual: %d\n", a.acelerar());
        }

        Autenticador aut = new Autenticador();
        mot.setCpf("1234567890");
        if (aut.autenticar(mot)) {
            System.out.println("ACESSO AUTORIZADO");
        } else {
            System.out.println("ACESSO NÃO AUTORIZADO");
        }

        Carro car = new Carro("ABC1234", 1234, mot);
        if (aut.autenticar(car)) {
            System.out.println("ACESSO AUTORIZADO");
        } else {
            System.out.println("ACESSO NÃO AUTORIZADO");
        }

    }
}
