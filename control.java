//Conditional Structure
/*if statement
if_else
if_else_if
Nested if
Switch case */
public class control{
    public static void main(String[] args) {
        int a = 1;
        //Check no is -ve,+ve,zero
        if(a>0){
            System.out.println("No is +ve");
        } else if(a<0){
            System.out.println("No is -ve");
        } else {
            System.out.println("No is Zero");
        }
        //Count Student Result  
        int m1=40,m2=3,m3=35;
        int total = m1+m2+m3;
        double per = total*100/150;
        System.out.println("Total is "+total);
        System.out.println("Percentage is "+per);
        if(per>=81){
            System.out.println("Grade A+");
        } else if(per>=60 && per<=80){
            System.out.println("Grade A");
        }else if(per>=50 && per<60){
            System.out.println("Grade B+");
        }else if(per>=40 && per<50){
            System.out.println("Grade B");
        } else {
            System.out.println("Fail");
        }

        //Find out max from 3 var by using logical opr
        
        int p=35,q=45,r=30,s=250;
        if(p>q && p>r){
            System.out.println("P is max");
        } else if(q>r){
            System.out.println("Q is max");
        }  else {
            System.out.println("R is max");
        }
//Max from 4
        if(p>q && p>r && p>s){
            System.out.println("P is max");
        } else if(q>r && q>s){
            System.out.println("Q is max");
        }  else if(r>s) {
            System.out.println("R is max");
        } else {
            System.out.println("S is max");
            
        }
        //Find out max from 3 p,q,r var by using nested if
        // p=35,q=25,r=50
        if(p>q){ 
            if(p>r){ 
                System.out.println("P is max");
            } else {
                System.out.println("R is max");
            }
        } else {
            if(q>r){
                System.out.println("Q is max");

            } else {
                System.out.println("R is max");

            }
        }
        //Max from 4
        if(p>q){
            if(p>r){
                if(p>s){
                    System.out.println("P is max");
                } else {
                    System.out.println("S is max");

                }

            } else {
                if(r>s){
                    System.out.println("R is max");
                } else {
                    System.out.println("S is max");
                }
            }

        } else {
            if(q>r){
                if(q>s){
                    System.out.println("Q is max");

                } else {
                    System.out.println("S is max");

                }

            } else {
                if(r>s){
                    System.out.println("R is max");
                } else {
                    System.out.println("S is max");
                }
            }
        }
    }
}