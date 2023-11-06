import java.awt.*;
import java.awt.event.*;
class Awtev extends Frame implements ActionListener
{
	TextField t;
		Awtev()
		{
			t=new TextField();
			t.setBounds(90,100,150,50);
			Button b=new Button("Click Mother");
			b.setBounds(100,40,70,50);
			add(b);
			add(t);
			setTitle("Harini developed for mother");
			b.addActionListener(this);
			setSize(300,300);
			setLayout(null);
			setVisible(true);
			
		}
		public void actionPerformed(ActionEvent e)
		{
			t.setText("YOU ARE AWESOME");
		}
		public static void main(String args[])
		{
			new Awtev();
		}
}
