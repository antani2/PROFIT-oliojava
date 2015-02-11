package java2;

public class Piste {

    private double x;
    private double y;
    
    public Piste() {
        x = 0;
        y = 0;
    }
    public Piste(double x0, double y0) {
        x = x0;
        y = y0;
    }
    
    public double getX(){
        return x;
    }
    
    public double getY(){
        return y;
    }    
    
    public void setX(double uusiX){
        x = uusiX;
    }
    
    public void setY(double uusiY){
        y = uusiY;
    }        
}
