package mis.co;

public class Comprobador {

    public boolean comprobarChoque(Player anuel, Bot bot) {
        if (anuel.posX + anuel.width <= bot.posX || bot.posX + bot.width <= anuel.posX || anuel.posY + anuel.height <= bot.posY || bot.posY + bot.height <= anuel.posY) {
            return false;
        }
        return true;
    }
}
