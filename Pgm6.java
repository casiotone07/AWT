/*
write java program to create form having 4 checkboxes, one for Hindi, Marathi, English and Sanskrit, and ask user to select the languages he/she can speak. Accordingly display the selected languages in text area
*/

import java.awt.*;
import java.awt.event.*;

public class Pgm6 extends Frame implements ItemListener
{
	private Checkbox cb1,cb2,cb3,cb4;
	private Label l1;
	private TextArea ta;
/*
Explanation: TextArea is bigger than TextField. In TextField we can type only 1 line of text. In TextArea we can type multiple lines of text. 

Checkbox is awt component with square shape. We can select multiple checkboxes. 
When we click on checkbox, ItemEvent is generated. To handle the ItemEvent generated, we need ItemListener. 
*/

	public Pgm6()
	{
		cb1=new Checkbox("Hindi");
		cb2=new Checkbox("Marathi");
		cb3=new Checkbox("English");
		cb4=new Checkbox("Sanskrit");
		ta=new TextArea(5,30);
/*
Explanation: When we create TextArea object we must mention no. of rows as 1st argument and no. of columns as 2nd argument.
*/
		l1=new Label("Enter your spoken languages");
		Font f=new Font("Times New Roman", Font.BOLD,16);
		l1.setFont(f);

		this.setLayout(null);

		l1.setBounds(40,100,200,100);
		cb1.setBounds(300,100,80,30);
		cb2.setBounds(400,100,80,30);
		cb3.setBounds(500,100,80,30);
		cb4.setBounds(600,100,80,30);
		ta.setBounds(40,300,100,100);

		this.add(l1);
		this.add(cb1);
		this.add(cb2);
		this.add(cb3);
		this.add(cb4);
		this.add(ta);

		cb1.addItemListener(this);
		cb2.addItemListener(this);
		cb3.addItemListener(this);
		cb4.addItemListener(this);

		this.setSize(900,1000);
		this.setVisible(true);
		
	}

	public void itemStateChanged(ItemEvent e)
	{
		ta.setText(" ");
		if(cb1.getState()==true)
		{
			ta.append("Hindi\n");
			//the above statement will only add new text Hindi to end of previous text in textarea
		}

		if(cb2.getState()==true)
		{
			ta.append("Marathi\n");
			
		}

		if(cb3.getState()==true)
		{
			ta.append("English\n");
			
		}

		if(cb4.getState()==true)
		{
			ta.append("Sanskrit\n");
			
		}
	}

	public static void main(String args[])
	{
		Pgm6 p6=new Pgm6();
	}
}