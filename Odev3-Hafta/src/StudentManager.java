public class StudentManager extends UserManager{


	public void add(User[] user) {
		System.out.println("�grenci eklendi: ");
	}

	public void delete(User user) {
		System.out.println("�grenci silindi: "+user.getFirstName()+" "+user.getLastName());
	}

	public void update(User user) {
		System.out.println("�grenci g�ncellendi: "+user.getFirstName()+" "+user.getLastName());
	}

	public void input(User user) {
		System.out.println("�grenci giris yapti: "+user.getFirstName()+" "+user.getLastName());
	}

	public void output(User user) {
		System.out.println("�grenci �ikis yapti: "+user.getFirstName()+" "+user.getLastName());
	}

}
