
public class array {
    public static void main(String[] args) {
        // int[] a; 
        // int b[]; 
        int[] a = {10,20,30,40,50};
        // int[][] b = {{1,2,3},{4,5,6},{7,8,9}};
       
        int sum =0;
        // int i;
        // System.out.println("element is "+a[2]);
        // for(i=0;i<a.length;i++){
        //     System.out.println("element is "+a[i]);

        // }//foreach loop
        int newa[] = new int[a.length+1];
            for(int i:a){
                System.out.println("element is "+i);
                sum += i;
            }
            System.out.println("Sum is "+sum);
    }
}
