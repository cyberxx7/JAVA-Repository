package chapterThreeExercises;

public class Employee {
private String firstName;
private String lastName;
private double salary;

public Employee(String firstName, String lastName, double salary) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.salary = salary;

}
public void setSalary(double salary){
    this.salary = salary;
}

public double getSalary(){
    return salary;
}

}

