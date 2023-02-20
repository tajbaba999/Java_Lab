abstract class Person{
    String name;
    public Person(String per, int rollno){
        this.name=per;
    }
    public Person(String name2) {
    }
    public String getName() {
        return name;
    }
    public abstract void displaydetils();
}

class Student extends Person{
    public int rollno;
    Student(String name, int rollno){
        super(name);
        this.rollno=rollno;
    }
    public int getRollno(){
        return rollno;
    }
    public void displaydetils(){
        System.out.println("Student name : "+getName());
        System.out.println("Roll no : "+rollno);
    }
}

class Faculty extends Person{
    public int salary;
    Faculty(String name,int rollno, int salary){
        super(name, rollno);
        this.salary=salary;
    }
    public void displaydetils(){
        System.out.println("Name : "+getName());
        // System.out.println("roll no : "+getName());
        System.out.println("salary : "+salary);
    }
}

public class AdapterclassStudent {
    public static void main(String[] args) {
    Student s1 = new Student("Kaif", 34);
    Faculty f1 = new Faculty("TAJ", 45, 234354);
    s1.displaydetils();
    f1.displaydetils();
     }
}
