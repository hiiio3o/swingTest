package swingTest;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JSlider;
import javax.swing.JTextField;

public class SampleCheckBox extends JFrame {
	public static void main(String[] args) {
		SampleCheckBox frame = new SampleCheckBox();
		frame.setTitle("SampleProgressBar");
		frame.setBounds(550, 350, 300, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	SampleCheckBox() {
		JCheckBox cbox1 = new JCheckBox();
		JCheckBox cbox2 = new JCheckBox();
		JCheckBox cbox3 = new JCheckBox();
		cbox1.setText("green");
		cbox2.setText("red");
		cbox3.setText("blue");
		JPanel p = new JPanel();
		p.add(cbox1);
		p.add(cbox2);
		p.add(cbox3);
		Container contentPane = getContentPane();
		contentPane.add(p, BorderLayout.CENTER);
	}
}
