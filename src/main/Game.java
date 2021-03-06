package main;

import gamePack.gtx.Background;
import gamePack.gtx.ImageLoader;

import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import menuPack.MainMenu;

public class Game extends Canvas implements Runnable
{
	private static final long serialVersionUID = 1L;
	public static final int WIDTH = 512, HEIGHT = 384, SCALE = 2;
	public static boolean running = false;
	public static int dialogBool=0;
	public Thread gameThread;
	public static  JFrame frame;
	static ImageIcon ico = new ImageIcon("res//icon.png");
	public MainMenu mMenu;
	public ImageLoader loader;
	public static CurrentMenu currMenu;
	public CurrentMouseListen currMouse;
	private Background mMenuBack;
	public static boolean btn0Click, btn1Click, btn2Click, btn3Click, btn4Click;
	
	public static BufferedImage background1;
	
	
	public static enum STATE
	{
		MENU,
		GAME
	};
	
	public static STATE state = STATE.MENU;
	

	public void init()
	{
		ImageLoader loader = new ImageLoader();
		mMenu = new MainMenu();
		currMenu = mMenu;
		background1 = loader.load("/mMenuBack.png");
		this.addMouseListener(new MenuMouseInput());
		
		mMenuBack = new Background(background1);
		
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
		if(state == STATE.MENU)
		{
			currMenu.tick();
			
		}
		else if(state == STATE.GAME)
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
		if(state == STATE.MENU)
		{
			mMenuBack.render(g);
			currMenu.render(g);
			
		}
		else if(state == STATE.GAME)
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
		frame = new JFrame("Wasteland");
		frame.setBounds(400, 100, WIDTH * SCALE, HEIGHT * SCALE);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setIconImage(ico.getImage());
		frame.add(game);
		frame.setVisible(true);
		game.start();
	}
}

