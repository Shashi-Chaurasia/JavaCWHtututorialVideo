package com.company;

class Students{
    int id;
    String name;
    int salary;
    public void studentDetails(){
        System.out.println(" Student id is :  " + id);
        System.out.println(" Student name is :" + name);
        System.out.println("Student Salary is :" + salary);
    }

    public int getSalary(){
        return salary;
    }

}

public class Employee {
    public static void main(String[] args) {
        Students std = new Students();
        Students std2 = new Students();


        std.name = "Shashi";
        std.id = 1;
        std.salary = 3443;

        System.out.println("************************* New Employee ...**********");

        std2.id = 2;
        std2.name = "John";
        std2.salary = 6357;

        std.studentDetails();

        System.out.println("***************************");
        std2.studentDetails();
        std2.getSalary();

        //System.out.println(std.id);
        //System.out.println(std.name);
        

    }
}
