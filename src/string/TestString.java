package string;

import util.StringUtil;

/**
 * Created by jiangxb on 2016/10/7.
 */
public class TestString {

    public static void main(String[] args) {
        System.out.println("TestString.main");
        testStringSplit();
    }

    public static void testStringSplit(){
        String s = "jiang xing bo";
        String sp = " ";
        String[] ss = StringUtil.split(s, sp);
        for (int i = 0; i < ss.length; i++) {
            String s1 = ss[i];
            System.out.println("s1 = " + s1);
        }
    }
}
