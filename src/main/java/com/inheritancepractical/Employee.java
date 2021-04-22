package com.inheritancepractical;

public class Employee extends Student {
    public Employee(String department, int block, int id, String name) {
        super(department, block, id, name);

    }

    public void getEmployeeDetails(){

        System.out.println("Name=" +this.name);
        System.out.println("Department=" +this.department);
        System.out.println("Block=" +this.block);
        System.out.println("ID=" +this.id);

    }

}
