//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class UniversityManagementSystem {
    public static void main(String[] args) {

        Department  softwareEngineering = new Department("Software Engineering");

        Degree  computerScience = new Degree("Computer Science", 60);

        Course  oop = new Course("Object Oriented Programming","Compulsary", 100);
        Course  maths = new Course("Mathematics for cs","Compulsary", 60);


        Lecturer lec1 = new Lecturer("Prof. Dias", "Professor","computersystemEngineering");
        Lecturer lec2 = new Lecturer("Dr. Sidath", "Senior Lecturer",softwareEngineering);

        Student stu1 = new Student("Don Laddus", "CS2021", "2nd Year",computerScience);


        softwareEngineering.offerCourse(oop);
        softwareEngineering.offerCourse(maths);

        // Assign Courses to Lecturer
        lec1.addCourse(oop);
        lec2.addCourse(maths);

        // Assign Course to Degree
        computerScience.offerCourse(oop);
        computerScience.offerCourse(maths);

        // Assign Course to Student
        stu1.enrollCourse(oop);

        // Assign Lecturers to Department
        computersystemEngineering.addLecturer(lec1);
        softwareEngineering.addLecturer(lec2);

        // Display Information
        System.out.println("Lecturer Information:");
        lec1.displayInfo();

        System.out.println("\nStudent Information:");
        stu1.displayInfo();

        System.out.println("\nDepartment Information:");
        softwareEngineering.displayInfo();

        System.out.println("\nCourse Information:");
        oop.displayInfo();

        System.out.println("\nDegree Information:");
        computerScience.displayInfo();
    }
}