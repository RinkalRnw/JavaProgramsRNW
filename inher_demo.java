abstract class abc1{
    abstract void run();
}
class wxyz extends abc1{
    void run(){
        System.out.println("run wxyz method called..");
    }
}
class pqrZ extends abc1{
    void run(){
        System.out.println("run pqrZ method called..");
    }
}  

public class inher_demo {
    public static void main(String[] args) {
        abc1 obj;
        obj = new wxyz();
        obj.run();
        obj = new pqrZ();
        obj.run();
    }
}
