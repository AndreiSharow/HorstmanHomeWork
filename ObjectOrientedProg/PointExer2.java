package ObjectOrientedProg;

public class PointExer2{
    private double x;
    private double y;

    public PointExer2(){
        this.x=0;
        this.y=0;
    }
    public PointExer2(double x, double y){
        this.x=x;
        this.y=y;
    }
    public double getX(){
        return this.x;
    }
    public double getY(){
        return this.y;
    }

    public Point tranlate(double x, double y){
        this.x+=x;
        this.y+=y;
        Point point=new Point(this.x,this.y);
        return point;
    }

    public Point scale(double coef){
        this.x*=coef;
        this.y*=coef;
        Point point=new Point(this.x,this.y);
        return point;
    }
    public String toString(){

        return "x:"+getX()+" "+"y:"+getY();

    }


}
