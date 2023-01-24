package mis.co;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

import java.util.ArrayList;
import java.util.List;

public class MainGlobitos extends ApplicationAdapter {
	SpriteBatch batch;
	Player anuel;
	Comprobador comprobador;
	List<Bot> bots = new ArrayList<>();

	@Override
	public void create () {
		batch = new SpriteBatch();
		comprobador = new Comprobador();
		anuel = new Player(
				Input.Keys.W,
				Input.Keys.S,
				Input.Keys.A,
				Input.Keys.D,
				new Texture("sprite.png"),
				100,
				100);

		for (int i = 0; i < 5; i++) {
			bots.add(new Bot(i*100, i*100, new Texture("badlogic.jpg")));
		}
	}


	void update(){
		// bots.forEach(bot -> bot.mover());
		anuel.mover();


		bots.removeIf(bot -> comprobador.comprobarChoque(anuel, bot));

	}


	@Override
	public void render () {
		update();


		ScreenUtils.clear(1, 1, 1, 1);
		batch.begin();
		anuel.render(batch);
		bots.forEach(bot -> bot.render(batch));
		batch.end();
	}
}
