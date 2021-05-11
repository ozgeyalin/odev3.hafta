public class Main {

	public static void main(String[] args) {
		Instructor engin=new Instructor();
		engin.setId(1);
		engin.setFirstName("Engin");
		engin.setLastName("Demirog");
		engin.setAge(33);
		engin.setEmail("engind.com");
		engin.setCourse("java");
		engin.setPassword("343434");

		Instructor engin2=new Instructor();
		engin2.setId(2);
		engin2.setFirstName("mert");
		engin2.setLastName("yalin");
		engin2.setAge(25);
		engin2.setEmail("mert.com");
		engin2.setCourse("java2");
		engin2.setPassword("292929");

	    UserManager usermanager=new UserManager();
	    usermanager.add(engin2);
	    usermanager.delete(engin);


		Student student1=new Student("83825896314",1,"mert","mert",17,"mert.com","c#","12135468");
		Student student2=new Student("123456789963",2,"mert","mert",12,"mert.com","java","553483669lkd");

		Student[] students= {student1,student2};

		InstructorManager instructorManager=new InstructorManager();
		instructorManager.add(engin);

		StudentManager studentManager=new StudentManager();
		studentManager.add(students);

		System.out.println(student1.getFirstName()+" "+student1.getLastName());
		System.out.println(student2.getFirstName()+" "+student2.getLastName());

	}

}
