import java.util.ArrayList;

public class Degree {

    private String name;
    private int numberOfStudents;
    private ArrayList<Course> coursesOffering;

    public Degree(String name, Integer numberOfStudents) {
        this.name = name;
        this.numberOfStudents = numberOfStudents;
        this.coursesOffering = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    public void offerCourse(Course course){
        coursesOffering.add(course);

    }

    public void withdrawCourse(Course course){
        coursesOffering.remove(course);

    }

    public void listCoursesOffering(){
        for (Course course : coursesOffering) {
            System.out.println("Course: " + course.getName());
        }

    }

//    @Override
    public void displayInfo(){
        System.out.println("Degree Name: " + name);
        System.out.println("Number of Students: " + numberOfStudents);
        System.out.println("coursesOffering: ");
        listCoursesOffering();

    }

}
