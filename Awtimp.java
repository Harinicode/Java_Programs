import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JScrollPane.*;
import javax.swing.event.*;
class Awtimp
{
	JButton b,b1;
	JFrame f;
	JTextArea ta;
	JTextField t1,t2;
	JLabel l1,l2;
	JCheckBox c1,c2;
	ButtonGroup bb;
	JRadioButton r1;
	JComboBox<String> jb;
	JScrollPane j;
	JList<Integer>  jl;
	Awtimp()
	{
		f=new JFrame();
		b=new JButton("Add");
		t1=new JTextField(10);
		t2=new JTextField(10);
		l1=new JLabel();
		l2=new JLabel();
		bb=new ButtonGroup();
		r1=new JRadioButton("GG");
		ta=new JTextArea(20,20);
		j=new JScrollPane(ta);
		String i[]={"1","2","3","4","5"};
		jb=new JComboBox<>(i);
		Integer ii[]={3,4,5,6};
		jl=new JList<>(ii);
		b.setBounds(100,95,80,30);
		f.add(t1);
		f.add(t2);
		f.add(b);
		f.add(jb);
		f.add(jl);
		c1=new JCheckBox("Yes");
		c2=new JCheckBox("Yep");
		b1=new JButton(" OK");
		f.add(c1);
		f.add(c2);
		bb.add(r1);
		f.add(r1);
		f.add(b1);
		f.add(l1);
		f.add(l2);
		f.add(j);
		
		b.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				addition();
			}
		});
		c1.addItemListener(new ItemListener()
		{
			public void itemStateChanged(ItemEvent i)
			{
				l1.setText("YES "+(i.getStateChange()==1?"Selected":"Not selected"));
			}
		});
		c2.addItemListener(new ItemListener()
		{
			public void itemStateChanged(ItemEvent i)
			{
				l1.setText("YEP "+(i.getStateChange()==1?"Selected":"Not selected"));
			}
		});
		b1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if(c1.isSelected())
				{
					ta.setText("YYES selected");
				}
				if(c2.isSelected())
				{
					ta.append("Yep selected");
				
				}
				if(r1.isSelected())
                JOptionPane.showMessageDialog(f, "GG Selected");
				//display();
				if(jb.getSelectedItem()==null)
				ta.setText("Select the items");
				else
				{
					ta.append("\n Selected Item  are "+jb.getSelectedItem());
				}
				if(jl.getSelectedValue()==null)
					ta.setText("Select the List items");
				else
				{
					ta.append("\n Selected Item  are "+jl.getSelectedValue());
				}
			}
           
        });
		f.setDefaultCloseOperation(f.DISPOSE_ON_CLOSE);
		f.setSize(300,300);
		f.setLayout(new FlowLayout());
		f.setVisible(true);
	
	}
	
	void addition()
	{
		try
		{
		int a=Integer.parseInt(t1.getText());
		int b=Integer.parseInt(t2.getText());
		ta.setText("Result: "+(a+b));
		}
		catch(Exception e)
		{
			ta.setText("Invalid Input");
		}
	
	
	}
	
	public static void main(String args[])
	{
		new Awtimp();
	}
}
	
