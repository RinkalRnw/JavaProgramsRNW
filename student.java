public class student {
    // public student(){ //default 
    //     System.out.println("Default constructor called...");
    // }
    public student(int a,int b){ //parameterized 
        int c = a*b;
        System.out.println("Multiplication is "+c);
    }
    public static void main(String[] args) {
        // student s1 = new student();
        student s2 = new student(45,67);
    }
}
