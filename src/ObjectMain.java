public class ObjectMain {
    public static void main(String[] args) {
        Person person1 = new Person("Francisco",21,"Male","Atlacomulco de Fabela");
        Student student1 = new Student("Yessenia",19,"Femenine",
                "Col. Ampliación Garita",2124676,"Programming",8.5f);
        student1.showData();
        person1.showData();
    }
}
