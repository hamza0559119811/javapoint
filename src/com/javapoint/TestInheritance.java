package com.javapoint;

class Employee2{
    float salary=40000;
}


class TestInheritance extends Employee2 {
    int bonus = 10000;
    public static void main(String args[]){
        TestInheritance p=new TestInheritance();
        System.out.println("Programmer salary is : "+p.salary);
        System.out.println("Bonus of Programmer is : "+p.bonus);
    }

    
}