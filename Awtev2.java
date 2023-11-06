import java.awt.*;
import java.awt.event.*;
class Awtev2 
{
	TextField t;
		Awtev2()
		{
			Frame f=new Frame();
			t=new TextField();
			t.setBounds(100,40,150,50);
			Button b=new Button("Click me");
			b.setBounds(90,100,70,50);
			f.add(b);
			f.add(t);
			f.setTitle("Harini developed");
			b.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e)
		{
			t.setText("YOU ARE AWESOME");
		}
			});
			f.addWindowListener(new WindowAdapter()
				{
					public void windowClosing(WindowEvent e)
					{
						System.out.println("Window Closing activated");
						f.dispose();
					}
				});
			f.setSize(300,300);
			f.setLayout(null);
			f.setVisible(true);
			
		}
		
		public static void main(String args[])
		{  
			new Awtev2();
		}
}
