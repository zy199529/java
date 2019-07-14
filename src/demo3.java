public class demo3 {
    public static void main(String[] args){
        String str = "zyXiaoKeAi";
        String str1 = str.toLowerCase();
        String str2 = str.toUpperCase();
        System.out.println(str1);
        System.out.println(str2);
        String s1 = "hello world";
        String s2 ="Hello World";
        String sub1=s1.substring(1,4);
        String sub2=s2.substring(1,4);
        boolean b=sub1.equalsIgnoreCase(sub2);
        System.out.println(b);
        String regex ="\\d{11}";
        String s4="17621827652";
        if (s4.matches(regex)){
            System.out.println("合法");
        }
        else {
            System.out.println("不合法");
        }
        StringBuilder sb = new StringBuilder("zhuye");
        for(int i =1;i<=10;i++){
            sb.append(i);
        }
        System.out.println(sb);
    }
}
