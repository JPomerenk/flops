package ferons_fire.FLOPS;

import java.util.ArrayList;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.state.*;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;

public class GamePlayState extends BasicGameState{

	// set a basic stateID, will be overridden in constructor 
	private int stateID = 0;
	
	// area for declaring variables
	Image block;
	ArrayList<Image> grid = new ArrayList<Image>();
		
	public GamePlayState(int stateID)
	{
		this.stateID = stateID;
	}
	
	public int getID()
	{
		return stateID;
	}
	
	public void init(GameContainer gc, StateBasedGame sb)
	throws SlickException
	{
		// initialize variables here, such as images, ect, ('loading')
		for(int i=0; i<10;i++)
		{
			grid.add(new Image("res/Empty.png"));
		}
	}
	
	public void render(GameContainer gc, StateBasedGame sb, Graphics g)
	throws SlickException
	{
		// method for drawing or 'render'ing
		for(Image i : grid)
		{
			i.draw(grid.indexOf(i) * 24, grid.indexOf(i) * 24);
		}
	}

	@Override
	public void update(GameContainer arg0, StateBasedGame arg1, int arg2)
			throws SlickException {
		// TODO Auto-generated method stub
		
	}
}
