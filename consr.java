public class consr {
    int id,age;
    String name;
    consr(){ //default
        System.out.println("Default Constructor called");
    }
    consr(int i,String name,int age){ //parameterized
        this.id=i;
        this.name = name;
        this.age = age;
    }
    consr(int a,int b,int c){
        System.out.println("Addition is "+(a+b+c));
    }
    void display(){
        System.out.println("Id is "+id);
        System.out.println("Name is "+name);
        System.out.println("Age is "+age);
    }
    public static void main(String[] args) {
        consr c1 = new consr();
        consr c3 = new consr(25,15,5);
        consr c2 = new consr(101,"Rinkal",25);
        c2.display();
    }
     
}
