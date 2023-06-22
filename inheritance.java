//Single level inheritance
class superclass {
    public void dispSup(){
        System.out.println("Superclass method called....");
    } 
    
}
class subclass extends superclass{
    public void dispSub(){
        System.out.println("Subclass method called....");
    } 
}
class lowerclass extends subclass{
    public void dispLower(){
        System.out.println("Lowerclass method called....");
    } 
}

public class inheritance{
    public static void main(String[] args) {
        lowerclass s1 = new lowerclass();
        s1.dispSub();
        s1.dispSup();
        s1.dispLower();
    }
}


