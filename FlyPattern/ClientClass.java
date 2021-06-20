package FlyPattern;

import java.util.Random;

public class ClientClass {
    public static void main(String[] args) {
        Random rm =new Random();
        PieceFactory pFactory =new PieceFactory();
        for(int i=0;i<19;i++){
            for(int j=0;j<19;j++){
                APiece p;
                if(rm.nextInt()%2==0)
                    p= pFactory.GetPiece("白棋");
                else
                    p= pFactory.GetPiece("黑棋");
                p.play(rm.nextInt(19),rm.nextInt(19));
            }
        }
        System.out.println(PieceFactory.GetPieceCount());
    }
   
}
