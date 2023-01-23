package mis.co;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Bot {
    int posX, posY;
    Texture textura;

    public Bot(int posX, int posY, Texture textura) {
        this.posX = posX;
        this.posY = posY;
        this.textura = textura;
    }


    void mover(){
        posX++;
        posY++;


    }

    void render(SpriteBatch batch){
        batch.draw(textura, posX, posY);
    }
}
