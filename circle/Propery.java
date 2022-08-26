package circle;

public class Propery {
    private static final int invalid = -1;

    private  double radius;

    public Propery (double rad){
        setRadius(rad);
    }
    public void setRadius(double r) {
        if (r > 0) {
        radius = r;
        } 
         else {
        radius = invalid;
        }
        }
    public boolean isRadiusValid(){
        return radius !=invalid;
    }

    public double getArea() {
        double result  = invalid;
        if (isRadiusValid()){
            result = Math.PI *radius*radius;
        }
        return result;  
    }
    public double getCircumfrence() {
        double result = invalid;  
        if (isRadiusValid()){
            result = 2*Math.PI *radius;
        }
        return result; 
    }
    public double getDiameter() {
        double result = invalid;  
        if (isRadiusValid()){
            result = 2*radius;
        }
        return result;  
    }
    

}
