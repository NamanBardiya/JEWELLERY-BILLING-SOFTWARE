/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minid9;

/**
 *
 * @author VASUDHA SHAH
 */
public class Student {
    private int rollno;
    private String name;;
    private float marks;

    public Student() {
        
    }

    public Student(int rollno, String name, float marks) {
        this.rollno = rollno;
        this.name = name;
        this.marks = marks;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getMarks() {
        return marks;
    }

    public void setMarks(float marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" + "rollno=" + rollno + ", name=" + name + ", marks=" + marks + '}';
    }
    
}
