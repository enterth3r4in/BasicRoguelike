package net.ccgames.rl;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

import asciiPanel.AsciiPanel;
import net.ccgames.rl.screen.Screen;
import net.ccgames.rl.screen.ScreenMainMenu;
import net.ccgames.rl.utility.MenuColoring;

public class MainApplication extends JFrame implements KeyListener
{
	private static final long serialVersionUID = -7012735746570763680L;
	private static final int WIDTH = 120;
	private static final int HEIGHT = 40;
	AsciiPanel terminal;
	Screen screen;
	
	public MainApplication()
	{
		super();
		terminal = new AsciiPanel(WIDTH, HEIGHT);
		add(terminal);
		pack();
		screen = new ScreenMainMenu();
		addKeyListener(this);
		repaint();
	}
	
	public static void main(String[] args)
	{
		MainApplication application = new MainApplication();
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.setVisible(true);
		application.setLocationRelativeTo(null);
	}
	
	public void repaint()
	{
		terminal.clear();
		terminal.setDefaultForegroundColor(MenuColoring.menuColor);
		screen.displayOutput(terminal);
		super.repaint();		
	}
	
	

	@Override
	public void keyPressed(KeyEvent ke)
	{
		screen = screen.respondToUserInput(ke);
		repaint();
	}

	@Override
	public void keyReleased(KeyEvent arg0) {}

	@Override
	public void keyTyped(KeyEvent arg0) {}
}
