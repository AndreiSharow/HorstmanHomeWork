package Inheritance;

import java.util.Objects;

public class LabeledPoint extends Point {
    private String label;

    public LabeledPoint(String label, double x, double y) {
        super(x, y);
        this.label=label;
    }
    public String getLabel(){ return label; }


    @Override
    public int hashCode() {
        return Objects.hash(label,super.hashCode());
    }



    @Override
    public boolean equals(Object obj) {
        LabeledPoint point=(LabeledPoint)obj;
        return this.label.equals(point.label);
    }


    //This method demonstrates the use of protected variables in the super class
    @Override
    public String toString() {
        return "[ x="+super.x+" y="+super.y+" label="+this.label+" ]";
    }
}
