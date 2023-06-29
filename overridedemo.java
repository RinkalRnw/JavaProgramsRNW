abstract class efgTest{
    abstract void area(double r,double pi,String name);
}
class efgChild extends efgTest{
    void area(double r,double pi,String name){
        System.out.println("Area of circle is "+(pi*r*r));
        System.out.println("Name is "+name);

    }
}
public class overridedemo {
    public static void main(String[] arg) {
        efgChild e1 = new efgChild();
        e1.area(Double.parseDouble(arg[0]),Double.parseDouble(arg[1]),arg[2]);
    }
}
