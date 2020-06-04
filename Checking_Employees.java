import java.util.Scanner;
class NameError extends Exception{
	String s;
	NameError(String s){
		this.s=s;
	}
//	String toString(){ return s; }
}
class AgeError extends Exception{
	String s;
	AgeError(String s){
		this.s=s;
	}
//	String toString(){ return s; }
}
class Employee{
	String name;
	int age;
	Employee(String name,int age){
		this.name=name;
		this.age=age;
		System.out.println("employee record created successfully");
	}
}
class Checking_Employees{
	public static void main(String args[]){
		String name;
		boolean flag=true;
		Scanner s=new Scanner(System.in);
		System.out.println("enter employee name");
		name=s.next();
		int h;
		try{
			h=Integer.parseInt(name);
			flag=false;
			throw new NameError("invalid name");
		}
		catch(NameError e){
			System.out.println(e.s);
		}
		catch(Exception e){}
		
		int age;
		System.out.println("enter age");
		age=s.nextInt();
		try{
			if(age>50){ 
				flag=false;
				throw new AgeError("inavlid age");
			}
		}
		catch(AgeError e){
			System.out.println(e.s);
		}
		if(flag==true){
			Employee e=new Employee(name,age);
		}
		else{
			System.out.println("cannot create new record due to above reasons");
		}
	
	}
}
