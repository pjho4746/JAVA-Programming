package Person1;

public class UnivStudent extends Person{
	protected String major;
	
	public UnivStudent(String name, int age, String major) {
		super(name, age);
		this.major = major;
	}
	public void WhoAreYou() {
		super.WhoAreYou();
		System.out.println(major+"전공 대학생");
	}

	@Override
	public String toString() {
		return super.toString()+major+"전공 대학생";
	}
	
}
