import javax.swing.*;
import java.awt.*;

public class ListEx extends JFrame{
	private String[] fruits = {"apple","banana","kiwi","mango","pear"};
	private ImageIcon[] images = { new ImageIcon("C:\\Users\\gurmi\\OneDrive\\���� ȭ��\\���.jfif"),
								new ImageIcon("C:\\Users\\gurmi\\OneDrive\\���� ȭ��\\�ٳ���.jfif"),
			new ImageIcon("C:\\Users\\gurmi\\OneDrive\\���� ȭ��\\Ű��.jfif"),
			new ImageIcon("C:\\Users\\gurmi\\OneDrive\\���� ȭ��\\����.jfif"),
			new ImageIcon("C:\\Users\\gurmi\\OneDrive\\���� ȭ��\\��.jfif") };
	public ListEx( ) {
		setTitle("����Ʈ ����� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JList<ImageIcon> imageList = new JList<ImageIcon>();
		imageList.setListData(images);
		c.add(imageList);
		
		setSize(300,550);	setVisible(true);	
	}
	public static void main(String [] args) {
		new ListEx();
	}
}