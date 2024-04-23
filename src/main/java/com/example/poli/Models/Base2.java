package com.example.poli.Models;

import java.util.ArrayList;

public class Base2 implements BaseMain{
    private ArrayList<Student> list2;

    public Base2(ArrayList<Student> list1) {
        this.list2 = list1;
    }

    public ArrayList<Student> getList2() {
        return list2;
    }

    public void setList2(ArrayList<Student> list2) {
        this.list2 = list2;
    }
    public boolean salvars(Student student) {
        return list2.add(student);
    }
    public boolean actus(Student student) {
        for (int i=0;i<list2.size();i++){
            Student students = list2.get(i);
            if (students.getNombre()==student.getNombre()){
                list2.set(i,student);
                return true;
            }
        }
        return false;
    }
    public Base2(){
        list2=new ArrayList<>();
    }
}
