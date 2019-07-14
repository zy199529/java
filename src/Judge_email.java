public class Judge_email {
    public static void main(String[] args){
        String regex = "\\w+@\\w+(\\.\\w{2,3})*\\.\\w{2,3}";
        String str3="823356427@qq.com";
        if( str3.matches(regex)){
            System.out.println(str3+"合法");
        }
    }
}
