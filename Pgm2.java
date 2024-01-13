/*
Write a gui pgm using awt to display frame containing 2 labels named  Enter name, Enter roll No, 2 Text Feilds and 1 button. Add all components to the frame using null layout.
*/

import java.awt.*;

public class Pgm2{
	private Label l1,l2;
	private TextField t1,t2;
	private Button b1;
	private Frame f1;

	public Pgm1(){ //Constuctor
	
	l1 = new Label("Enter Name");
	l2 = new Label("Enter Roll No");
	l1.setFont(new Font("Times New Roman",Font.BOLD,30));
	l2.setFont(new Font("Times New Roman",Font.BOLD,30));

	tf1 = new TextField(20);
	tf2 = new TextField(20);

	b1 = new Button("Submit");
	this.setLayout(null);

	l1.setBounds(80,100,200,200);
	l2.setBounds(80,300,10,200);
	t1.setBounds(380,100,200,200);
	t2.setBounds(80,200,200,200);
	
	b1.setBounds(80,300,10,10);


	f1.add(l1);
	f1.add(l2);
	f1.add(t1);
	f1.add(t2);
	f1.add(b1);

	f1.setBackground(Color.BLUE); //Blue is the predefine public static and final contant data member of Color Class

	l1.setForeground(Color.RED);
	l2.setForeground(Color.RED);
	b1.setForeground(Color.GREEN);

	f1.setSize(700,800);
	f1.setTitle("This is the First GUI Program");
	f1.setVisible(true);	
	}

	public static void main(String args[]){
	
		Pgm2 p2=new Pgm2();
	}
}


