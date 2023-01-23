package mis.co;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class MainGlobitos extends ApplicationAdapter {
	SpriteBatch batch;

	Bot bot;
	Player anuel;


	@Override
	public void create () {
		batch = new SpriteBatch();

		anuel = new Player(Input.Keys.D, new Texture("sprite.png"));

		bot = new Bot(100, 100, new Texture("badlogic.jpg"));
	}

	@Override
	public void render () {

		bot.mover();


		ScreenUtils.clear(1, 1, 1, 1);
		batch.begin();
		bot.render(batch);
		batch.end();
	}
}
