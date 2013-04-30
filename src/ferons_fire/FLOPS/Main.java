package ferons_fire.FLOPS;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.*;

public class Main extends StateBasedGame{

	// define stateID for all states
	private final static int GAME_PLAY_STATE = 1;
	
	// variables for game settings, such as height, width, fullscreen, ect
	private final static int SCREEN_HEIGHT = 600;
	private final static int SCREEN_WIDTH = 800;
	
	public Main()
	{
		// super constructor, passing name of program
		super("FLOPS");

		// add all states here then use enterState to choose which state
		// to start the game in
		this.addState(new GamePlayState(GAME_PLAY_STATE));
		this.enterState(GAME_PLAY_STATE);
	}
	
	public void initStatesList(GameContainer gc) throws SlickException {
		this.getState(GAME_PLAY_STATE).init(gc,  this);
	}
	
	public static void main(String args[]) throws SlickException
	{
		try{
			AppGameContainer app = new AppGameContainer(new Main());
			
			// set display 
			app.setDisplayMode(SCREEN_WIDTH, SCREEN_HEIGHT, false);
			app.start();
		} catch (SlickException e) {
			e.printStackTrace();
		}
	}
}
