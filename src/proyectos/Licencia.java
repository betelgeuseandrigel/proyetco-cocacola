package proyectos;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class Licencia extends JFrame implements ActionListener, ChangeListener{

	private JLabel label1, label2;
	private JCheckBox check1;
	private JButton boton1, boton2;
	private JScrollPane scrollpane1;
	private JTextArea textarea1;
	String nombre = "";
	
	public Licencia() {
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Licencia de uso");
		setIconImage(new ImageIcon(getClass().getResource("/media/icono2.png")).getImage());
		Bienvenida ventanaBienvenida = new Bienvenida();
		nombre = ventanaBienvenida.texto;
		
		label1 = new JLabel("Termino y condiciones");
		label1.setBounds(215,5,200,30);
		label1.setFont(new Font("Andale Mono", 1, 18));
		label1.setForeground(new Color(0,0,0));
		add(label1);
		
		textarea1 = new JTextArea();
		textarea1.setEditable(false);
		textarea1.setFont(new Font("Andale Mono", 0, 12));
		textarea1.setText("\n\n        TERMINOS Y CONDICIONES"
				+ "\n\n        A.  PROHIBIDA SU VENTA 0 DISTRIBUCION SIN AUTORIZACION DE COCA-COLA."
				+ "\n        B. PROHIBIDA LA ALTERACION DEL CODIGO FUENTE O DE LA INTERFACES GRAFICAS."
				+ "\n        C. COCA-COLA NO SE HACE RESPONSABLE DE ESTE MAL USO DEL SOFTWARE."
				+ "\n\n     PARA ACEPTAR HAGA CLICK EN (ACEPTO) DE LO CONTRARIO EN (NO ACEPTO.");
		scrollpane1 = new JScrollPane(textarea1);
		scrollpane1.setBounds(10,40,575,200);
		add(scrollpane1);
		
		check1 = new JCheckBox("Yo " + nombre + " acepto");
		check1.setBounds(10,250,290,30);
		check1.addChangeListener(this);
		add(check1);
		
		boton1 = new JButton("Acepto");
		boton1.setBounds(10,290,100,30);
		boton1.addActionListener(this);
		boton1.setEnabled(false);
		add(boton1);
		
		boton2 = new JButton("NO acepto");
		boton2.setBounds(120,290,100,30);
		boton2.addActionListener(this);
		boton2.setEnabled(true);
		add(boton2);
		
		ImageIcon imagen = new ImageIcon(getClass().getResource("/media/CocaCola.jpg"));
		label2 = new JLabel(imagen);
		label2.setBounds(305,220,300,150);
		Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(label2.getWidth(), label2.getHeight(), Image.SCALE_DEFAULT));
		label2.setIcon(icono);
		add(label2);
		
	}
	
	@Override
	public void stateChanged(ChangeEvent e) {
		// TODO Auto-generated method stub
		if(check1.isSelected() == true) {
			boton1.setEnabled(true);
			boton2.setEnabled(false);
		}else{
			boton1.setEnabled(false);
			boton2.setEnabled(true);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == boton1) {
			Principal principal1 = new Principal();
			principal1.setBounds(0,0,700,580);
			principal1.setVisible(true);
			principal1.setResizable(false);
			principal1.setLocationRelativeTo(null);
			this.setVisible(false);
		}else if(e.getSource() == boton2){
			Bienvenida bienvenidos = new Bienvenida();
			bienvenidos.setBounds(0,0,350,500);
			bienvenidos.setVisible(true);
			bienvenidos.setResizable(false);
			bienvenidos.setLocationRelativeTo(null);
			this.setVisible(false);
		}
	}
	
	public static void main(String[] args) {
		Licencia ventanalicencia = new Licencia();
		ventanalicencia.setBounds(0,0,600,390);
		ventanalicencia.setVisible(true);
		ventanalicencia.setResizable(false);
		ventanalicencia.setLocationRelativeTo(null);
	}

}
