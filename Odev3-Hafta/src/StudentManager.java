public class StudentManager extends UserManager{


	public void add(User[] user) {
		System.out.println("Ögrenci eklendi: ");
	}

	public void delete(User user) {
		System.out.println("Ögrenci silindi: "+user.getFirstName()+" "+user.getLastName());
	}

	public void update(User user) {
		System.out.println("Ögrenci güncellendi: "+user.getFirstName()+" "+user.getLastName());
	}

	public void input(User user) {
		System.out.println("Ögrenci giris yapti: "+user.getFirstName()+" "+user.getLastName());
	}

	public void output(User user) {
		System.out.println("Ögrenci çikis yapti: "+user.getFirstName()+" "+user.getLastName());
	}

}
