public class Circulate {
    public static void main(String[] args){
        int sum = 0;
        for(int i=2;i<=100;i=i+2){
            sum=sum+i;
        }
        System.out.println("2~100之间偶数和"+sum);
    }
}
