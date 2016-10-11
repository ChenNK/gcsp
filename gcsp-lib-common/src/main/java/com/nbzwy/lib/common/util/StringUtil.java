package com.nbzwy.lib.common.util;

import java.util.List;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class StringUtil {

    private static Pattern emailPattern = null;
    private static Pattern mobilePattern = null;

    static {
        String regEx = "^(\\w)+(\\.\\w+)*@(\\w)+((\\.\\w+)+)$";
        emailPattern = Pattern.compile(regEx);

        regEx = "^1\\d{10}$";
        mobilePattern = Pattern.compile(regEx);
    }

    public static boolean isEmpty(String value) {
        int strLen;
        if (value == null || (strLen = value.length()) == 0) {
            return true;
        }
        for (int i = 0; i < strLen; i++) {
            if ((Character.isWhitespace(value.charAt(i)) == false)) {
                return false;
            }
        }
        return true;
    }

    /**
     * 检查对象是否为数字型字符串,包含负数开头的。
     */
    public static boolean isNumeric(Object obj) {
        if (obj == null) {
            return false;
        }
        char[] chars = obj.toString().toCharArray();
        int length = chars.length;
        if (length < 1)
            return false;

        int i = 0;
        if (length > 1 && chars[0] == '-')
            i = 1;

        for (; i < length; i++) {
            if (!Character.isDigit(chars[i])) {
                return false;
            }
        }
        return true;
    }

    /**
     * 检查对象是否为数字型字符串,包含整数、小数和负数开头的。
     */
    public static boolean isNumber(Object obj) {
        Boolean strResult = obj.toString().matches("-?[0-9]+.*[0-9]*");
        return strResult;
    }

    /**
     * 检查指定的字符串列表是否不为空。
     */
    public static boolean areNotEmpty(String... values) {
        boolean result = true;
        if (values == null || values.length == 0) {
            result = false;
        } else {
            for (String value : values) {
                result &= !isEmpty(value);
            }
        }
        return result;
    }


    /**
     * 检查指定的字符串列表是否不为空。
     */
    public static boolean areEqual(String value1, String value2) {
        if (value1 == null && value2 == null) {
            return true;
        }
        if (value1 != null) {
            return value1.equals(value2);
        }
        if (value2 != null) {
            return value2.equals(value1);
        }
        return true;
    }

    public static String nullDefaultValue(String value, String defaultValue) {
        if (value == null) {
            return defaultValue;
        }
        return value;
    }

    public static String nullDefaultValue(String value) {
        if (value == null) {
            return "";
        }
        return value;
    }

    public static Boolean isEmail(String value) {
        if (isEmpty(value)) {
            return false;
        }
        Matcher matcher = emailPattern.matcher(value);
        return matcher.find();
    }

    public static Boolean isMobile(String value) {
        if (isEmpty(value)) {
            return false;
        }
        Matcher matcher = mobilePattern.matcher(value);
        return matcher.find();
    }

    public static String join(List<String> list, String split) {
        if (split == null) {
            split = "";
        }
        StringBuilder values = new StringBuilder();
        if (list != null && (!list.isEmpty())) {
            String nickFormater = "%s";
            for (String item : list) {
                if (!StringUtil.isEmpty(item)) {
                    values.append(String.format(nickFormater, item.trim()));
                    nickFormater = split+"%s";
                }
            }
        }
        return values.toString();
    }

    public static int hash(String str) {
        int h = 0;
        if (str == null)
            return h;

        int off = 0;
        char val[] = str.toCharArray();
        int len = str.length();

        for (int i = 0; i < len; i++) {
            h = 31*h + val[off++];
        }

        return h;
    }

    // 随机生成位字符串
    public static String getRandomStr(int num) {
        String base = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < num; i++) {
            int number = random.nextInt(base.length());
            sb.append(base.charAt(number));
        }
        return sb.toString();
    }
}
