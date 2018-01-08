import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
class abc extends JFrame implements ChangeListener
{
	JLabel l;
	JSlider s,s1,s3;
	public static void main(String ar[])
	{
		abc a=new abc();
	}
	abc()
	{
		Container cn=getContentPane();
		l=new JLabel("");
		l.setBounds(300,75,250,200);
		JButton b=new JButton("click");
		cn.add(b);
		cn.setLayout(null);
		s=new JSlider(0,255);
		s1=new JSlider(0,255);
		s3=new JSlider(0,255);
		s.addChangeListener(this);
		s1.addChangeListener(this);
		s3.addChangeListener(this);
		//cn.setBackground(Color.red);
		b.setBounds(30,30,75,25);
		s.setBounds(30,75,250,50);
		s1.setBounds(30,155,250,50);
		s3.setBounds(30,235,250,50);
		cn.add(l);
		cn.add(s1);
		cn.add(s);
		cn.add(s3);
		l.setOpaque(true);
		setSize(600,600);
		setVisible(true);
	}
	public void stateChanged(ChangeEvent ch)
	{
		Color cl=new Color(s.getValue(),s1.getValue(),s3.getValue());
		l.setBackground(cl);	
	}	
}
