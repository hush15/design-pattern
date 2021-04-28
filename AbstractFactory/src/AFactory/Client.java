package AFactory;

public class Client {
    public static void main(String[] args) {
        AConF AF = new AConF();
        AF.CreateF().eat();
        AConV AV = new AConV();
        AV.CreateV().eat();
        BConF BF = new BConF();
        BF.CreateF().eat();
        BConV BV = new BConV();
        BV.CreateV().eat();
    }
}
