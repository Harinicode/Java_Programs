import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;
class Book
{
	ArrayList<Book> al=new ArrayList<Book>();
	double isbn;
	int copno;
	String btitle,Name;
	public Book(){};
	void getdetails(String Name,String btitle,int copno,double isbn)
	{
		this.Name=Name;																													//getting th book details
		this.btitle=btitle;
		this.copno=copno;
		this.isbn=isbn;
	}
	void addtoal(Book obj)
	{																																	//adding to ArrayList
		al.add(obj);
	}
	void display(JTextArea ta)
	{
		ta.append("\nBOOK DETAILS:\n ");
		for(Book bb:al)
		{
			ta.append(bb.toString()+" ");
		}
	}
	public String toString()																											//overidding toString
	{
		return"ISBN number "+isbn+" \n Book title "+btitle+" \n Author name "+Name+" \n Number of book copies available "+copno;
	}
}
class Sframe
{
		JFrame f;
		JLabel l1,l2,l3,l4;
		JTextField t1,t2,t3,t4;
		JButton sub,details;
		JTextArea ta;
		JScrollPane j;
		Book b;
		Sframe()
		{
			f=new JFrame();
			l1=new JLabel("ISBN number");
			l2=new JLabel("Book title");
			l3=new JLabel("Author Name");
			l4=new JLabel("no. of copies available");
			t1=new JTextField(10);
			t2=new JTextField(10);
			t3=new JTextField(10);
			t4=new JTextField(10);
			ta=new JTextArea(20,20);
			sub=new JButton("Submit");
			details=new JButton("Details");
			j=new JScrollPane(ta);
			b=new Book();
			f.add(l1);
			f.add(t1);
			f.add(l2);
			f.add(t2);
			f.add(l3);
			f.add(t3);
			f.add(l4);
			f.add(t4);
			f.add(sub);
			f.add(details);
			f.add(j);
			sub.addActionListener(new ActionListener()
			{
			public void actionPerformed(ActionEvent e)
			{
				double isbn=Double.parseDouble(t1.getText());
				String t=t2.getText();
				String n=t3.getText();
				int cops=0;
				try
				{
					
						cops=Integer.parseInt(t4.getText());
				}
				catch(NumberFormatException ex)
				{
					JOptionPane.showMessageDialog(f,"INVALID NON NUMERIC COPIES VALUE");
				}
				b.getdetails(n,t,cops,isbn);
				b.addtoal(b);
				t1.setText(null);
				t2.setText(null);
				t3.setText(null);
				t4.setText(null);
				
			}
			});
			details.addActionListener(new ActionListener()
			{
					public void actionPerformed(ActionEvent e)
					{
						//Book b=new Book();
						//b.display(ta);
						b.display(ta);
					}
			});
		
			f.setSize(400,400);
			f.setLayout(new FlowLayout());
			f.setVisible(true);
			f.setDefaultCloseOperation(f.DISPOSE_ON_CLOSE);
		}
		public static void main(String args[])
		{
			new Sframe();
		}
}
