/*
Write a gui pgm using awt to display frame containing 2 labels named  Enter name, Enter roll No, 2 Text Feilds and 1 button. Add all components to the frame using null layout.
*/

import java.awt.*;

public class Pgm1 extends Frame{
	private Label l1,l2;
	private TextField t1,t2;
	private Button b1;

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


	this.add(l1);
	this.add(l2);
	this.add(t1);
	this.add(t2);
	this.add(b1);

	this.setBackground(Color.BLUE); //Blue is the predefine public static and final contant data member of Color Class

	l1.setForeground(Color.RED);
	l2.setForeground(Color.RED);
	b1.setForeground(Color.GREEN);

	this.setSize(700,800);
	this.setTitle("This is the First GUI Program");
	this.setVisible(true);	
	}

	public static void main(String args[]){
	
		Pgm1 p1=new Pgm1();
	}
}


