import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ComboAction extends JFrame{
	private String[] fruits = {"apple","banana","kiwi","mango","pear"};
	private ImageIcon[] images = { new ImageIcon("C:\\Users\\gurmi\\OneDrive\\���� ȭ��\\���.jfif"),
								new ImageIcon("C:\\Users\\gurmi\\OneDrive\\���� ȭ��\\�ٳ���.jfif"),
			new ImageIcon("C:\\Users\\gurmi\\OneDrive\\���� ȭ��\\Ű��.jfif"),
			new ImageIcon("C:\\Users\\gurmi\\OneDrive\\���� ȭ��\\����.jfif"),
			new ImageIcon("C:\\Users\\gurmi\\OneDrive\\���� ȭ��\\��.jfif") };
	private JLabel imgLabel = new JLabel(images[0]);
	
	public ComboAction() {
		setTitle("�޺��ڽ� Ȱ�� ����");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JComboBox<String> combo = new JComboBox<String>(fruits);
		c.add(combo); c.add(imgLabel);
		
		combo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JComboBox<String> cb = (JComboBox<String>)e.getSource();
				int index = cb.getSelectedIndex();
				imgLabel.setIcon(images[index]);
			}
		});
		setSize(300,300);	setVisible(true);	
	}
	
	public static void main(String [] args) {
		new ComboAction();
	}
}