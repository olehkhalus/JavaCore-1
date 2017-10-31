package Exception.Task1;

public class Square {
    public int a;
    public int b;
    public int squareRectangle(){
        if(a<0 || b<0) throw new IllegalArgumentException("side can't be less zero");
        return a*b;

    }
    public  Square(int a, int b){
        this.a = a;
        this.b = b;


    }
}
