package Vinnila.GUI;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.*;

public class GUI {
	static JFrame jf = new JFrame();
	static JPanel jp = new JPanel();
	public GUI(String name) {
		jp.setBorder(BorderFactory.createEmptyBorder(100, 100, 100, 100));
		jp.setLayout(new GridLayout(0, 1));
		
		jf.add(jp, BorderLayout.CENTER);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setTitle(name);
		jf.pack();
		
	}
	public static void setTitle(String title) {
		jf.setTitle(title);
	}
	public static void setVisible(boolean visible) {
		jf.setVisible(visible);
	}
	public static boolean isVisible() {
		return jf.isVisible();
	}
	public static void toggleVisible() {
		jf.setVisible(!isVisible());
	}
	public static void refresh() {
		jf.pack();
	}
	public static void displayText(String text) {
		jp.add(new JLabel(text));
	}
	public static void displayButton(String text) {
		jp.add(new JButton(text));
	}
	private void setSize() {
		// TODO Auto-generated method stub

	}
}
