interface drawable{
    void draw();
}
class Rectangle implements drawable{
    public void draw(){
        System.out.println("Rectangle is callimng..");
    }
}
class triangle implements drawable{
    public void draw(){
        System.out.println("Triangle is callimng..");
    }
}
public class circle {
    public static void main(String[] args){
        drawable d1 = new triangle();
        d1.draw();
        drawable d2 = new Rectangle();
        d2.draw();
    }
}
