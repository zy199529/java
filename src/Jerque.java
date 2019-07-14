public class Jerque {
    public static void main(String[] args){
        String str="";
        //定义对字符串执行操作的起始时间
        long starTime = System.currentTimeMillis();
        for(int i =0;i<10000;i++){
            str=str+1;
        }
        long endTime = System.currentTimeMillis();
        System.out.println("String消耗的时间："+(endTime-starTime));
        StringBuilder builder= new StringBuilder("");
        starTime=System.currentTimeMillis();
        for(int j=0;j<10000;j++){
            builder.append(j);
        }
        endTime=System.currentTimeMillis();
        System.out.println("生成器消耗的时间："+(endTime-starTime));
    }
}
