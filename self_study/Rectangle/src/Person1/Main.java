package Person1;

public class Main {

	public static void main(String[] args) {
		//UnivStudent s = new UnivStudent();
		//s.age = 20;
		//s.name = "����ȣ";
		//s.major = "��ǻ�Ͱ���";
		//s.WhoAreYou();
		
		UnivStudent s = new UnivStudent("����ȣ", 20, "��ǻ�Ͱ���");
		s.WhoAreYou();
		System.out.println(s);
		System.out.println(s.toString());
	}

}