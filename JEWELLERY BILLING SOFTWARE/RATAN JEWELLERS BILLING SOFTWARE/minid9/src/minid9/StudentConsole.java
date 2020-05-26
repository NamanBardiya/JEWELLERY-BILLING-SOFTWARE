/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minid9;

import java.io.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author VASUDHA SHAH
 */
public class StudentConsole {
    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    StudentDB sdb;

    public StudentConsole() {
        sdb=new StudentDB();
    }
    public void start() throws IOException
    {
        while(true)
        {
            System.out.println(".....MENU.....");
            System.out.println("1.add student");
            System.out.println("2.show all");
            System.out.println("3.search");
            System.out.println("4.edit");
            System.out.println("5.remove");
            System.out.println("6.exit");
            System.out.println("enter your now...");
            int choice=Integer.parseInt(br.readLine());
            switch(choice)
            {
                case 1:
                    add();
                    break;
                case 2:
                    showall();
                    break;
            
                case 3:
                    search();
                    break;
                case 4:
                    edit();
                    break;
                case 5:
                    remove();
                    break;
                case 6:
                    System.out.println("program ends...");
                    System.exit(0);
                    break;
                default:System.out.println("you entered wrong choice...");
            
            
            
            
            }
        }
    }
    void add()
    {
        Student s=read();
        sdb.addStudent(s);
    }
    Student read()
    {
        Student s=null;
        try {
            
            System.out.println("enter the data (r,n,m):");
            int rollno=Integer.parseInt(br.readLine());
            String name=br.readLine();
            float marks=Float.parseFloat(br.readLine());
            s=new Student(rollno,name,marks);
        } catch (IOException ex) {
            Logger.getLogger(StudentConsole.class.getName()).log(Level.SEVERE, null, ex);
        }
        return s;
    }
    void showall()
    {
        Student s;
        ArrayList<Student> stList=sdb.getList();
        if(stList.isEmpty())
        {
            System.out.println("list is empty...");
            return;
        }
        for(int i=0;i<stList.size();i++)
        {
            s=stList.get(i);
            System.out.println(s);
        }
    }
    void search() throws IOException
    {
        System.out.println("enter the name of student to be searched...");
        String target=br.readLine();
        int i=sdb.searchByName(target);
        if(i==-1)
        {
            System.out.println("student not found");
    }
        else
        {
            System.out.println("found...the details are");
            System.out.println(sdb.getList().get(i));
        }
        
    }
    void edit() throws IOException
    {
       
        System.out.println("enter the name of student to be modified...");
        String target=br.readLine();
        int i=sdb.searchByName(target);
        Student s=sdb.getList().get(i);
        if(i==-1)
        {
            System.out.println("student not found");
    }
        else
        {
            Student news;
            System.out.println("found...the details are");
            System.out.println(s);
            System.out.println("enter the data for modified student");
            news=read();
            sdb.setStudent(s, news);
        }
    }
    void remove() throws IOException
    {
        System.out.println("enter the name of student to be modified...");
        String target=br.readLine();
        int i=sdb.searchByName(target);
        Student s=sdb.getList().get(i);
        if(i==-1)
        {
            System.out.println("student not found");
    }
        else
        {
  
            System.out.println("found...the details are");
            System.out.println(s);
            sdb.removeStudent(s);
            System.out.println("removed successfully...");
    }
        
}
}