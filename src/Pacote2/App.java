package Pacote2;

import java.util.InputMismatchException;

import Pacote3.Carro;
import Pacote3.Motorista;

public class App {
    public static void main(String[] args) throws Exception {
        /* Limpa o terminal */
        System.out.print("\033[H\033[2J");
        System.out.flush();
        /* Limpa o terminal */

        Motorista mot = new Motorista("Leandro", 123456);
        Carro carro = new Carro(mot);
        try {
            carro.setPlaca(null);
            
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
            System.out.println("Programa encerrado!");
            return;
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
            System.out.println("O programa continuará com a placa ABC1234");
            carro.setPlaca("ABC1234");
        }

        carro.setNumChassi(012012301234);
        System.out.println("PASSAGEIRO: Motorista, acelera o carro até 100Km/h!");
        System.out.println("MOTORISTA: Ok! Vamos lá!");
        carro.getMotorista().acelerar(100);

        System.out.printf("Velocidade do carro: %s km/h", carro.getVelocidadeAtual());
    }
}
