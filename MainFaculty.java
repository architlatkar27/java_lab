class Faculty{
	String name;
	private int basic;
	Faculty(String name,int basic){
		this.name=name; this.basic=basic;
	}
	void getDetails(){
		System.out.println("Faculty Name: "+name+"  Basic Salary: "+basic);
	}
	double getSalary(){
		return (double)basic;
	}
}
class Assistant extends Faculty{
	int da;
	Assistant(String name,int basic,int da){
		super(name,basic);
		this.da=da;
	}
	double getSalary(){
		double b=super.getSalary();
		return b+(b*da)/100;
	}
	void getDetails(){
		System.out.println("Assistant Professor Name: "+super.name+"  Salary: "+getSalary());
	}

}
class Associate extends Assistant{
	int ma;
	Associate(String name,int basic,int da,int ma){
		super(name,basic,da);
		this.ma=ma;
	}
	double getSalary(){
		return super.getSalary()+ma;
	}
	void getDetails(){
		System.out.println("Associate Professor Name: "+name+"  Salary: "+getSalary());
	}
	
}
class Professor extends Associate{
	int oa;
	Professor(String name,int basic,int da,int ma,int oa){
		super(name,basic,da,ma);
		this.oa=oa;
	}
	double getSalary(){
		return super.getSalary()+oa;
	}
	void getDetails(){
		System.out.println("Professor Name: "+name+"  Salary: "+getSalary());
	}

}
public class MainFaculty{
	public static void main(String args[]){
		Faculty f=new Faculty("abc",50000);
		f.getDetails();
		Assistant a=new Assistant("def",50000,2000);
		a.getDetails();
		Associate as=new Associate("ghi",50000,2000,1000);
		as.getDetails();
		Professor p=new Professor("jkl",50000,2000,1000,500);
		p.getDetails();
	}
}
