package gamePack.gtx;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Background {
	
		
		private BufferedImage background;
		
		public Background(BufferedImage background)
		{
			this.background = background;
		}
		
		public  BufferedImage getBackground()
		{
			return background;
		}
		
		public void render(Graphics g)
		{
			g.drawImage(background, 0, 0, null);
			
		}


}
