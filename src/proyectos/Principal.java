package proyectos;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Principal extends JFrame implements ActionListener {

	private JMenuBar mb;
	private JMenu menuOpciones, menuCalcular, menuAcercaDe, menuColorDeFondo;
	private JMenuItem miCalculo,miRojo,miNegro,miMorado,miElCreador,miSalir,miNuevo;
	private JLabel labelLogo,labelBienvenido,labelTitle,labelNombre,labelAPaterno,labelAMaterno,
			labelDepartamento,labelAntiguedad,labelResultado,labelfooter;
	private JTextField txtNombreTrabajador,txtAPaternoTrabajador,txtAMaternoTrabajador;
	private JComboBox comboDepartamento,comboAntiguedad;
	private JScrollPane scrollpane1;
	private JTextArea textarea1;
	String nombreAdministrador = "";
	
	public Principal() {
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Pantalla principal");
		getContentPane().setBackground(new Color(255,0,0));
		setIconImage(new ImageIcon(getClass().getResource("/media/icono2.png")).getImage());
		Bienvenida ventanaBienvenida = new Bienvenida();
		nombreAdministrador = ventanaBienvenida.texto;
		
		mb = new JMenuBar();
		mb.setBackground(new Color(255,0,0));
		setJMenuBar(mb);
		
		menuOpciones = new JMenu("Opciones");
		menuOpciones.setBackground(new Color(255,0,0));
		menuOpciones.setFont(new Font("Andale Mono", 1, 14));
		menuOpciones.setForeground(new Color(255,255,255));
		mb.add(menuOpciones);
		
		menuCalcular = new JMenu("Calcular");
		menuCalcular.setBackground(new Color(255,0,0));
		menuCalcular.setFont(new Font("Andale Mono", 1, 14));
		menuCalcular.setForeground(new Color(255,255,255));
		mb.add(menuCalcular);
		
		menuAcercaDe = new JMenu("Acerca de");
		menuAcercaDe.setBackground(new Color(255,0,0));
		menuAcercaDe.setFont(new Font("Andale Mono", 1, 14));
		menuAcercaDe.setForeground(new Color(255,255,255));
		mb.add(menuAcercaDe);
		
		menuColorDeFondo = new JMenu("Color de fondo");
		menuColorDeFondo.setFont(new Font("Andale Mono", 1, 14));
		menuColorDeFondo.setForeground(new Color(255,0,0));
		menuOpciones.add(menuColorDeFondo);
		
		miCalculo = new JMenuItem("Vacaciones");
		miCalculo.setFont(new Font("Andale Mono", 1, 14));
		miCalculo.setForeground(new Color(255,0,0));
		miCalculo.addActionListener(this);
		menuCalcular.add(miCalculo);
		
		miRojo = new JMenuItem("Rojo");
		miRojo.setFont(new Font("Andale Mono", 1, 14));
		miRojo.setForeground(new Color(255,0,0));
		miRojo.addActionListener(this);
		menuColorDeFondo.add(miRojo);
		
		miNegro = new JMenuItem("Negro");
		miNegro.setFont(new Font("Andale Mono", 1, 14));
		miNegro.setForeground(new Color(255,0,0));
		miNegro.addActionListener(this);
		menuColorDeFondo.add(miNegro);
		
		miMorado = new JMenuItem("Morado");
		miMorado.setFont(new Font("Andale Mono", 1, 14));
		miMorado.setForeground(new Color(255,0,0));
		miMorado.addActionListener(this);
		menuColorDeFondo.add(miMorado);
		
		miNuevo = new JMenuItem("Nuevo");
		miNuevo.setFont(new Font("Andale Mono", 1, 14));
		miNuevo.setForeground(new Color(255,0,0));
		miNuevo.addActionListener(this);
		menuOpciones.add(miNuevo);
		
		miElCreador = new JMenuItem("Creador");
		miElCreador.setFont(new Font("Andale Mono", 1, 14));
		miElCreador.setForeground(new Color(255,0,0));
		miElCreador.addActionListener(this);
		menuAcercaDe.add(miElCreador);
		
		miSalir = new JMenuItem("Salir");
		miSalir.setFont(new Font("Andale Mono", 1, 14));
		miSalir.setForeground(new Color(255,0,0));
		miSalir.addActionListener(this);
		menuOpciones.add(miSalir);
		
		ImageIcon imagen = new ImageIcon(getClass().getResource("/media/CocaCola.jpg"));
		labelLogo = new JLabel(imagen);
		labelLogo.setBounds(5,5,250,100);
		Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(labelLogo.getWidth(), labelLogo.getHeight(), Image.SCALE_DEFAULT));
		labelLogo.setIcon(icono);
		add(labelLogo);
		
		labelBienvenido = new JLabel("Bienvenido " + nombreAdministrador);
		labelBienvenido.setBounds(280,30,300,50);
		labelBienvenido.setFont(new Font("Andale Mono", 1, 32));
		labelBienvenido.setForeground(new Color(255,255,255));
		add(labelBienvenido);
		
		labelTitle = new JLabel("Datos del trabajador para el calculo de vacaciones");
		labelTitle.setBounds(45,140,900,25);
		labelTitle.setFont(new Font("Andale Mono", 0, 24));
		labelTitle.setForeground(new Color(255,255,255));
		add(labelTitle);
		
		labelNombre = new JLabel("Nombre completo: ");
		labelNombre.setBounds(25,188,180,25);
		labelNombre.setFont(new Font("Andale Mono", 1, 12));
		labelNombre.setForeground(new Color(255,255,255));
		add(labelNombre);
		
		txtNombreTrabajador = new JTextField();
		txtNombreTrabajador.setBounds(25,213,150,25);
		txtNombreTrabajador.setBackground(new Color(224,224,224));
		txtNombreTrabajador.setFont(new Font("Andale Mono", 1, 14));
		txtNombreTrabajador.setForeground(new Color(255,0,0));
		add(txtNombreTrabajador);
	
		labelAPaterno = new JLabel("Apellido paterno: ");
		labelAPaterno.setBounds(25,248,180,25);
		labelAPaterno.setFont(new Font("Andale Mono", 1, 12));
		labelAPaterno.setForeground(new Color(255,255,255));
		add(labelAPaterno);
		
		txtAPaternoTrabajador = new JTextField();
		txtAPaternoTrabajador.setBounds(25,273,150,25);
		txtAPaternoTrabajador.setBackground(new Color(224,224,224));
		txtAPaternoTrabajador.setFont(new Font("Andale Mono", 1, 14));
		txtAPaternoTrabajador.setForeground(new Color(255,0,0));
		add(txtAPaternoTrabajador);
		
		labelAMaterno = new JLabel("Apellido materno: ");
		labelAMaterno.setBounds(25,308,180,25);
		labelAMaterno.setFont(new Font("Andale Mono", 1, 12));
		labelAMaterno.setForeground(new Color(255,255,255));
		add(labelAMaterno);
		
		txtAMaternoTrabajador = new JTextField();
		txtAMaternoTrabajador.setBounds(25,334,150,25);
		txtAMaternoTrabajador.setBackground(new Color(224,224,224));
		txtAMaternoTrabajador.setFont(new Font("Andale Mono", 1, 14));
		txtAMaternoTrabajador.setForeground(new Color(255,0,0));
		add(txtAMaternoTrabajador);
		
		labelDepartamento = new JLabel("Selecciona el departamento: ");
		labelDepartamento.setBounds(220,188,180,25);
		labelDepartamento.setFont(new Font("Andale Mono", 1, 12));
		labelDepartamento.setForeground(new Color(255,255,255));
		add(labelDepartamento);
		
		comboDepartamento = new JComboBox();
		comboDepartamento.setBounds(220,213,220,25);
		comboDepartamento.setBackground(new Color(224,224,224));
		comboDepartamento.setFont(new Font("Andale Mono", 1, 14));
		comboDepartamento.setForeground(new Color(255,0,0));
		add(comboDepartamento);
		comboDepartamento.addItem("");
		comboDepartamento.addItem("Atencion al cliente");
		comboDepartamento.addItem("Departamento de logistica");
		comboDepartamento.addItem("Departamento de gerencia");
		
		
		labelAntiguedad = new JLabel("Selecciona la antiguedad: ");
		labelAntiguedad.setBounds(220,248,180,25);
		labelAntiguedad.setFont(new Font("Andale Mono", 1, 12));
		labelAntiguedad.setForeground(new Color(255,255,255));
		add(labelAntiguedad);
		
		comboAntiguedad = new JComboBox();
		comboAntiguedad.setBounds(220,273,220,25);
		comboAntiguedad.setBackground(new Color(224,224,224));
		comboAntiguedad.setFont(new Font("Andale Mono", 1, 14));
		comboAntiguedad.setForeground(new Color(255,0,0));
		comboAntiguedad.addItem("");
		comboAntiguedad.addItem("1 año de servicio");
		comboAntiguedad.addItem("2 a 6 años de servicio");
		comboAntiguedad.addItem("7 o mas años de servicio");
		add(comboAntiguedad);
		
		textarea1 = new JTextArea();
		textarea1.setEditable(false);
		textarea1.setBackground(new Color(224,224,224));
		textarea1.setFont(new Font("Andale Mono", 1, 14));
		textarea1.setForeground(new Color(255,0,0));
		textarea1.setText("\n    Aqui aparece el resultado del calculo de las vacaciones");
		scrollpane1 = new JScrollPane(textarea1);
		scrollpane1.setBounds(220,333,600,120);
		add(scrollpane1);
		
		labelfooter = new JLabel("©2017 The Coca-Cola Company | Todos los derechos reservados");
		labelfooter.setBounds(135,455,500,30);
		labelfooter.setFont(new Font("Andale Mono", 1, 15));
		labelfooter.setForeground(new Color(255,255,255));
		add(labelfooter);
		
	}
			
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == miCalculo) {
			
			String nombreTrabajador = txtNombreTrabajador.getText();
			String Ap = txtAPaternoTrabajador.getText();
			String Am = txtAMaternoTrabajador.getText();
			String Departamento = comboDepartamento.getSelectedItem().toString();
			String Antiguedad = comboAntiguedad.getSelectedItem().toString();
			
			if(nombreTrabajador.equals("") || Ap.equals("") || Am.equals("") || Departamento.equals("") || Antiguedad.equals("")) {
				JOptionPane.showMessageDialog(null,"Debes llenar todos los campos");
			}else {
				if(Departamento.equals("Atencion al cliente")) {
					if(Antiguedad.equals("1 año de servicio")) {
						textarea1.setText("\n  El trabajador " + nombreTrabajador + " " + Ap + " " + Am +
										  "\n  quien labora en el " + Departamento + " con " + Antiguedad +
										  "\n  recibe 6 dias de vacaciones");
					}
					if(Antiguedad.equals("2 a 6 años de servicio")) {
						textarea1.setText("\n  El trabajador " + nombreTrabajador + " " + Ap + " " + Am +
								  "\n  quien labora en el " + Departamento + " con " + Antiguedad +
								  "\n  recibe 14 dias de vacaciones");
					}
					if(Antiguedad.equals("7 o mas años de servicio")) {
						textarea1.setText("\n  El trabajador " + nombreTrabajador + " " + Ap + " " + Am +
								  "\n  quien labora en el " + Departamento + " con " + Antiguedad +
								  "\n  recibe 20 dias de vacaciones");
					}
				}
				if(Departamento.equals("Departamento de logistica")) {
					if(Antiguedad.equals("1 año de servicio")) {
						textarea1.setText("\n  El trabajador " + nombreTrabajador + " " + Ap + " " + Am +
										  "\n  quien labora en el " + Departamento + " con " + Antiguedad +
										  "\n  recibe 7 dias de vacaciones");
					}
					if(Antiguedad.equals("2 a 6 años de servicio")) {
						textarea1.setText("\n  El trabajador " + nombreTrabajador + " " + Ap + " " + Am +
								  "\n  quien labora en el " + Departamento + " con " + Antiguedad +
								  "\n  recibe 15 dias de vacaciones");
					}
					if(Antiguedad.equals("7 o mas años de servicio")) {
						textarea1.setText("\n  El trabajador " + nombreTrabajador + " " + Ap + " " + Am +
								  "\n  quien labora en el " + Departamento + " con " + Antiguedad +
								  "\n  recibe 22 dias de vacaciones");
					}
				}
				if(Departamento.equals("Departamento de gerencia")) {
					if(Antiguedad.equals("1 año de servicio")) {
						textarea1.setText("\n  El trabajador " + nombreTrabajador + " " + Ap + " " + Am +
										  "\n  quien labora en el " + Departamento + " con " + Antiguedad +
										  "\n  recibe 10 dias de vacaciones");
					}
					if(Antiguedad.equals("2 a 6 años de servicio")) {
						textarea1.setText("\n  El trabajador " + nombreTrabajador + " " + Ap + " " + Am +
								  "\n  quien labora en el " + Departamento + " con " + Antiguedad +
								  "\n  recibe 20 dias de vacaciones");
					}
					if(Antiguedad.equals("7 o mas años de servicio")) {
						textarea1.setText("\n  El trabajador " + nombreTrabajador + " " + Ap + " " + Am +
								  "\n  quien labora en el " + Departamento + " con " + Antiguedad +
								  "\n  recibe 30 dias de vacaciones");
					}
				}
			}
		}
		if(e.getSource() == miRojo) {
			getContentPane().setBackground(new Color(255,0,0));
		}
		if(e.getSource() == miNegro) {
			getContentPane().setBackground(new Color(0,0,0));
		}
		if(e.getSource() == miMorado) {
			getContentPane().setBackground(new Color(51,0,51));
		}
		if(e.getSource() == miNuevo) {
			txtNombreTrabajador.setText("");
			txtAPaternoTrabajador.setText("");
			txtAMaternoTrabajador.setText("");
			comboDepartamento.setSelectedIndex(0);
			comboAntiguedad.setSelectedIndex(0);
			textarea1.setText("\n  aqui aparece el resultado del calculo de las vacaciones.");
		}
		if(e.getSource() == miSalir) {
			Bienvenida bienvenidos = new Bienvenida();
			bienvenidos.setBounds(0,0,350,500);
			bienvenidos.setVisible(true);
			bienvenidos.setResizable(false);
			bienvenidos.setLocationRelativeTo(null);
			this.setVisible(false);
		}
		if(e.getSource() == miElCreador) {
			JOptionPane.showMessageDialog(null, "Desarrollado por luciano.");
		}
	}
	
	public static void main(String[] args) {
		Principal principal1 = new Principal();
		principal1.setBounds(0,0,900,580);
		principal1.setVisible(true);
		principal1.setResizable(false);
		principal1.setLocationRelativeTo(null);
	}

}
