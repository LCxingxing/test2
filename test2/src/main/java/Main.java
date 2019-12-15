import java.util.Scanner;
import java.util.LinkedHashMap;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        LinkedHashMap<String,Integer> map = new LinkedHashMap();
        while(sc.hasNext()){
            String s = sc.next();
            if ("xxxx".equals(s)){
                break;
            }
            int num = sc.nextInt();
            String[] ss = s.split("\\\\");
            String str = ss[ss.length-1];
            if(str.length()>16){
                str=str.substring(str.length()-16,str.length());
            }
            String key = str+" "+num;
            if(map.get(key)==null){
                map.put(key,1);
            }else{
                int a = map.get(key);
                a++;
                map.put(key,a);
            }
        }
        int count=0;
        for(String s:map.keySet()){
            count++;
            if(map.size()-count<8){
                System.out.println(s+" "+map.get(s));
            }
        }
    }
    public void test(){
        System.out.println("方法测试");
    }
}