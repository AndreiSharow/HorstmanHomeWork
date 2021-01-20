package ObjectOrientedProg;

public  class Point {

        private double x;
        private double y;

       public Point(){
            this.x=0;
            this.y=0;
        }
       public  Point(double x, double y){
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
            Point point=new Point(this.x+x,this.y+y);
            return point;
        }

        public Point scale(double coef){
            Point point=new Point(this.x*coef,this.y*coef);
            return point;
        }
        public String toString(){

           return "x:"+getX()+" "+"y:"+getY();

        }



    }






