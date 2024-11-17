import java.util.ArrayList;


public class Lecturer extends Person {

    private String position;
    private Department department;
    private ArrayList<Course> coursesTeaching;


    public Lecturer(String name, String position, Department department) {
        super(name);
        this.position = position;
        this.department = department;
        this.coursesTeaching = new ArrayList<>();
    }



    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }


    public void addCourse(Course course){
        coursesTeaching.add(course);
    }

    public void removeCourse(Course course) {
        coursesTeaching.remove(course);
    }

    public void listCoursesTeaching(){
        if(coursesTeaching.isEmpty()){
            System.out.println("There are no courses teaching");
        }
        else {
            System.out.println("Courses teaching");
            for (Course course : coursesTeaching) {
                System.out.println("- " + course);
            }
        }
    }

    public void displayDepartmentInfo(){
        if (department != null){
            System.out.println("Department:" + department);
        }
        else {
            System.out.println("Department is not assigned");
        }
    }

    @Override
    public void displayInfo(){
        System.out.println("Lecturer Name: " + getName());
        System.out.println("Position: " + position);
        displayDepartmentInfo();
        listCoursesTeaching();
    }


}


