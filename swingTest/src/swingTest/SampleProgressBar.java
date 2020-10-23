package swingTest;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JSlider;

public class SampleProgressBar extends JFrame {
	public static void main(String[] args) {
		SampleProgressBar frame = new SampleProgressBar();
		frame.setTitle("SampleProgressBar");
		frame.setBounds(550, 350, 300, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	SampleProgressBar() {
		JProgressBar bar = new JProgressBar(0, 200);
		bar.setStringPainted(true);
		bar.setValue(50);
		JPanel p = new JPanel();
		p.add(bar);
		Container contentPane = getContentPane();
		contentPane.add(p, BorderLayout.CENTER);
	}
}
