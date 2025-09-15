package src.main.java.com.mycompany.csc229_211review_lab02hw;


/**
 *
 * @author MoaathAlrajab
 */
public class Student extends Person {
    // ToDo 1: Make this class(Student class) a child of Person


    // turn address field into protected field and call its method in child class
    // or transfer address field and keep it as a private string and override its methods
    // in the same class(Student class)
    private String address;
    // ToDo 2: Fix the resulting errors
    // override abstract methods from abstract parent class
    @Override
    public String getAddress() {return address;}


    @Override
    public void setAddress(String address){
        this.address=address;
    }


    // ToDo 3: Add a field for GPA and create setter and getter
    // instance variable or instance datafield called gpa declared, but not initialized below
    protected double gpa;


    // setter method of gpa field
    public double getGpa(){
        return this.gpa;
    }


    //getter method of gpa field
    public void setGpa(){
        this.gpa = gpa;
    }


    // ToDo 4: Add comments to your code


    // ToDo 6: Fix the constructor of Student class




    //overloaded, parametrized constructor
    public Student(String name, short age,double gpa){
        super(name,age); //  using super()calling parent class constructor passing datafields or arguments of name & age
        this.gpa = gpa;
        // this.gpa refers to the already declared instance variable/instance datafield inside the Student class
        // while gpa after the = sign refers to the constructor Student's local variable and parameter passed as an
        // argument
    }


    // ToDo 7: Add a toString method for Student class


    // subclass Student cannot directly access private data fields of name and age, but subclass can access
    // parent class's datafields's public or protected methods, in this case, getter and setter methods of age &
    // name datafields
    // toString() used for formatting purpose
    public String toString(){
        return "Student Name: "+this.getName()+" Age: "+this.getAge()+" GPA: "+this.getGpa();
    }


}
