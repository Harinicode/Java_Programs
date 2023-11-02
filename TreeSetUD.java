import java.util.*;
class Bank
{
	int cusid;
	String cusname;
	public Bank(int cusid,String cusname)
	{
		this.cusid=cusid;
		this.cusname=cusname;
	}
	public String toString()
	{
		return "Name: "+cusname+" Customer id: "+cusid;
	}
}
class Compcusid implements Comparator<Bank>
{
	public int compare(Bank b1,Bank b2)
	{
		return b1.cusid-b2.cusid;
	}
}

class  Cusnamecomp implements Comparator<Bank>
{
	public int compare(Bank b1,Bank b2)
	{
		
		return b1.cusname.compareTo(b2.cusname);
	}
}
class Udcomp
{
	public static void main(String args[])
	{
		TreeSet<Bank> al=new TreeSet<Bank>(new Cusnamecomp());
		al.add(new Bank(79,"Ganesh"));
		al.add(new Bank(22,"Yamuna"));
		al.add(new Bank(17,"Janaki"));
		Iterator<Bank> i=al.iterator();
		while(i.hasNext())
		{
			Bank b=(Bank)i.next();
			System.out.println(b.cusname+" "+b.cusid);
		}
		TreeSet<Bank> bl=new TreeSet<Bank>(new Compcusid());
		bl.add(new Bank(79,"Ganesh"));
		bl.add(new Bank(22,"Yamuna"));
		bl.add(new Bank(17,"Janaki"));
		for(Bank b:bl)
		{
			System.out.println(b);
		}
	}
}
