
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Ventana {
public static void main(String[] args) {

		JFrame frame = new JFrame();
		JLabel label = new JLabel();
		label.setText("Hola soy una Label");
		
	
		frame.add(label);
		frame.setTitle("Mi primera ventana");
		frame.setSize(800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);



	}
}