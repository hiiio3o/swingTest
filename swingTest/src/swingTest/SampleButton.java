package swingTest;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JSlider;
import javax.swing.JTextField;

public class SampleButton extends JFrame {
	public static void main(String[] args) {
		SampleButton frame = new SampleButton();
		frame.setTitle("SampleProgressBar");
		frame.setBounds(550, 350, 300, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	SampleButton() {
		JButton button = new JButton();
		button.setText("Raspberry PI");
		JPanel p = new JPanel();
		p.add(button);
		Container contentPane = getContentPane();
		contentPane.add(p, BorderLayout.CENTER);
	}
}
