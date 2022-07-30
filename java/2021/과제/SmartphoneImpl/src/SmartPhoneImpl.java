//2061028 �ȳ��
class Phone {
	String phoneNumber;	//String���� ���� phoneNumber ����
	public Phone(String phoneNumber) {	//������
		this.phoneNumber = phoneNumber;	//���� �� �����ϱ�
	}
	void call() {
		System.out.println(phoneNumber+"���� ��ȭ�� �ɾ� ��ȭ�� �մϴ�. "); //phoneNumber ���
	}
}

public class SmartPhoneImpl extends Phone {
	String model;	//String���� ���� model ����
	public SmartPhoneImpl(String phoneNumber, String model) {	//������
		super(phoneNumber);	//����Ŭ���� ������
		this.model = model;	//���� �� �����ϱ�
	}
	@Override
	void call() {
		super.call();	//����Ŭ���� �Լ� ȣ��
		System.out.println("�̾����� �̿��ؼ� ��ȭ�� �մϴ�. ");	//��¹�
	}
	public static void main(String[] args) {
		SmartPhoneImpl phone = new SmartPhoneImpl("010-9999-0000", "IOS");	//��ü ����
		phone.call();	//�Լ� ȣ��
	}
}