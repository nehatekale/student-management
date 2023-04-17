package Mypack;

public class student {
	
	
	 private String name;
	
	 private int rollno;
	 
	 public String getname() {
		 return this.name;
	 }
	 
	 public void setname(String name) {
		 this.name=name;
	 }
	 
	 public int getrollno() {
		 return this.rollno;
	 }
	 
	 public void setrollno(int rollno) {
		 this.rollno=rollno;
	 }
	 
	 
	public void display() {
		System.out.println(this.name);
		System.out.println(this.rollno);
	}

}
