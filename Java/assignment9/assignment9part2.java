package assignment9;

public class assignment9part2 {
    MyDate date = new MyDate();
    public static void main(String[] args) {

    Person per = new Person("Alex","1111 New Addy Way","010-1010","itsalex@gmail.com");
    Person stu = new Student("Bob","5432 Long Road","222-2112","bob@yahoo.com","Freshman");
    Person emp = new Employee("Coty","404 Not Found Lane","902-1069","cotester@gmail.com","Info",50000);
    Person fac = new Faculty("Dio","777 Lucky Lane","777-7777","itisidio@aol.com","caps",70000,"Manager");
    Person sta = new Staff("Erik","420 Lake Front Road","420-4444","Erik@yahoo.com","IBM",25000,"SME");

   System.out.println(per.toString());
   System.out.println(stu.toString());
   System.out.println(emp.toString());
   System.out.println(fac.toString());
   System.out.println(sta.toString());
  }
}

class Person {

    private String name;
    private String addy;
    private String phone;
    private String email;

    Person(String name, String addy, String phone, String email) {
        this.name = name;
        this.addy = addy;
        this.phone = phone;
        this.email = email;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return ("Person " + this.name);
    }
}

class Student extends Person {

    private String grade;

    Student(String name,String addy,String phone,String email,String grade){
    
    
        super(name,addy,phone,email);
        this.grade = grade;
    }

    @Override
    public String toString(){
        return ("Student " + this.getName());
    }
}

class Employee extends Person {
    
    private String office;
    private double salary;

    Employee(String name,String addy,String phone,String email,String office,double salary){
    
        super(name,addy,phone,email);
        this.office = office;
        this.salary = salary;
    }

    @Override
    public String toString(){
        return ("Employee " + this.getName());
    }
}

class Faculty extends Employee {

    private String rank;
    Faculty(String name,String addy,String phone,String email,String office,double salary,String rank){
    
        super(name,addy,phone,email,office,salary);
        this.rank = rank;

    }

    @Override
    public String toString(){
        return ("Faculty " + this.getName());
    }
}

class Staff extends Employee {

    private String title;

    Staff(String name,String addy,String phone,String email,String office,double salary,String title){
    
    
        super(name,addy,phone,email,office,salary);
        this.title = title;
    }

    @Override
    public String toString(){
        return ("Staff " + this.getName());
    }
}