package game;

import java.util.Scanner;

public class Game {
    Scanner sc = new Scanner(System.in);
    public void hud(){
        String playerName;
        do {
            System.out.println("Seja bem-vindo! \nNos informe o seu nickname: ");
            playerName = sc.nextLine();
        } while (playerName == null);

        System.out.println(playerName + " acorda. O que deseja fazer? \n1 - Ir à floresta" +
                "\n2 - Ir à loja \n3 - Descansar \n4 - Logout");
        int input = sc.nextInt();

        switch (input){
            case 1:
                /*
                 * O player poderá escolher se ele irá para direita, esquerda ou em frente.
                 * Deve ser gerado aleatoriamente o que virá a seguir variando entre baú e uma quantidade
                 * de monstros que deve variar até 5. Quanto mais ele andar, mais forte serão os monstros.
                 * Após 10 salas, deve vir um Boss.
                 * */
                break;

            case 2:
                // Seria interessante colocar um contador de quantas vezes o player veio à loja e dependendo disso, mudar o diálogo.
                System.out.println("Olá " + playerName + ", fique a vontade para olhar os itens... ");
                System.out.println("Itens disponíveis: 1 - Poção de cura \n2 - Poção de mana \n3 Espada de aço \n 4 - Sair");
                int inputCompra = sc.nextInt();
                do {
                    if (inputCompra == 1){

                    } else if (inputCompra == 2) {

                    } else if (inputCompra == 3) {

                    } else if (inputCompra == 4) {
                        System.out.println("Fique a vontade para voltar quando quiser.");
                    }
                    else {
                        System.out.println("Opção inválida");
                    }

                } while (inputCompra != 4);
        }


    }

}
