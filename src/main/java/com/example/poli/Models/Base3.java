package com.example.poli.Models;

import java.util.ArrayList;

public class Base3 implements BaseMain{
    private ArrayList<Student> list3;

    public Base3(ArrayList<Student> list3) {
        this.list3 = list3;
    }

    public ArrayList<Student> getList3() {
        return list3;
    }

    public void setList3(ArrayList<Student> list3) {
        this.list3 = list3;
    }
    public boolean salvars(Student student) {
        return list3.add(student);
    }
    public boolean actus(Student student) {
        for (int i=0;i<list3.size();i++){
            Student students = list3.get(i);
            if (students.getNombre()==student.getNombre()){
                list3.set(i,student);
                return true;
            }
        }
        return false;
    }
    public Base3(){
        list3=new ArrayList<>();
    }
}
