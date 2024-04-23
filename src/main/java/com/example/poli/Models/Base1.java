package com.example.poli.Models;

import java.util.ArrayList;

public class Base1 implements BaseMain{
    private ArrayList<Student>list1;

    public Base1(ArrayList<Student> list1) {
        this.list1 = list1;
    }

    public ArrayList<Student> getList1() {
        return list1;
    }

    public void setList1(ArrayList<Student> list1) {
        this.list1 = list1;
    }
    public boolean salvars(Student student) {
        return list1.add(student);
    }
    public boolean actus(Student student) {
        for (int i=0;i<list1.size();i++){
            Student students = list1.get(i);
            if (students.getNombre()==student.getNombre()){
                list1.set(i,student);
                return true;
            }
        }
        return false;
    }
    public Base1(){
        list1=new ArrayList<>();
    }
    public ArrayList<Student> getEstudiantes() {
        return list1;
    }
}
