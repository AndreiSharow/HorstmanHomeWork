package Inheritance;

 class Circle extends Shape{
    private double radius;

     Circle(Point center, double radius) {
         super(center);
         this.radius = radius;
     }

    public double getRadius(){
         return radius;
    }



     @Override
     protected Circle clone() throws CloneNotSupportedException {
         Circle circle=(Circle)super.clone();
         circle.point=new Point(point.getX(),point.getY());
         return circle;
     }
 }
