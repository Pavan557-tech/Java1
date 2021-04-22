package com.inheritancepractical;

public class Runner {
    public static void main(String[] args) {
        Student student=new Student("ECE",1,557,"Gopi");
        student.getStudentDetails();
        Employee employee=new Employee("CSE",2,666,"MMM");
        employee.getEmployeeDetails();
    }
}
