/*
Design gui application in awt which will change background color of the frame when corresponding button is clicked. Define 3 buttons in frame and 3 buttons should have text as bkue, green and yello.
When blue button is clicked the background  color to blue, when green to yellow

*/

import java.awt.*;
import java.awt.event.*;

public class Pgm3 extends Frame implements ActionListener{
	private Button b1,b2,b3;

	public Pgm3(){
	b1 =new Button("Blue");
	b2 =new Button("Green");
	b3 =new Button("Yellow");

	b1.setFont(new Font("Times New Romans",Font.BOLD,25));
	b2.setFont(new Font("Times New Romans",Font.BOLD,25));
	b3.setFont(new Font("Times New Romans",Font.BOLD,25));

	this.setLayout(null);
	b1.setBounds(40,300,150,150);
	b2.setBounds(40,500,150,150);
	b3.setBounds(40,700,150,150);

	this.add(b1);
	this.add(b2);
	this.add(b3);

	b1.addActionListener(this);
	b2.addActionListener(this);
	b3.addActionListener(this);
	this.setSize(700,800);
	this.setVisible(true);

	}

	public void actionPerformed(ActionEvent e){
	
		String str = e.getActionCommand();
		if(str.equals("Blue")){
			this.setBackground(Color.BLUE);
		}
		if(str.equals("Green")){
			this.setBackground(Color.GREEN);
		}
		if(str.equals("Yellow")){
			this.setBackground(Color.YELLOW);
		}

	}

		public static void main(String args[]){
			Pgm3 p3 = new P3();
		}
}







