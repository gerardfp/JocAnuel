package mis.co;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.util.Random;

public class Bot {
    Texture textura;
    Random random = new Random();

    float posX, posY;
    float velX = 1;
    float accX = 0.05f;
    int width = 20;
    int height = 20;

    public Bot(int posX, int posY, Texture textura) {
        this.posX = posX;
        this.posY = posY;
        this.textura = textura;
    }


    void mover(){
        if (random.nextInt(100) == 0) {
            velX = velX * -1;
        }
        if (random.nextInt(100) == 0) {
            accX = accX * -1;
        }

        posX = posX + velX;
        velX = velX + accX;

    }

    void render(SpriteBatch batch){
        batch.draw(textura, posX, posY, width, height);
    }
}
