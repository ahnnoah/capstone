import java.io.*;

public class TextCopy {
	public static void main(String[] args) {
		File src = new File("c:\\windows\\system.ini");
		File dest = new File("C:\\Users\\gurmi\\OneDrive\\���� ȭ��\\system.txt");
		
		int c;
		try {
			FileReader fr = new FileReader(src);
			FileWriter fw = new FileWriter(dest);
			while((c = fr.read()) != -1) {
				fw.write((char)c);
			}
			fr.close();
			fw.close();
			System.out.println(src.getPath() + "�� " + dest.getPath() + "�� �����Ͽ����ϴ�.");
		}
		catch(IOException e) {
			System.out.println("���� ���� ����");
		}
	}
}