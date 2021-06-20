package Proxy;

public class CRemoPic implements IShowPic {
    
    @Override
    public void ShowPic(String Picname) {
        for(int i=0;i<3;i++){
            System.out.println(i+1);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
