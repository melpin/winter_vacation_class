package gs;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class select_warning extends JDialog {
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			select_warning dialog = new select_warning();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public select_warning() {
		setUndecorated(true);
		setResizable(false);
		setBounds(960, 540, 250, 150);
		getContentPane().setLayout(null);
		
		JButton btn_ok = new JButton("");
		btn_ok.setPressedIcon(new ImageIcon("C:\\Users\\LEE\\Desktop\\\uC624\uD508\uC18C\uC2A4 (2)\\btn_ok_click.png"));
		btn_ok.setIcon(new ImageIcon("C:\\Users\\LEE\\Desktop\\\uC624\uD508\uC18C\uC2A4 (2)\\btn_ok.png"));
		btn_ok.setRolloverEnabled(false);
		btn_ok.setFocusPainted(false);
		btn_ok.setBorderPainted(false);
		btn_ok.setBounds(86, 104, 78, 34);
		getContentPane().add(btn_ok);
		
		JLabel bgimage = new JLabel("");
		bgimage.setIcon(new ImageIcon("C:\\Users\\LEE\\Desktop\\\uC624\uD508\uC18C\uC2A4 (2)\\warning_select.png"));
		bgimage.setBounds(0, 0, 250, 150);
		getContentPane().add(bgimage);
		btn_ok.addActionListener(new MyActionListener_ok());
		setVisible(true);
	}
	class MyActionListener_ok implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			dispose();
		}
	}
}
