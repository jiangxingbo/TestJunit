package util;

/**
 * Created by jiangxb on 2016/10/7.
 */
public class StringUtil {

    public static String[] split(String str, String separator) {
        if (isEmpty(str)) return null;
        return str.split(separator);
    }

    public static boolean isEmpty(String str) {
        return str == null || "".equals(str);
    }

}
