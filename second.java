public class second {
    public static void main(String[] args) {
        int a=11,b=20,c;
        int age = 16;
        if(a>b){
            System.out.println("A is maximum");
        } else {
            System.out.println("B is maximum");

        }
        if(age>=18){
            System.out.println("You are eligible 4 vote");
        } else {
            System.out.println("You are not eligible 4 vote");
        }
        c=a%2; //reminder
        if(c == 0){
            System.out.println("No is even");
        } else {
            System.out.println("No is odd");
            
        }

        String str = "Hi Hello How Are you?";
        System.out.println("Length is\t"+str.length());
        System.out.println("UPpercase is\t"+str.toUpperCase());
        System.out.println("Lowercase is\t"+str.toLowerCase());
        System.out.println("POsition is\t"+str.indexOf("How"));
        String str2 = "\\\"Rinkal\"";
        String str3 = str.concat(str2);
        System.out.println("String merge is\t"+str3);



    }
}
