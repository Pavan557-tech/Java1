package com.inheritancepractical;

public class College {
    String department;
    int block;
    int id;

    public College(String department,int block,int id){
        this.block=block;
        this.department=department;
        this.id=id;

    }

    public String getDepartment(){
        return this.department;

    }

    public int getBlock(){
        return this.block;
    }

    public int getId(){
        return this.id;
    }

}
