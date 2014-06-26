package main;

import java.awt.event.MouseEvent;

import main.Game.STATE;

public interface CurrentMouseListen
{
	public void mouseClicked(MouseEvent arg0);
	public void mouseEntered(MouseEvent arg0);
	public void mouseExited(MouseEvent arg0);
	public void mousePressed(MouseEvent e);
	public void mouseReleased(MouseEvent arg0);
}
