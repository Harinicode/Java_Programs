import java.util.*;
import java.util.Collections;
import java.util.ArrayList;
class bank
{
	int cusid;
	String cusname;
	public bank(int cusid,String cusname)
	{
		this.cusid=cusid;
		this.cusname=cusname;
	}
	public String toString()
	{
		return "Name: "+cusname+" Customer id: "+cusid;
	}
}
class compcusid implements Comparator
{
	public int compare(Object o1,Object o2)
	{
		bank b1=(bank)o1;
		bank b2=(bank)o2;
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
		bank b1=(bank)o1;
		bank b2=(bank)o2;
		return b1.cusname.compareTo(b2.cusname);
	}
}
class Udcomp
{
	public static void main(String args[])
	{
		HashSet<bank> hs=new HashSet<bank>();
		hs.add(new bank(79,"Ganesh"));
		hs.add(new bank(22,"Yamuna"));
		hs.add(new bank(17,"Janaki"));
		ArrayList<bank> al=new ArrayList<bank>(hs);
		Collections.sort(al,new compcusid());
		Iterator<bank> i=al.iterator();
		while(i.hasNext())
		{
			bank b=(bank)i.next();
			System.out.println(b.cusname+" "+b.cusid);
		}
		Collections.sort(al,new cusnamecomp());
		for(bank b:al)
		{
			System.out.println(b);
		}
	}
}
