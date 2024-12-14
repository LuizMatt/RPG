package game;

import java.util.Random;
import java.util.Scanner;

public class Map {
    Player player;
    Monster monster;
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    // Combate → Escolher direção;
    // Criar um array que tenha o inventário do ‘player’;
    public void chest(){
        String[] itensBau = {"Espada de ferro", "Escudo", "Armadura de ferro"};
        String item = itensBau[random.nextInt()];
        System.out.println("Você achou um(a) " + item);
    }

    public void combat(){
        while (player.getCurrentHp() > 0 || monster.getCurrentHp() > 0){
            System.out.println("Ações: \n1 - Atacar \n2 - Usar item \n 3 - Fugir");
            int inputCombat = scanner.nextInt();
            if (inputCombat == 1){
                player.damageCaused(monster);
                monster.damageCaused(player);
            } else if (inputCombat == 2) {
                System.out.println("Qual item deseja usar? ");
                // Print o inventário do ‘player’ + opção de sair que volta ao menu de combate.
            } else if (inputCombat == 3) {
                int chanceDeFuga = random.nextInt(4);
                if (chanceDeFuga % 2 == 0){
                    System.out.println(player.getNome() + " conseguiu fugir");
                    // Levar para o Hud
                } else {
                    System.out.println(player.getNome() + " não conseguiu fugir");

                }
            }
        }
    }

    }


