import java.awt.Graphics;
import java.awt.Polygon;

import javax.swing.JPanel;
//A abstract class that the question provide.
public abstract class AbstractDrawFunction extends JPanel {

	private Polygon p = new Polygon();

	protected AbstractDrawFunction() {
		drawFunction();
	}

	abstract double f(double x);

	public void drawFunction() {
		for (int x = -100; x <= 100; x++) {
			p.addPoint(x + 200, 200 - (int) f(x));
		}
	}

	@Override
	protected void paintComponent(Graphics g) {

	}

}
