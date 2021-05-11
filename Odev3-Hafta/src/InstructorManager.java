public class InstructorManager extends UserManager{

	public void add(User user) {
		System.out.println("Egitmen eklendi: "+user.getFirstName()+" "+user.getLastName());
	}

	public void input(User user) {
		System.out.println("Egitmen eklendi: "+user.getFirstName()+" "+user.getLastName());
	}

	public void output(User user) {
		System.out.println("Egitmen silindi: "+user.getFirstName()+" "+user.getLastName());
	}
}
