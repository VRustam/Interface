package Interface;

import java.util.ArrayList;

public class interface2 {
    public static void main(String[] args) {
    Ekinciler biznesmen1 = new Biznesmen1();
    Ekinciler biznesmen2 = new Biznesmen2();

    Ekinciler index[] = new Ekinciler[10];
    index[0] = biznesmen1;
    index[1] = biznesmen2;

    ArrayList<Ekinciler>firmalar = new ArrayList<>();
    firmalar.add(biznesmen1);
    firmalar.add(biznesmen2);

    biznesmen1.torpaqdaEkirler();


    }

}

interface Isci{
    void isleyir();
    void maasAlir();
    default void Adinide(){
        System.out.println("Men Isci Interface- yim");
    };

}
interface Telebe extends Isci{
    void dersegeler();
    void dersdanisar();
}
interface UniversiteyeTelebesi{
    void finallarahazirlas();
}
class Student implements Telebe,UniversiteyeTelebesi{
    @Override
    public void isleyir() {

    }

    @Override
    public void maasAlir() {

    }

    @Override
    public void dersegeler() {

    }

    @Override
    public void dersdanisar() {

    }

    @Override
    public void finallarahazirlas() {

    }
}
abstract class Fermer implements Isci{
    abstract void isdiyir();
}

interface Ekinciler extends Isci {
    void torpaqdaEkirler();
    void torpaqiSulayirlar();
    static final int Traxtor = 10;
}
interface Quscular{
    void ToyuqlarinYumurtalarini();
}


class Biznesmen1 implements Ekinciler{

    @Override
    public void torpaqdaEkirler() {
        System.out.println("Torpaqi becerirler");
    }

    @Override
    public void torpaqiSulayirlar() {

    }

    @Override
    public void isleyir() {

    }

    @Override
    public void maasAlir() {

    }
}
class Biznesmen2 implements Ekinciler{
    @Override
    public void torpaqdaEkirler() {

    }

    @Override
    public void torpaqiSulayirlar() {

    }

    @Override
    public void isleyir() {

    }

    @Override
    public void maasAlir() {

    }
}