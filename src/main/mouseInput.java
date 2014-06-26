package main;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import main.Game.STATE;

public class mouseInput implements MouseListener
{
	
	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) 
	{
		int mx = e.getX();
		int my = e.getY();
		//public Rectangle button0 = new Rectangle(Game.WIDTH / 2 + 120, 150, 200, 50);
		//public Rectangle button1 = new Rectangle(Game.WIDTH / 2 + 120, 225, 200, 50);
		//public Rectangle button2 = new Rectangle(Game.WIDTH / 2 + 120, 300, 200, 50);
		//public Rectangle button3 = new Rectangle(Game.WIDTH / 2 + 120, 375, 200, 50);
		//public Rectangle button4 = new Rectangle(Game.WIDTH / 2 + 120, 450, 200, 50);
		//public Rectangle button5 = new Rectangle(Game.WIDTH / 2 + 120, 525, 200, 50);
		
		//button0 button test
		if(mx >= Game.WIDTH / 2 + 120 && mx <= Game.WIDTH /2 + 320)
		{
			if(my >= 150 && my <= 200)
			{
				//pressed play button
				Game.state = STATE.GAME;
			}
		}
		//button1 button test
		if(mx >= Game.WIDTH / 2 + 120 && mx <= Game.WIDTH /2 + 320)
		{
			if(my >= 225 && my <= 275)
			{
				//pressed play button
				Game.state = STATE.GAME;
			}
		}
		//button2 button test
		if(mx >= Game.WIDTH / 2 + 120 && mx <= Game.WIDTH /2 + 320)
		{
			if(my >= 300 && my <= 350)
			{
				//pressed play button
				Game.state = STATE.GAME;
			}
		}
		//button3 button test
		if(mx >= Game.WIDTH / 2 + 120 && mx <= Game.WIDTH /2 + 320)
		{
			if(my >= 375 && my <= 425)
			{
				//pressed play button
				Game.state = STATE.GAME;
			}
		}
		//button4 button test
		if(mx >= Game.WIDTH / 2 + 120 && mx <= Game.WIDTH /2 + 320)
		{
			if(my >= 450 && my <= 500)
			{
				//pressed play button
				Game.state = STATE.GAME;
			}
		}
		//button5 button test
		if(mx >= Game.WIDTH / 2 + 120 && mx <= Game.WIDTH /2 + 320)
		{
			if(my >= 525 && my <= 575)
			{
				//pressed play button
				System.exit(1);
			}
		}
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
