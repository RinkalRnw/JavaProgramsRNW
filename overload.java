//Method overloading
class testData{
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
public class overload {
    public static void main(String[] args) {
        testData t1 = new testData();
        System.out.println("Area of triangle is "+t1.area(2.5,6.5,4.5));        
        System.out.println("Area of circle is "+t1.area(2.5));
        System.out.println("Area of rectangle is "+t1.area(2.5,6.5));

    }
}
