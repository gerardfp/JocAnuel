package mis.co;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Player {
    int u,d,l,r;
    Texture img;
    int posX, posY;


    public Player(int u, int d, int l, int r, Texture img, int posX, int posY) {
        this.u = u;
        this.d = d;
        this.l = l;
        this.r = r;
        this.img = img;
        this.posX = posX;
        this.posY = posY;
    }

    void mover(){
        if (Gdx.input.isKeyPressed(u)) {
            posY++;
        }
        if (Gdx.input.isKeyPressed(d)) {
            posY--;
        }
        if (Gdx.input.isKeyPressed(l)) {
            posX--;
        }
        if (Gdx.input.isKeyPressed(r)) {
            posX++;
        }
    }

    void render(SpriteBatch batch){
        batch.draw(img, posX, posY, 40, 40);
    }
}
