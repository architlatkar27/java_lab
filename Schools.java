class Person{
	String name;
	String address;
	Person(String n,String ad){
		name=n; address=ad;
	}
	String getName(){ return name; }
	String getAddress(){ return address; }
	void setAddress(String ad){
		address=ad;
	}
	public String toString(){
		return name+" lives at "+address;
	}

}
class Student extends Person{
	int numCourses=0;
	String[] courses=new String[30];
	int[] grades=new int[30];
	Student(String name,String address){
		super(name,address);
		for(int i=0;i<30;i++){
			courses[i]=" ";
			grades[i]=0;
		}
	}
	public String toString(){
		return "Student: "+super.toString();
	}
	void addCourseGrade(String course,int grade){
		if(numCourses>=30) System.out.println("Maximum 30 courses allowed");
		else{
			courses[numCourses]=course;
			grades[numCourses]=grade;
			numCourses++;
		}
	}
	void printGrades(){
		for(int i=0;i<numCourses;i++){
			System.out.println("course: "+courses[i]+"  grades: "+grades[i]);
		}
	}
	double getAverage(){
		double sum=0;
		for(int i=0;i<numCourses;i++) sum+=grades[i] ; 
		return sum/numCourses;
	}
}
class Teacher extends Person{
	int numCourses=0;
	String[] courses=new String[5];
	Teacher(String name,String ad){
		super(name,ad);
		for(int i=0;i<5;i++){
			courses[i]=" ";
		}
	}
	public String toString(){
		return "Teacher: "+super.toString();
	}
	boolean addCourse(String course){
		if(numCourses>=5) return false;
		else{
			int i=0;
			while(!(courses[i].equals(" "))) i++;
			courses[i]=course;
			numCourses++;
			System.out.println("course added at position "+i);
			return true;
		}
	}
	boolean removeCourse(String course){
		int flag=0,i=0;
		while(flag==0&&i<5){
			if(course.equals(courses[i])){
				flag=1;
				courses[i]=" ";
				numCourses--;
				
				return true;
			}
			else i++;
		}
		return false;
	}
}
class Schools{
	public static void main(String args[]){
		Teacher t=new Teacher("albus dumbledore","Godric's Hollow");
		Student s=new Student("harry potter","No.4 private drive");
		s.addCourseGrade("tranfiguration",8);
		s.addCourseGrade("DADA",10);
		s.addCourseGrade("potions",7);
		t.addCourse("transfiguration");
		t.addCourse("Charms");
		t.addCourse("DADA");
		System.out.println("please remove course Charms"+t.removeCourse("Charms"));
		t.addCourse("Leglimency");
		s.printGrades();
		System.out.println(s);
		System.out.println(t);
	}
}
