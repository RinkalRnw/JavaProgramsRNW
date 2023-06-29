class user1{
    void userData(int a,String cmdString);
}
class usermain extends user1{
    void userData(int a,String cmdString){
        System.out.println("Roll no is "+a);        
        System.out.println("Name is "+cmdString);
    }
}

public class override {
    public static void main(String[] args) {
        usermain u1 = new usermain();
        u1.userData(Integer.parseInt(args[0]),args[1]);
    }
}
