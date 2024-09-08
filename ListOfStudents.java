package XenosisWeek4;

import java.util.ArrayList;

class Students{
	String Std_Name;
	int Std_age;
	public Students(String name, int age) {
        this.Std_Name = name;
        this.Std_age = age;
       
    }

    public String getName() {
        return Std_Name;
    }

    public int getAge() {
        return Std_age;
    }
}

class StudentManager {
    private ArrayList<Students> students;

    public StudentManager() {
        students = new ArrayList<>();
    }

    
    public void addStudent(Students student) {
        students.add(student);
    }

  
    public void removeStudent(Students student) {
        students.remove(student);
    }
    public void displayStudents() {
        for (Students student : students) {
            System.out.println("Name: " + student.getName() + ", Age: " + student.getAge());
        }
    }
}
public class ListOfStudents {

	public static void main(String[] args) {
		StudentManager manager = new StudentManager();
        
        Students student1 = new Students("Sai", 20);
        Students student2 = new Students("Teja", 22);
        Students student3 = new Students("Sai Teja", 21);

       
        manager.addStudent(student1);
        manager.addStudent(student2);
        manager.addStudent(student3);

       
        System.out.println("Students:");
        manager.displayStudents();

        
        manager.removeStudent(student2);

        
        System.out.println("Students after removal:");
        manager.displayStudents();
    }
}