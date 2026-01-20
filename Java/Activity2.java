public class Activity2 {
    public static void main(String[] args) {
        int a=0;
        int[] arr={10, 77, 10, 54, -11, 10};
        for (int i:arr){
            if (i==10){
                a = a+i;
            }
        }
        if (a==30){
            System.out.println("it is 30");
        }
        else {
            System.out.println("it is not 30");
        }
    }

}
