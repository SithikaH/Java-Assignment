public class Course {

    private String name;
    private String enrollType;
    private int numberOfStudentsEnrolled;
    private Lecturer lecturerInCharge;
    private Degree degreeBelongsTo;

    public Course(String name, String enrollType, int numberOfStudentsEnrolled) {
        this.name = name;
        this.enrollType = enrollType;
        this.numberOfStudentsEnrolled = numberOfStudentsEnrolled;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEnrollType() {
        return enrollType;
    }

    public void setEnrollType(String enrollType) {
        this.enrollType = enrollType;
    }

    public int getNumberOfStudentsEnrolled() {
        return numberOfStudentsEnrolled;
    }

    public void setNumberOfStudentsEnrolled(int numberOfStudentsEnrolled) {
        this.numberOfStudentsEnrolled = numberOfStudentsEnrolled;
    }


    public void addLecturerInCharge(Lecturer lecturer){
        this.lecturerInCharge = lecturer;
    }

    public void removeLecturerInCharge(){
        this.lecturerInCharge = null;
    }

    public void addDegreeBelongsTo(Degree degree){
        this.degreeBelongsTo = degree;
    }

    public void removeDegreeBelongsTo(){
        this.degreeBelongsTo = null;
    }

//    @Override
    public void displayInfo(){
        System.out.println("Course Name: " + name);
        System.out.println("Enrollment Type: " + enrollType);
        System.out.println("Number of Students Enrolled: " + numberOfStudentsEnrolled);
        if(lecturerInCharge != null){
            System.out.println("Lecturer in charge name: " + lecturerInCharge.getName());
        }
        else{
            System.out.println("No lecturer in charge");
        }
        if(degreeBelongsTo != null){
            System.out.println("Degree Belongs to name: " + degreeBelongsTo.getName());
        }
        else{
            System.out.println("No degree assigned");
        }

    }
}
