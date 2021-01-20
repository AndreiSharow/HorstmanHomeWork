package Inheritance;

 class Line extends Shape {
    private Point from;
    private Point to;

     Line(Point from, Point to){
         super(null);
         this.from=from;
         this.to=to;
         point=new Point(from.getX()+to.getX(),from.getY()+to.getY());
     }

     public  Point getFrom(){
         return from;
     }
     public  Point getTo(){
         return to;
     }


     @Override
     protected Line clone() throws CloneNotSupportedException {
         Line line=(Line)super.clone();
         line.point=new Point(point.getX(),point.getY());
         line.from=new Point(this.from.getX(),this.from.getY());
         line.to=new Point(this.to.getX(),this.to.getY());
         return line;
     }
 }
