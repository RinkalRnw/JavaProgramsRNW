public class example {
    example(){
        System.out.println("Default Constructor called...");
    }
    example(double d){
        double pi = 3.14;
        double area = pi*d*d;
        System.out.println("Area of Circle is "+area);
    }
    example(int l,int h){
        int area_rect = l*h;
        System.out.println("Area of rectangle is "+area_rect);
    }
    example(double r,double t){
        double a = r*t;
        System.out.println("Example is "+a);
    }
    // void display(){

    // }
    /**
     * @param args
     */
    public static void main(String[] args) {
        example e1 = new example();
        example e2 = new example(2.5);
        example e3 = new example(25,5);
        example e4 = new example(1.2,2.3);
        // e1.display();
    }
    

}
