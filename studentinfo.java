
class parentClass{    
    int a,b;
    
    parentClass(int p, int q) {
        this.a = p;
        this.b = q;
    }
    public void display(){
        System.out.println("Multiply is "+(a*b));
    }
    
}
class childClass extends parentClass{
    int a,b,c;
    childClass(int a,int b,int c){
        super(a,b);
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public void display() {
        super.display();
        System.out.println("Addition is "+(a+b+c));
    }
}

public class studentinfo {
    public static void main(String[] args) {
        childClass x1 = new childClass(15,5,30);
        // x1.getData();
        x1.display();
    }
}
