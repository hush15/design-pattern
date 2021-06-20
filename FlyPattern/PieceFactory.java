package FlyPattern;

import java.util.HashMap;

public class PieceFactory {
    private static HashMap PiecePool =new HashMap();
    public APiece GetPiece(String key){
        if(!PiecePool.containsKey(key)){
            APiece p=new OnePiece(key);
            PiecePool.put(key, p);
            return p;
            }
        return (APiece) PiecePool.get(key);
    }
    public static int GetPieceCount(){
        return  PiecePool.size();
    }
}
