package Interface;

import AbstracSinif.Acces_Modifieres.ProtectedIstifadesi;

import java.util.ArrayList;

public class Interface1 {
    public static void main(String[] args) {
        Alma alma =new Alma();
        YeyileBilen almaa = new Alma();
        YeyileBilen qoyun = new Qoyun();



        ArrayList<YeyileBilen> yeyilebilinenseyler = new ArrayList<>();
    }
}

interface YeyileBilen{
    void yemesekli();
}
class Alma extends ProtectedIstifadesi implements YeyileBilen{
    @Override
    protected void protectedMethod() {
        super.protectedMethod();
    }

    void almaMetodu(){}

    @Override
    public void yemesekli() {

    }
}
class Qoyun implements YeyileBilen{
    @Override
    public void yemesekli() {

    }
}