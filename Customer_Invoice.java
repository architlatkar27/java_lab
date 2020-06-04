class Customer{
	int id;
	String name;
	int discount;
	Customer(int id,String name,int discount){
		this.name=name;
		this.id=id;
		this.discount=discount;
	}
	int getId(){ return id; }
	String getName(){ return name; }
	int getDiscount(){ return discount ; }
	void setDiscount(int d){ discount=d; }
        public String toString(){
       		return "Name: "+name+" Id: "+id+" Discount: "+discount;
 	}
		
}
class Invoice{
	Customer customer;
	int id;
	double amount;
	Invoice(Customer c,int id,double amt){
		this.amount=amt;
		this.id=id;
		this.customer=c;
	}
	int getId(){ return id ;}
	Customer getCustomer(){ return customer; }
	void setCustomer(Customer c){ customer=c; }
        String getAmount(){ return Double.toString(amount); }
	void setAmount(Double amt){ amount=amt; }
	String getCustomerName(){ return customer.getName() ; }	
	double afterDiscount(){
		double f=amount-customer.getDiscount()*0.01*amount;
		return f;
	}
	
}
class Customer_Invoice{
	public static void main(String args[]){
		Customer c1=new Customer(1111,"Kakashi",5);
		Invoice i1=new Invoice(c1,9009,200);
		System.out.println("details of c1\n"+c1);
		System.out.println("amount to be paid by c1: "+i1.afterDiscount());
	}
}
