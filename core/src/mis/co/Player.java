package mis.co;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;

public class Player {
    int teclaMover;
    Texture img;
    int posX;

    public Player(int teclaMover, Texture img) {
        this.teclaMover = teclaMover;
        this.img = img;
    }



    void mover(){
        if (Gdx.input.isKeyPressed(teclaMover)) {
            posX++;
        }
        if (Gdx.input.isKeyPressed(teclaMover)) {
            posX++;
        }
        if (Gdx.input.isKeyPressed(teclaMover)) {
            posX++;
        }
    }

    public int getPosX() {
        return posX;
    }
}
