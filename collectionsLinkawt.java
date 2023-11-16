import java.util.*;
import java.awt.*;	
import java.awt.event.*;
class Info
{
		int rollno;
		String name;
		Info(int rollno,String name)
		{
			this.rollno=rollno;
			this.name=name;
		
		}
		public String toString()
		{
			return "Name: "+name+" Rollno: "+rollno;
		
		}
			Frame f;
			TextField t,t2;
			Label l1,l2;
			TextArea tt;
			Button add,display;
			//ArrayList<Info> al;
			Info()
			{
				f=new Frame();
				l1=new Label("NAME:");
				l2=new Label("ROLLNO.");
				add=new Button("Add");
				display=new Button("Display");
				t=new TextField(10);
				t2=new TextField(10);
				tt=new TextArea();
				l1.setBounds(35,25,50,30);
				l2.setBounds(35,65,50,30);
				t.setBounds(100,25,50,30);
				t2.setBounds(100,65,50,30);
				add.setBounds(145,25,50,30);
				display.setBounds(145,65,50,30);
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
						name=t.getText();
						rollno=Integer.parseInt(t2.getText());
						//al=new ArrayList<Info>();
						//al.add(new Info(rollno,name));
						System.out.println("Added contents into ArrayList");
						System.out.println(al);
					}
				});
				display.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						ArrayList<Info> al=new ArrayList<Info>();
						al.add(new Info(rollno,name));
					
						for(Info s:al)
						{
							tt.setText(s.toString());
			
						}
						//tt.setText("Name: "+name+"Roll no: "+String.valueOf(rollno));
					}
				});
				f.addWindowListener(new WindowAdapter()
				{
					public void windowClosing(WindowEvent w)
					{
						System.out.println("Window Closed");
						f.dispose();
						
					}
				});
				f.setSize(300,300);
				f.setLayout(null);
				f.setVisible(true);
				
			}
			public static void main(String args[])
			{
			new Info();
			
			}
}
