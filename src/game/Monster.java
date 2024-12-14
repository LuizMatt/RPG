package game;
import game.Player;
public class Monster {
    String nome;
    int maxHp;
    int currentHp;
    int maxMana;
    int currentMana;
    int damage;

    public Monster(String nome, int maxHp, int currentHp, int maxMana, int currentMana, int damage) {
        this.nome = nome;
        this.maxHp = maxHp;
        this.currentHp = currentHp;
        this.maxMana = maxMana;
        this.currentMana = currentMana;
        this.damage = damage;
    }

    public void damageCaused(Player player) {
        int playerHp = player.getCurrentHp();
        int newPlayerHp = playerHp - this.damage;
        setCurrentHp(newPlayerHp);
    }

    public void  sofrerDano(Player player){
        int danoDoPlayer = player.getDamage();
        int newMonsterHp = this.currentHp - danoDoPlayer;
        setCurrentHp(newMonsterHp);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCurrentHp() {
        return currentHp;
    }

    public void setCurrentHp(int currentHp) {
        this.currentHp = currentHp;
    }

    public int getMaxHp() {
        return maxHp;
    }

    public void setMaxHp(int maxHp) {
        this.maxHp = maxHp;
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
