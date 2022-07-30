import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MenuEx extends JFrame{
	private JTextArea ta = new JTextArea(20,40);
	public MenuEx() {
		setTitle("�޸���");
		createMenu();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(new JScrollPane(ta));
		setSize(500,500);
		setVisible(true);
	}
	private void createMenu() {
		JMenuBar mb = new JMenuBar();
		JMenu fileMenu = new JMenu("����");		
		fileMenu.add(new JMenuItem("���θ����"));
		fileMenu.add(new JMenuItem("�� â"));
		fileMenu.add(new JMenuItem("����"));
		mb.add(fileMenu);
		
		JMenu editMenu = new JMenu("����");
		editMenu.add(new JMenuItem("���� ���"));
		editMenu.addSeparator();
		editMenu.add(new JMenuItem("�߶󳻱�"));
		editMenu.add(new JMenuItem("����"));
		mb.add(editMenu);
		
		JMenu fomulaMenu = new JMenu("����");
		fomulaMenu.add(new JMenuItem("�ڵ� �� �ٲ�"));
		fomulaMenu.add(new JMenuItem("�۲�"));
		mb.add(fomulaMenu);
		
		JMenu seeMenu = new JMenu("����");
		seeMenu.add(new JMenuItem("Ȯ��/���"));
		seeMenu.add(new JMenuItem("���� ǥ����"));
		mb.add(seeMenu);
		
		JMenu helpMenu = new JMenu("����");
		helpMenu.add(new JMenuItem("���� ����"));
		helpMenu.add(new JMenuItem("�ǵ�� ������"));
		helpMenu.addSeparator();
		helpMenu.add(new JMenuItem("�޸��� ����"));
		mb.add(helpMenu);
		
		setJMenuBar(mb);
	}
	
	
	public static void main(String[] args) {
		new MenuEx();
	}
}