import javax.swing.JFrame;

public class GameWindow {
	public static final int WIDTH = 500;
	public static final int HEIGHT = 500;
  JFrame window;
  GamePanel mypanel;
  public static void main(String[] args) {
	GameWindow x = new GameWindow();
}
GameWindow(){
	window = new JFrame();
	mypanel = new GamePanel();
	window.add(mypanel);
	window.setVisible(true);
	window.setSize(WIDTH, HEIGHT);
	window.setDefaultCloseOperation(window.EXIT_ON_CLOSE);
	
	
	
  
}
}
