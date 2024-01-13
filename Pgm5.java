//write gui pgm in awt for mini calculator
import java.awt.*;
import java.awt.event.*;

public class Pgm5 extends Frame implements ActionListener
{
	
	private Button b1,b2,b3,b4,b5,b6;
	private TextField t1,t2,t3;
	private Label l1,l2,l3;
	public Pgm5()
	{
		
		b1=new Button("+");
		b2=new Button("-");
		b3=new Button("*");
		b4=new Button("/");
		b5=new Button("%");
		b6=new Button("root");

		Font f=new Font("Times New Roman",Font.BOLD,16);
		b1.setFont(f);
		b2.setFont(f);
		b3.setFont(f);
		b4.setFont(f);
		b5.setFont(f);
		b6.setFont(f);
		
		l1=new Label("Enter 1st number:");
		l2=new Label("Enter 2nd number:");
		l3=new Label("Result");

		t1=new TextField(40);
		t2=new TextField(40);
		t3=new TextField(40);

		l1.setFont(f);
		l2.setFont(f);
		l3.setFont(f);

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);

		this.setLayout(null);
		
		l1.setBounds(40,100,150,100);
		l2.setBounds(40,200,150,100);
		l3.setBounds(40,300,150,100);
		t1.setBounds(200,100,150,100);
		t2.setBounds(200,200,150,100);
		t3.setBounds(200,300,150,100);
		b1.setBounds(40,400,150,100);
		b2.setBounds(150,400,150,100);
		b3.setBounds(250,400,150,100);
		b4.setBounds(350,400,150,100);
		b5.setBounds(450,400,150,100);
		b6.setBounds(550,400,150,100);
		this.add(l1);
		this.add(l2);
		this.add(l3);
		this.add(b1);
		this.add(b2);
		this.add(b3);
		this.add(b4);
		this.add(b5);
		this.add(b6);
		this.add(t1);
		this.add(t2);
		this.add(t3);
		
		this.setSize(900,1000);
		this.setVisible(true);


	}




	public void actionPerformed(ActionEvent e)
	{
		String str=e.getActionCommand();
		String str1=t1.getText();
		String str2=t2.getText();
		
		int i=Integer.parseInt(str1);
		int j=Integer.parseInt(str2);

		if(str.equals("+"))
		{
			int k=i+j;
			t3.setText(Integer.toString(k));
		}

		else if(str.equals("-"))
		{
			int k=i-j;
			t3.setText(Integer.toString(k));
		}

		else if(str.equals("*"))
		{
			int k=i*j;
			t3.setText(Integer.toString(k));
		}

		else if(str.equals("/"))
		{
			float k=((float)i)/j;
			t3.setText(Float.toString(k));
		}

		else if(str.equals("%"))
		{
			int k=i%j;
			t3.setText(Integer.toString(k));
		}


		else 
		{
			double k=Math.sqrt(i);
			t3.setText(Double.toString(k));
		}

		

	}

	public static void main(String args[])
	{
		Pgm5 p5=new Pgm5();
	}
}