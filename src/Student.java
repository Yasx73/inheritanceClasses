public class Student extends Person{
    //DAUGHTER CLASS
    private int id;
    private String grade;
    private float qualification;

    public Student(String name, int age, String sex, String direction, int id, String grade,
                   float qualification) {
        super(name, age, sex, direction);
        this.id = id;
        this.grade = grade;
        this.qualification = qualification;
    }
    public void showData(){
        System.out.println("name: "+name+" age: "+age+" sex: "+sex+" direction: "+direction+
                " id: "+id+" grade: "+grade+" qualification: "+qualification);
    }
    public void showQualification(){
        System.out.println("The qualification is: "+qualification);
    }
    public void  showGrade(){
        System.out.println("The grade is: "+grade);
    }
}
