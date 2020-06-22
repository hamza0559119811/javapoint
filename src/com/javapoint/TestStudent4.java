package com.javapoint;

class Students{
	int rollno;
	String name;
	void insertRecord(int r,String n) {
		rollno=r;
		name=n;
	}
	
	void displayInformation() {
		System.out.println(rollno+" "+name);
	}
}


 class TestStudent4 {

	public static void main(String[] args) {
		Students st1=new Students();
		Students st2=new Students();
		st1.insertRecord(111, "Joker");
		st2.insertRecord(222, "Harleen Quinzel");
		st1.displayInformation();
		st2.displayInformation();
	}

}
