// import java.io.ObjectInputFilter.Status;
//Static member(variable) & static methods(functions)
public class abc {
    static int x,y;
   public static void displayData() {
    System.out.println("Addition is "+(x+y));
   }
    public static void main(String[] args) {
        // abc objA = new abc();
        xyz objB = new xyz();
        x = 12;
        y = 25;
        // objA.displayData(); 
        displayData(); 
        objB.name();       
    }
}
