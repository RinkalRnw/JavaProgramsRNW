public class unit {
    public static void main(String[] args) {
//         1-50 = 50*0.50 = 25
// 51-150 = 100*0.75 = 75
// 151-250 = 100*1.20 = 120
// >250 = 100*1.50 = 150
    float unit = 135,bill; //270 = 50 - 0.50 150 = 0.75  
        if(unit<=50){
            bill = (float) (unit*0.50);
        } else if(unit>=51 && unit <=150){
            bill = (float) (25+(unit-50)*0.75);
        }else if(unit>=151 && unit <=250){
            bill = (float) (100+(unit-150)*1.20);
        } else {
            bill = (float) (220+(unit-250)*1.50);
        }
        bill += bill*20/100;
        System.out.println("Electricity bill is "+bill);

    }
}

