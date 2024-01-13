//pgm for choice control
/*
Choice is predefined class in java.awt package. Choice control helps to display single option in form of drop down list. We can select any 1 of them

Write java program to display drop down list of countries, and user should be able to select any 1 country and country selected must be displayed on screen

When we click on Choice an item event is generated. To handle it we use ItemListener
*/

import java.awt.*;
import java.awt.event.*;

class ChoicePgm extends Frame implements ItemListener
{
	private Choice c1;
	private TextField tf;

	public ChoicePgm()
	{
		c1=new Choice();
		c1.add("India");
		c1.add("Saudi Arabia");
		c1.add("USA");
		c1.add("UK");
		tf=new TextField(50);
	
		c1.addItemListener(this);
		this.setLayout(null);
	
		c1.setBounds(150,100,150,40);
		tf.setBounds(150,200,150,40);
		this.add(c1);
		this.add(tf);

		this.setSize(800,900);
		
		this.setVisible(true);
	}
	
	public void itemStateChanged(ItemEvent e)
	{
		String str=c1.getSelectedItem();
		tf.setText(str);
	}

	public static void main(String args[])
	{
		ChoicePgm c=new ChoicePgm();
		
	}
}