public class array {
    public static void main(String[] args) {
        // int[] a; 
        // int b[]; 
        int[] a = {10,20,30,40,50};
        int sum =0;
        // int i;
        // System.out.println("element is "+a[2]);
        // for(i=0;i<a.length;i++){
        //     System.out.println("element is "+a[i]);

        // }//foreach loop
            for(int i:a){
                System.out.println("element is "+i);
                sum += i;
            }
            System.out.println("Sum is "+sum);
    }
}
