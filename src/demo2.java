public class demo2 {
    public static void main(String[] args){
        int x = 32;
        if(x%2==0){
            System.out.println("x为偶数");
        }else {
            System.out.println("x为奇数");
        }
        int col = 11;
        int half_1 = col/2 + 1;
        int half_2 = col/2;
        for(int i =0;i<half_1;i++){
            for(int j=0;j<half_1-i;j++){
                System.out.print(" ");
            }
            System.out.print("*");
            for(int q=half_1-i;q<half_1+i;q++){
                System.out.print(" ");
            }
            System.out.print("*");
//            for(half_1-j;)
            System.out.println();
        }
        for(int h = half_2+2;h>0;h--){
            for(int p = 0;p<(half_2+2-h);p++){
                System.out.print(" ");
            }
            System.out.print("*");
            for(int k=half_2-h;k<half_2+h-2;k++){
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }
        double l =1.0;
        int n = 1;
        double sum = 1.0;
        while(n<=20){
            l=l*(n+1);
            sum =sum+1/l;
            n=n+1;
            System.out.println(n+" "+l+" "+sum);
        }
        //System.out.println(sum);
    }
}
