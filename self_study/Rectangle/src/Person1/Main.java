package Person1;

public class Main {

	public static void main(String[] args) {
		//UnivStudent s = new UnivStudent();
		//s.age = 20;
		//s.name = "박지호";
		//s.major = "컴퓨터공학";
		//s.WhoAreYou();
		
		UnivStudent s = new UnivStudent("박지호", 20, "컴퓨터공학");
		s.WhoAreYou();
		System.out.println(s);
		System.out.println(s.toString());
	}

}
