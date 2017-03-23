import javax.swing.JFrame;

public class LeagueInvaders {

	JFrame frame;
	int frameHeight = 800;
	int frameWidth = 500;

	public static void main(String[] args) {

		new LeagueInvaders();
	}

	public LeagueInvaders() {
		frame = new JFrame();
		frame.setSize(frameWidth, frameHeight);
		setup();
	}

	public void setup() {
		frame.setVisible(true);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	}
}
