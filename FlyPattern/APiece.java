package FlyPattern;

public abstract class APiece {
    protected String inKind;
    public APiece(String inKind){
        this.inKind=inKind;
    }
    public abstract void play(int x,int y);
}
