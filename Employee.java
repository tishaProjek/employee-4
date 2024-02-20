package com.mycompany.employee;



public class Employee extends person {

    float salary = 4000f;
    String name = "tisha Employee";
    int age = 23;

   
    
    public  void showinfosuper(){
        System.out.println("Nama : " + super.name);
        System.out.println("Umur : " + super.age);
        System.out.println("Salary : $" + salary);
        
    }
    
    public void showinfothis(){
        System.out.println("Nama : " + this.name);
        System.out.println("Umur : " + this.age);
        System.out.println("Salary : $" + salary);
    }
    
}