class OPD{
    final double pi = 3.14;
    double area(double r){
        return pi*r*r;
    }
    double area(double r,double h){
        return r*h;
    }
    double area(double r,double h,double l){
        return r*h*l;
    }
}
public class overloadingdemo {
    public static void main(String[] arg) {
        OPD a1 = new OPD();
        System.out.println("Area of triangle is "+a1.area(2.5,3.5,4.5));
        System.out.println("Area of circle is "+a1.area(4.5));
        System.out.println("Area of rectangle is "+a1.area(3.5,4.5));

    }
}
