package com.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.model.Student;

public class StudentDao {

	public int insertStudent(Student s1){
		Connection con=null;
		PreparedStatement pst=null;
		int check =0;
	  try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jap83", "root", "Sopan@123");
		String sql="insert into Student(name,city,percentage)values(?,?,?)";
		pst=con.prepareStatement(sql);
		pst.setString(1, s1.getName());
		pst.setString(2, s1.getCity());
		pst.setDouble(3, s1.getPercentage());
		check =pst.executeUpdate();
	} catch (ClassNotFoundException | SQLException e) {
		
		e.printStackTrace();
	}
	  
	  
	finally {
		  
	  
	   try {
	   con.close();
		pst.close();
	   } catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	   }
	  
	}
	  return check;
	}
        public int DeleteStudentById(int id) {
		  int check=0;
		  Connection con=null; 
		  PreparedStatement pst=null;
		  
		  try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jap83", "root", "Sopan@123");
			String sql="delete from student where id=?";
			pst=con.prepareStatement(sql);
			pst.setInt(1, id);
			check =pst.executeUpdate();
			
			
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		} 
		  finally {
			  
			  
			   try {
			   con.close();
				pst.close();
			   } catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			   }
		  
		  }
		  return check;
        	
        	
        }	
        
        public Student findStudentById(int id) {
        	PreparedStatement pst=null;
        	Connection con=null;
        	ResultSet rs=null;
        	Student s=null;
        	try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jap83","root","Sopan@123");
				String sql="select id,name,city,percentage from Student where id=?";
				pst =con.prepareStatement(sql);
				pst.setInt(1, id);
				rs= pst.executeQuery();
				while(rs.next()) {
				     s = new Student();
					s.setId(rs.getInt("id"));
					s.setName(rs.getString("Name"));
					s.setCity(rs.getString("city"));
					s.setPercentage(rs.getDouble("percentage"));
					
				}
			} catch (ClassNotFoundException | SQLException e) {
			
				e.printStackTrace();
			}
        	finally {
  			  
  			  
 			   try {
 			  rs.close();	   
 			   con.close();
 				pst.close();
 			   } catch (SQLException e) {
 				// TODO Auto-generated catch block
 				e.printStackTrace();
 			   }
 		  
 		  }
        	
        	return s;
        	
        	
			
        	
        	
        }
        	
}
