import java.util.Scanner;
class Records{
	String[] name=new String[100];
	int[] rank=new int[100];
	int n;
	Records(int num){
		n=num;
	}
	void readValues(Scanner sc){
		for(int i=0;i<n;i++){
			System.out.println("enter record details");
			name[i]=sc.next();
			rank[i]=sc.nextInt();
		}
		System.out.println("end of input");
	}
	void display(){
		System.out.println("Vomiting all records");
		for(int i=0;i<n;i++){
			System.out.println("name: "+name[i]+"  rank: "+rank[i]);
		}
	}

}
class Rank extends Records{
	int highest;
	Rank(int n){ super(n); }
	void highest_rank(){
		int min=rank[0];
		for(int i=1;i<n;i++){
			if(min>rank[i]) min=i;
		}
		highest=min;
	}
	public String toString(){
		return name[highest]+" has topped with AIR "+rank[highest] ;
	}
}
public class Rankers{
	public static void main(String args[]){
		Rank r1=new Rank(5);
		Scanner sc=new Scanner(System.in);
		r1.readValues(sc);
		r1.highest_rank();
		System.out.println("Who has topped this time?\n"+r1);
		r1.display();
	}
}
