import java.util.Scanner;
public class prime {
    
// Prime no check

    public static void main(String[] args) {
        
        System.out.println("Enter a:");
        Scanner obj = new Scanner(System.in); //create object of scnanner class
        int a = obj.nextInt();
        int cnt=0,i;
        for(i=1;i<=a;i++){
            if(a%i==0){ //5%1 5%2 5%3 5%4 5%5
                cnt++;
            }
        }
        if(cnt<=2){
            System.out.println(a+" is prime no");
        } else {
            System.out.println(a+" not is prime no");

        }
        /* System.out.println("Addition is "+c);*/
        

        
      
    }


}
