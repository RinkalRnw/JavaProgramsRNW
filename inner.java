public class inner {
    int a=10;
    public class abc {
        int b=20;
        void add(){
            System.out.println("addition is "+(a+b));
        }
    }
    void display(){
        System.out.println("display method called....");
        abc a1 = new abc();
        System.out.println("Inner class abc method called....");
        a1.add();
    }    
}
