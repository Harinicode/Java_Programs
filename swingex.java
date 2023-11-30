import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Multi extends Thread
{
	JLabel l;
		Multi(JLabel l)
		{
			this.l=l;
		}
	public void run()
	{
		
		while(true)
		{
			try
			{
				l.setBounds(20,195,110,70);
				Thread.sleep(2000);
				l.setBounds(40,195,110,70);
				Thread.sleep(2000);
				l.setBounds(60,195,110,70);
				Thread.sleep(2000);
				l.setBounds(80,195,110,70);
				Thread.sleep(2000);
				l.setBounds(100,195,110,70);
				Thread.sleep(2000);
				l.setBounds(120,195,110,70);
				Thread.sleep(2000);
				l.setBounds(140,195,110,70);
				Thread.sleep(2000);
				l.setBounds(160,195,110,70);
				Thread.sleep(2000);
				l.setBounds(170,195,110,70);
				Thread.sleep(2000);
			}
			catch(InterruptedException e)
			{
					return;
			}
		}
	}
}
		
class swingex
{
		ArrayList<swingex> al=new ArrayList<swingex>();
		 int rollno;
		String name;
		swingex(int rollno,String name)
		{
			this.rollno=rollno;
			this.name=name;
		
		}
		void add(swingex i)
		{
			al.add(i);
		
		}
		public String toString()
		{
			return "Name: "+name+" Rollno: "+rollno;
		
		}
			JFrame f;
			JTextField t,t2;
			JLabel l1,l2,scroll;
			JButton add,display;
			JTextArea tt;
			
			swingex()
			{
				f=new JFrame();
				l1=new JLabel("NAME:");
				l2=new JLabel("ROLLNO.");
				add=new JButton("Add");
				display=new JButton("Display");
				t=new JTextField(10);
				t2=new JTextField(10);
				tt=new JTextArea();
				scroll=new JLabel("WELCOME HGD!");
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
				f.add(scroll);
				add.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						name=t.getText();
						rollno=Integer.parseInt(t2.getText());
						add(new swingex(rollno,name));
						
						t.setText(null);
						t2.setText(null);
					}
				});
				display.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						for(swingex s:al)
						{
							tt.append(s+"\n");
			
						}

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
			new swingex();
			Multi m=new Multi(new swingex().scroll);
			m.start();
			}
}
