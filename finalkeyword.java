/*
Final Keyword

final class - we can't inherit class
final variable - we can't change value of that variable[constant]
final method - we can't overide method in child class
*/
class testfinal{
    final int a=10;
    final void getData(){
        System.out.println("a is "+a);
    }
}
class abcxyz extends testfinal{
    
    void testData(){
        System.out.println("child class calling..");

    }
}
class finalkeyword{
    public static void main(String[] args) {

        testfinal t1 = new testfinal();
        abcxyz a1 = new abcxyz();
        a1.testData();
        t1.getData();
    }
}