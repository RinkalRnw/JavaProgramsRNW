class A{
    double r;
    double pi=3.14;
    A(double r){
        this.r = r;
    }
    double areaCircle(){
        return pi*r*r;
    }
}
class B extends A{
    double r,h;
    
    B(double r,double h){
        super(r);
        this.r = r;
        this.h = h;
        
    }
    double areaRect(){
        return r*h;
    }
}
class C extends A{
    double r,l,h;
    C(double r,double h,double l){
        super(r);
        this.r = r;
        this.h = h;
        this.l = l;
    }
    double areaTriangle(){
        return r*h*l;
    }
}
public class hierarchy {
    public static void main(String[] args) {
        B b1 = new B(2.5,15.2);
        System.out.println("Area of rectangle is "+b1.areaRect());
        System.out.println("Area of circle is "+b1.areaCircle());
        C c1 = new C(12.5,5.6,7.8);
        System.out.println("Area of triangle is "+c1.areaTriangle());
        System.out.println("Area of circle is "+c1.areaCircle());
        
    }
}
