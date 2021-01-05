package Interface;

public class InterfaceOzel {
    public static void main(String[] args) {
    SinifA a=new SinifA();
    a.metotdA();
    boolean cavab=Interaface1.emailYoxlanmasi("sasa@sasa.ru");
        System.out.println(cavab);


    }
}
interface Interaface1{
    void metotdA();
    default void MetodB(){
        System.out.println("test1");
    }
    static final int say=1;

    static boolean emailYoxlanmasi(String mail){
        if(mail.contains("@")){
            return true;
        }else return false;

    }

}
class SinifA implements Interaface1{

    @Override
    public void metotdA() {
        MetodB();
    }

    @Override
    public void MetodB() {
        System.out.println("Men Sinif A icindeki metodam");
    }
}