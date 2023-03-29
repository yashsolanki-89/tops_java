package coreJava;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class SwingDemo  implements ActionListener{
   JFrame f;
   JLabel l1,l2,l3,l4,l5;
   JTextField t1,t2,t3,t4,t5;
   JButton b1,b2,b3,b4;
   
	public SwingDemo() { 
		f=new JFrame("my Swing demo");
		f.setVisible(true);
		f.setSize(370,460);
		f.setResizable(false);
		f.setLayout(null);
		
		l1=new JLabel("Eid");
		l2=new JLabel("Ename");
		l3=new JLabel("job");
		l4=new JLabel("location");
		l5=new JLabel("salary");
		
		t1=new JTextField(20);
		t2=new JTextField(20);
		t3=new JTextField(20);
		t4=new JTextField(20);
		t5=new JTextField(20);
		
		b1=new JButton("insert");
		b2=new JButton("search");
		b3=new JButton("update");
		b4=new JButton("delete");
		
		f.add(l1);
		f.add(t1);
		f.add(l2);
		f.add(t2);
		f.add(l3);		
		f.add(t3);
		f.add(l4);
		f.add(t4);
		f.add(l5);
		f.add(t5);
		
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		
		l1.setBounds(50, 50, 100, 20);
		l2.setBounds(50, 100, 100, 20);
		l3.setBounds(50, 150, 100, 20);
		l4.setBounds(50, 200, 100, 20);
		l5.setBounds(50, 250, 100, 20);
		
		t1.setBounds(150, 50, 150, 20);
		t2.setBounds(150, 100, 150, 20);
		t3.setBounds(150, 150, 150, 20);
		t4.setBounds(150, 200, 150, 20);
		t5.setBounds(150, 250, 150, 20);
		
		b1.setBounds(50, 300, 100, 20);
		b2.setBounds(200, 300, 100, 20);
		b3.setBounds(50, 350, 100, 20);
		b4.setBounds(200,350, 100, 20);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
	}
	public static void main(String[] args) {
		new SwingDemo();
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1)
		{
		 try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","");
			String insertsql="insert into emp(ename,job,location,salary) values('"+ t2.getText()+"','"+ t3.getText()+"','"+ t4.getText()+"','"+ t5.getText()+"')";
			Statement stmt=conn.createStatement();
			stmt.execute(insertsql);
			t2.setText("");
			t3.setText("");
			t4.setText("");
			t5.setText("");
			JOptionPane.showMessageDialog(f, " Data insert");
		} catch (Exception e2) {
			e2.printStackTrace();
		}
		
		}
		else	if(e.getSource()==b2)
		{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","");
			String searchsql="select * from emp where eid=?";
			PreparedStatement pst=conn.prepareStatement(searchsql);
			pst.setInt(1, Integer.parseInt(t1.getText()));
			ResultSet rs=pst.executeQuery();
			if(rs.next())
			{
				t2.setText(rs.getString("ename"));
				t3.setText(rs.getString("job"));
				t4.setText(rs.getString("location"));
				t5.setText(rs.getString("salary"));
			}
			else
			{
				t1.setText("");
				t2.setText("");
				t3.setText("");
				t4.setText("");
				t5.setText("");
				JOptionPane.showMessageDialog(f, "Eid not found");
			}
			
		} catch (Exception e2) {
			e2.printStackTrace();
			}
		
		
		}
		else	if(e.getSource()==b3)
		{
         try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","");
			String updatesql="update  emp set ename=?,job=?,location=?,salary=? where eid=?";
			PreparedStatement pst=conn.prepareStatement(updatesql);
			pst.setString(1, t2.getText());
			pst.setString(2, t3.getText());
			pst.setString(3, t4.getText());
			pst.setString(4, t5.getText());
			pst.setString(5, t1.getText());
			pst.executeUpdate();
			t1.setText("");
			t2.setText("");
			t3.setText("");
			t4.setText("");
			t5.setText("");
			JOptionPane.showMessageDialog(f,"data update");
		} catch (Exception e2) {
			e2.printStackTrace();
		}
		
		}
		else 	if(e.getSource()==b4)
		{
		 try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","");
			String deletesql="delete from emp where eid=?";
			PreparedStatement pst=conn.prepareStatement(deletesql);
			pst.setInt(1, Integer.parseInt(t1.getText()));
			pst.executeUpdate();
			t1.setText("");
			t2.setText("");
			t3.setText("");
			t4.setText("");
			t5.setText("");
			JOptionPane.showMessageDialog(f,"data delete");
		
		} catch (Exception e2) {
		e2.printStackTrace();
		}
		
		}
	
		
	}
}
