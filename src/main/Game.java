package main;

import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import javax.swing.JFrame;

public class Game extends Canvas implements Runnable
{
	private static final long serialVersionUID = 1L;
	public static final int WIDTH = 512, HEIGHT = 384, SCALE = 2;
	public static boolean running = false;
	public static boolean ladyDialog = false;
	public static boolean ladyDialog2 = false;
	public static int dialogBool=0;
	public Thread gameThread;
	public static  JFrame frame;
	
	private enum STATE
	{
		MENU,
		GAME
	}
	private STATE state0 = STATE.MENU;
	private STATE state1 = STATE.GAME;
	

	public void init()
	{
		
	}
	
	public synchronized void start()
	{
		if(running)return;
		running = true;
		gameThread = new Thread(this);
		gameThread.start();
	}
	
	public synchronized void stop()
	{
		if(!running)return;
		running = false;
		try {
			gameThread.join();
		} catch (InterruptedException e) {e.printStackTrace();}
	}
	
		
	public void run()
	{
		init();
		long lastTime = System.nanoTime();
		final double amountOfTicks = 60D;
		double ns = 1000000000 / amountOfTicks;
		double delta = 0;
		
		while(running)
		{
			long now = System.nanoTime();
			delta += (now - lastTime) / ns;
			lastTime = now;
			if(delta >= 1)
			{
				tick();
				delta--;
			}
			render();
		}
		stop();
	}
	
	public void tick()
	{
		if(state0 == STATE.GAME)
		{
			
		}
	}
	
	public void render()
	{
		BufferStrategy bs = this.getBufferStrategy();
		if(bs == null)
		{
			createBufferStrategy(3);
			return;
		}
		Graphics g = bs.getDrawGraphics();
		
		//RENDER HERE
		g.fillRect(0, 0, WIDTH * SCALE, HEIGHT * SCALE);
		if(state0 == STATE.GAME)
		{
			
		}
		
		//END RENDER
		bs.show();
		g.dispose();
	}


	public static void main(String[] args) 
	{
		Game game = new Game();
		game.setPreferredSize(new Dimension(WIDTH * SCALE, HEIGHT * SCALE));
		game.setMaximumSize(new Dimension(WIDTH * SCALE, HEIGHT * SCALE));
		game.setMinimumSize(new Dimension(WIDTH * SCALE, HEIGHT * SCALE));
		frame = new JFrame("Realm Jumper");
		frame.setBounds(400, 100, WIDTH * SCALE, HEIGHT * SCALE);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.add(game);
		frame.setVisible(true);
		game.start();
	}
}

