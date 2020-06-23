package com.javapoint;
class TestStudent7{
        int id;
        String name;
        int age;

        //creating two arg constructor
        TestStudent7(int i, String n){
            id = i;
            name = n;
        }
        //creating three arg constructor
        TestStudent7(int i, String n, int a){
            id = i;
            name = n;
            age = a;
        }
        void display(){
            System.out.println(id+" "+name+" "+age);
        }
        public static void main(String args[]){
            TestStudent7 s1 = new TestStudent7(68,"Lex");
            TestStudent7 s2 = new TestStudent7(69,"Raven",19);
            s1.display();
            s2.display();

        }
    }    
