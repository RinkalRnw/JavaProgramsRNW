public class looping {

    public static void main(String[] args) {
        int i=1,sum =1;
        // while(i<=5){
        //     // System.out.println(i);
        // Entry controlled loop
        //     // i++;
        // }
        // do{
        //     System.out.println(i);
        //     i++;
        // }while(i<=10);
        // Exit controlled loop
        for(i=1;i<=5;i++){
            sum *= i;
            
        }
        System.out.println("Sum of 5 no is"+sum);
    }
}
