package game;

import java.lang.reflect.Array;
import game.Monster;

public class Player {
    String nome;
    int maxHp;
    int currentHp;
    int maxMana;
    int currentMana;
    int damage;

//Implementar: double coins, método de compra subtraindo o valor total de coins
// Verificação se o hp zerou durante o combate


    public Player(String nome, int maxHp, int currentHp, int maxMana, int currentMana, int damage) {
        this.nome = nome;
        this.maxHp = maxHp;
        this.currentHp = currentHp;
        this.maxMana = maxMana;
        this.currentMana = currentMana;
        this.damage = damage;

    }

    public void  damageCaused(Monster monster){
        int hpDoMonstro = monster.getCurrentHp();
        int newMonsterHp = hpDoMonstro - this.damage;
        monster.setCurrentHp(newMonsterHp);
    }

    public void  sofrerDano(Monster monster){
        int danoDoMonstro = monster.getDamage();
        int newPlayerHp = this.currentHp - danoDoMonstro;
        setCurrentHp(newPlayerHp);
    }


        public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMaxHp() {
        return maxHp;
    }

    public void setMaxHp(int maxHp) {
        this.maxHp = maxHp;
    }

    public int getCurrentHp() {
        return currentHp;
    }

    public void setCurrentHp(int currentHp) {
        this.currentHp = currentHp;
    }

    public int getMaxMana() {
        return maxMana;
    }

    public void setMaxMana(int maxMana) {
        this.maxMana = maxMana;
    }

    public int getCurrentMana() {
        return currentMana;
    }

    public void setCurrentMana(int currentMana) {
        this.currentMana = currentMana;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}


