package swingTest;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;

public class SampleSlider extends JFrame {
	public static void main(String[] args) {
		SampleSlider frame = new SampleSlider();
		frame.setTitle("SampleSlider");
		frame.setBounds(550, 350, 300, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	SampleSlider() {
		JSlider slider = new JSlider();
		slider.setOrientation(JSlider.HORIZONTAL);
		
		JPanel p = new JPanel();
		p.add(slider);
		Container contentPane = getContentPane();
		contentPane.add(p, BorderLayout.CENTER);
	}
}
