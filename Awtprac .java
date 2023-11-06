import java.awt.*;
import java.awt.event.*;
class Awtprac 
{
		TextField t,t2,t3;
			
			Awtprac()
			{	Frame f=new Frame();
				Label l=new Label("Enter two numbers");
				t=new TextField();
				t2=new TextField();
				t3=new TextField();
				Button b=new Button("Addition");
				f.add(l);
				f.add(t);
				f.add(t2);
				f.add(b);
				f.add(t3);
				
				f.setLayout(new FlowLayout());
				b.addActionListener(new ActionListener()
					{
						public void actionPerformed(ActionEvent e)
						{
							int a=Integer.parseInt(t.getText());
							int b=Integer.parseInt(t2.getText());
							int c=a+b;
							String r=String.valueOf(c);
							t3.setText("Addition of two numbers: "+r);
							
						}
					}
				);
				f.setSize(300,300);
			 	t3.setEditable(false);
				f.setVisible(true);
			}
			public static void main(String args[])
			{
					new Awtprac();
			}
}
