import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        String[] input = new String[]{"23423486 3453", "2342385677", "12312384353"};
        List<String> stringList = new ArrayList<String>();
        for (String s1 : input) {
            int i = 0;
            while (i < s1.length()) {
                String s2 = s1.substring(i, ((i + 7) < s1.length() ? (i + 7) : s1.length()));
                s2 = s2.replaceFirst(" ", "");
                if (s2.length() < 8) {
                    int length = s2.length();
                    for (int j = 0; j < 8 - length; j++) {
                        s2 += "0";
                    }
                }
                stringList.add(s2);
                i = i + 8;
            }
        }
        System.out.println(stringList);
    }
    public void test(){
        System.out.println("test method");
    }
}
