import java.util.Date;
public class Eval_Date {
    public static void main(String[] args){
        Date date = new Date();
        String year = String.format("%tY",date);
        String month = String.format("%tB",date);
        String day = String.format("%td",date);
        System.out.println("今年："+year);
        System.out.println("现在是："+month);
        System.out.println("今天："+day);
        String hour = String.format("%tH",date);
        String minute = String.format("%tM",date);
        String second = String.format("%tS",date);
        System.out.println("现在是："+hour+"时"+minute+"分"+second+"秒");
        String time = String.format("%tc",date);
        System.out.println("现在是："+time);
        String form = String.format("%tF",date);
        System.out.println("现在是："+form);
        String str = String.format("%d",400/2);
        String str2=String.format("%b",3>5);
        String str3=String.format("%x",200);
        System.out.println("400的一半："+str);
        System.out.println("3>5:"+str2);
        System.out.println("200的十六进制数："+str3);
    }

}
