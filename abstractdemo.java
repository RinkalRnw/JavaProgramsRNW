abstract class abcTest{
    abstract void getData();
}
class xyzChild extends abcTest{
    void getData(){
        System.out.println("Xyz class calling.....");
    }
}

final class pqrChild extends abcTest{
    final int a = 10;
    void getData(){
        System.out.println("Pqr class calling.....");
    }
}

public class abstractdemo {
    public static void main(String[] args) {
        abcTest a1;
        a1 = new xyzChild();
        a1.getData();

        a1 = new pqrChild();
        a1.getData();
    }
}
