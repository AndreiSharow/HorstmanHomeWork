package Inheritance;

 class Rectangle extends Shape{
     private double width;
     private double height;

     Rectangle(Point topLeft, double width,double height){
     super(topLeft);
     this.width=width;
     this.height=height;

     }

     @Override
     protected Rectangle clone() throws CloneNotSupportedException {
        Rectangle rectangle=(Rectangle)super.clone();
        rectangle.point=new Point(point.getX(),point.getY());
         return rectangle;
     }

     public double getWidth(){
         return width;
     }
     public double getHeight(){
         return height;
     }


}
