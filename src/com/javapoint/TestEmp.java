package com.javapoint;

public class TestEmp {
    int id;
    String name;
    TestAddress address;

public TestEmp(int id, String name, TestAddress address) {
    this.id = id;
    this.name = name;
    this.address = address;
}

void display() {
    System.out.println(id+" "+name);
    System.out.println(address.city+" "+address.state+" "+address.country);
}

public static void main(String[] args) {
    TestAddress address1 = new TestAddress("lahore", "punjab'", "'pakistan'");
    TestAddress address2 = new TestAddress("'Quetta'", "'balochistan'", "'pakistan'");

    TestEmp e =new TestEmp(52, "Strange", address1);
    TestEmp e2 =new TestEmp(53, "'Wong'", address2);

    e.display();
    e2.display();

}
}
