package Proxy;

import FlyPattern.PieceFactory;

public class CLocalPicShow implements Runnable,IShowPic{
   private IShowPic pic;
   private String Picname;
    @Override
    public void ShowPic(String Picname) {
        pic =new CRemoPic();
        this.Picname=Picname;
        System.out.println(""+Picname);
        Thread th =new Thread(this);
        th.run();
    }
    
    @Override
    public void run() {
        pic.ShowPic(Picname);
        System.out.println(Picname);
    }
}
