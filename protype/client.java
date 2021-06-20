package protype;

public class client {
    public static void main(String[] args) {
        MyFruit fru1 = new Apple();
        MyFruit fru2 = fru1;
        fru1.Display();
        fru2.Display();
        System.out.println("fru1:"+fru1.hashCode());
        System.out.println("fru2:"+fru2.hashCode());
        
        MyFruit fru3 = new Banana();
        MyFruit fru4 = (MyFruit) fru3.clone();
        fru3.Display();
        fru4.Display();
        System.out.println("fru3:"+fru3.hashCode());
        System.out.println("fru4:"+fru4.hashCode());
    }
}
