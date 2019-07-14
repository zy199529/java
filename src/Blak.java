public class Blak {
    public static void main(String[] args){
        String str ="   java  class";
        System.out.println("字符串原来的长度："+str.length());
        //去掉前后空格
        System.out.println("去掉空格后的长度："+str.trim().length());
        String str1 ="address";
        String newstr = str1.replace("a","A");
        System.out.println(newstr);
        String num1 = "22045612";
        String num2 = "21304578";
        boolean b=num1.startsWith("22");
        boolean b1 = num1.endsWith("78");
        boolean b2 = num2.startsWith("22");
        boolean b3 = num2.endsWith("78");
        System.out.println(b);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        String s1 = new String("abc");
        String s2 = new String("abc");
        String s3 = new String("ABC");
        boolean a = s1.equals(s3);
        boolean a2 = s1.equalsIgnoreCase(s3);
        System.out.println(s1+" equals "+s3+":"+a);
        System.out.println(s1+" IgnoreCase "+s3+":"+a2);
    }
}
