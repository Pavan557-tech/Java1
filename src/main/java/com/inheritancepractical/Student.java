package com.inheritancepractical;

public class Student extends College {
    String name;

    public Student(String department,int block,int id,String name){
        super(department,block,id);
        this.name=name;

    }
     public void getStudentDetails(){

         System.out.println("Name=" +this.name);
         System.out.println("Department=" +this.department);
         System.out.println("Block=" +this.block);
         System.out.println("Id=" +this.id);
     }
}
