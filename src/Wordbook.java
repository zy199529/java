public class Wordbook {
    public static void main(String[] args){
        String str ="a";
        String str1="b";
        String str2="c";
        System.out.println(str+"compare to"+str1+":"+str.compareTo(str1));
        System.out.println(str1+"compare to"+str2+":"+str1.compareTo(str2));
        String ip = "192.168.0.1";
        String[] firstArray = ip.split("\\.");
        String[] secondArray = ip.split("\\.",2);
        for(String a:firstArray){
            System.out.println(a);
        }
        for(String b:secondArray){
            System.out.println(b);
        }

    }
}
