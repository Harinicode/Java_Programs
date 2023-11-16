import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Student
{
		int rollno;
		String name;
		Student(){}
		Student(int rollno,String name)
		{
			this.rollno=rollno;
			this.name=name;
		
		}
		void addtoArrayList(int rollno,String name)
		{
						ArrayList<Student> al=new ArrayList<Student>();
						al.add(new Student(rollno,name));
						System.out.println("Added content into ArrayList");
						System.out.println(al);
		}
		public String toString()
		{
			return "Name: "+name+" Rollno: "+rollno;
		
		}
}


class Info
{
			JFrame f;
			JTextField t,t2;
			JLabel l1,l2;
			JButton add,display;
			JTextArea tt;
			int rollno;
			String name;
			
			Info()
			{
				f=new JFrame();
				l1=new JLabel("NAME:");
				l2=new JLabel("ROLLNO.");
				add=new JButton("Add");
				display=new JButton("Display");
				t=new JTextField(10);
				t2=new JTextField(10);
				tt=new JTextArea();
				l1.setBounds(35,25,50,30);
				l2.setBounds(35,65,50,30);
				t.setBounds(105,25,50,30);
				t2.setBounds(105,65,50,30);
				add.setBounds(165,25,60,30);
				display.setBounds(165,65,75,30);
				tt.setBounds(25,115,175,75);
				f.add(l1);
				f.add(l2);
				f.add(t);
				f.add(t2);
				f.add(add);
				f.add(display);
				f.add(tt);
				add.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						Student S=new Student();
						 name=t.getText();
						 rollno=Integer.parseInt(t2.getText());
						 S.addtoArrayList(rollno,name);
					}
				});
				display.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
			
							tt.setText("Name: "+name+" Roll no: "+String.valueOf(rollno));
	

					}
				});
				f.setDefaultCloseOperation(f.DISPOSE_ON_CLOSE);
				f.setSize(300,300);
				f.setLayout(null);
				//f.setLayout(new FlowLayout());
				f.setVisible(true);
				
			}
			public static void main(String args[])
			{
			new Info();
			
			}
}
