import java.util.Scanner;
public class Test1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = "";
        while(sc.hasNext()){
            str = sc.nextLine();
        }
        String strNum = str.substring(2,str.length());
        int len = strNum.length();
        int number = 0;
        for(int i=len-1;i>=0;i--){
            int j = len - i;
            int cheng = 1;
            while(j>1){
                cheng *= 16;
                j--;
            }
            int num = getNumber(strNum.charAt(i))*cheng;
            number += num;
        }
        System.out.println(number+"");
    }
    public static int getNumber(char c){
        if(c=='A'||c=='a'){
            return 10;
        }else if(c=='B'||c=='b'){
            return 11;
        }else if(c=='C'||c=='c'){
            return 12;
        }else if(c=='D'||c=='d'){
            return 13;
        }else if(c=='E'||c=='e'){
            return 14;
        }else if(c=='F'||c=='f'){
            return 15;
        }else{
            return c-'0';
        }
    }
}