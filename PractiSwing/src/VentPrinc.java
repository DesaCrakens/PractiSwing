import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class VentPrinc extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JButton btnHavrir;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentPrinc frame = new VentPrinc();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VentPrinc() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		this.lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(187, 73, 46, 14);
		contentPane.add(lblNewLabel);
		
		btnHavrir = new JButton("Havrir");
		btnHavrir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentSec s = new VentSec(mandarRef());
				s.setVisible(true);
				btnHavrir.setEnabled(false);
			}
		});
		btnHavrir.setBounds(171, 170, 89, 23);
		contentPane.add(btnHavrir);
	}
	
	private VentPrinc mandarRef(){
		return this;
	}
	
	public void habilitarBoton(){
		this.btnHavrir.setEnabled(true);
	}
	
	public void setLabel(String s){
		this.lblNewLabel.setText(s);
	}

}
