/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minid9;

import com.mysql.jdbc.*;
import java.sql.ResultSet;
import java.util.*;
//import java.sql.*;

/**
 *
 * @author VASUDHA SHAH
 */
public class StudentDB {
    private ArrayList<Student> stList;
    Connection con;
    Statement sm;
    PreparedStatement psm;
    ResultSet rs;
    String query;

    public StudentDB() {
        con=ConnectionFactory.getConnection();
        query="create database if not exists college";
        try{
            sm=(Statement) con.createStatement();
            sm.execute(query);
        }
        catch(Exception e){
            e.getMessage();
        }
        try
        {
            query="use college";
            sm.execute(query);
            query="create table student(rollno int(4) ,name varchar(20),marks decimal(6,2), primary key(rollno))";
            sm.execute(query);
            System.out.println("abc");
        }
        catch(Exception e)
        {
            e.getMessage();
        }
        readTable();
    }
    
    void readTable()
    {
        stList=new ArrayList<Student>();
        Student s=null;
        try{
          query="select * from student";
          rs=sm.executeQuery(query);
          while(rs.next())
          {
              int rollno=rs.getInt("rollno");
              String name=rs.getString("name");
              float marks=rs.getFloat("marks");
              s=new Student(rollno,name,marks);
              stList.add(s);
              System.out.println("123");
          }//while
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        
    }
    public void addStudent(Student s)
    {
        
        try
        {
            query="insert into student values(?,?,?)";
            psm=(PreparedStatement) con.prepareStatement(query);
            psm.setInt(1, s.getRollno());
            psm.setString(2,s.getName());
            psm.setFloat(3,s.getMarks());
            psm.execute();
        }
        catch(Exception e)
        {
            e.getMessage();
        }
        readTable();
    }
    public int searchByName(String name )
    {
        for(int i=0;i<stList.size();i++)
        {
            if(stList.get(i).getName().equals(name))
            {
                return i;
            }
        }
        return -1;
    }
    public void removeStudent(Student s)
    {
        
        query="delete from student where name=?";
        try
        {
        psm=(PreparedStatement) con.prepareStatement(query);
         psm.setString(1,s.getName());
         psm.execute();
        }
        catch(Exception e)
        {
            e.getMessage();
        }
        readTable();
    }
    public void setStudent(Student s,Student news)
    {
        query="update student set rollno=?,name=?,marks=? where name=?";
        try
        {
            psm=(PreparedStatement) con.prepareStatement(query);
            psm.setInt(1, news.getRollno());
            psm.setString(2,news.getName());
            psm.setFloat(3,news.getMarks());
            psm.setString(4,s.getName());
            psm.execute();
        }
        catch(Exception e)
        {
            e.getMessage();
        }
        readTable();
    }
    ArrayList<Student> getList()
    {
        return stList;
    }
}
