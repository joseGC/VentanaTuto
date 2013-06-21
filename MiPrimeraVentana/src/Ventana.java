import javax.swing.JFrame;


public class Ventana extends JFrame{
	int Ancho = 500;
	int Alto = 500;
	
	public Ventana() {
		// TODO Auto-generated constructor stub
		this.setTitle("Nombre de la ventana");
		this.setSize(Ancho,Alto);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
