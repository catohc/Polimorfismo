package com.example.poli.Models;

import java.util.ArrayList;

public class Server {
    private ArrayList<BaseMain> listf = new ArrayList<>();
    private BaseMain baseMain;
    private Base1 base1;
    private Base2 base2;
        private Base3 base3;
    public Server(BaseMain baseMain1){
            this.baseMain = baseMain;
            base1=new Base1();
            base2=new Base2();
            base3=new Base3();

            listf.add(base1);
            listf.add(base2);
            listf.add(base3);
    }
    public void salvar(Student student){
        for (BaseMain baseMain1 : listf){
            baseMain1.salvars(student);
        }
    }
    public void actu(Student student){
        for (BaseMain item:listf){
            item.actus(student);
        }
    }

    public Base1 getBase1() {
        return base1;
    }

    public Base2 getBase2() {
        return base2;
    }

    public Base3 getBase3() {
        return base3;
    }
}
