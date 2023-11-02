import java.util.*;
import java.util.Collections;
import java.util.ArrayList;
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
class compcusid implements Comparator	//<Bank>
{
	public int compare(Object o1,Object o2)
	{
		Bank b1=(Bank)o1;
		Bank b2=(Bank)o2;
		if(b1.cusid==b2.cusid)
			return 0;
		else
		if(b1.cusid<b2.cusid)
			return -1;
		else
			return 1;
	}
}

class  cusnamecomp implements Comparator
{
	public int compare(Object o1,Object o2)
	{
		Bank b1=(Bank)o1;
		Bank b2=(Bank)o2;
		return b1.cusname.compareTo(b2.cusname);
	}
}
class Udcomp
{
	public static void main(String args[])
	{
		TreeMap<Integer,Bank> al=new TreeMap<Integer,Bank>();	//new TreeMap<Integer,Bank>(new compcusid());
		al.put(1,new Bank(79,"Ganesh"));
		al.put(2,new Bank(22,"Yamuna"));
		al.put(3,new Bank(17,"Janaki"));
		ArrayList<Bank> hs=new ArrayList<Bank>(al.values());		
		System.out.println(hs);
		Collections.sort(hs,new compcusid());
		Iterator<Bank> i=hs.iterator();
		while(i.hasNext())
		{
			Bank b=(Bank)i.next();
			System.out.println(b.cusname+" "+b.cusid);
		}
		Collections.sort(hs,new cusnamecomp());
		for(Bank b:hs)
		{
			System.out.println(b);
		}
	}
}
