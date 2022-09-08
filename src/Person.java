public class Person {
    //FATHER CLASS
    protected String name;
    protected int age;
    protected String sex;
    protected String direction;

    public Person(String name, int age, String sex, String direction) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.direction = direction;
    }
    public String getName() {
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getSex(){
        return sex;
    }
    public String getDirection(){
        return direction;
    }
    public void showData(){
        System.out.println("name: "+name+" age: "+age+" sex: "+sex+" direction: "+direction);
    }
}
