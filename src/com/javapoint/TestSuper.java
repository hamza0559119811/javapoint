package com.javapoint;
class person{
    int id;
    String name;
    person(int id , String name){
        this.id = id;
        this.name = name;
    }
}
class Emp extends person{
    float salary;
    Emp(int id,String name,float salary){
        super(id,name);//oarent constants
        this.salary=salary;
    }
    void display(){
        System.out.println(id+" "+name+" "+salary);
    }

}

class TestSuper {
    public static void main(String[] args) {
        Emp e1=new Emp(02, "Dexter", 4566666);
        e1.display();
    }
    
}