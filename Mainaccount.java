package om.Encasuation;

class Account
{
	private double bal;
	public String name;
	public Account(String name)
	{
		this.name=name;
	}
	public double getBal()
	{
		return bal;
	}
	public void setBal(double bal)
	{
		this.bal=bal;
	}
	public String getName()
	{
		return name;

	}
	public void setName(String name)
	{
		this.name=name;

	}
}
class Service
{
//	public void Name(String name,Account a)
//	{
//		String n=a.getName();
//		a.setName()
//	}
	public  void deposit(double amt,Account a)
	{
		if(amt>0)
		{
			double b1=a.getBal()+amt;
			a.setBal(b1);
		}
		else
		{
			System.out.println("invalid");
		}
	}
	public void withdraw(double amt,Account a)
	{
		if(amt<a.getBal())
		{
			double b1=a.getBal()-amt;
			a.setBal(b1);
		}
		else
		{
			System.out.println("Invalid");
		}
	}
	public void checkbal(Account a)
	{
		System.out.println("current bal "+a.getBal());
	}
}


public class Mainaccount {

	public static void main(String[] args) 
	{
		Account a1=new Account("abc");
		System.out.println(a1.name);//using constructor not possible get data bcz it is private so using getter we csn fetch the data
		System.out.println(a1.getName());
		System.out.println("current bal "+a1.getBal());
		a1.setBal(100);
		System.out.println("==========");
		Service s=new Service();
		s.checkbal(a1);
		s.deposit(10000.0, a1);
		s.checkbal(a1);
		s.withdraw(100.0, a1);
		s.checkbal(a1);
		
	}

}
