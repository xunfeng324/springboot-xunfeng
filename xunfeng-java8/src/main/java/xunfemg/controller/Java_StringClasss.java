package xunfemg.controller;

import java.util.Arrays;

public class Java_StringClasss {
    public static void main(String[] args) {
        Java_StringClasss sc = new Java_StringClasss();
        //sc.testString();
//        sc.testString1();
//        sc.testString2();
        sc.testString3();
    }

    private void testString() {
        String s1 = "Runoob";              // String 直接创建
        String s2 = "Runoob";              // String 直接创建
        String s3 = s1;                    // 相同引用
        String s4 = new String("Runoob");   // String 对象创建
        String s5 = new String("Runoob");   // String 对象创建
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);
    }

    private void testString1() {
        /**
         * 字符串长度
         * 用于获取有关对象的信息的方法称为访问器方法。
         * String 类的一个访问器方法是 length() 方法，它返回字符串对象包含的字符数。
         */
        String site = "www.runoob.com";
        int len = site.length();
        System.out.println("网址长度 : " + len);
    }

    private void testString2() {
        /**
         * 连接字符串
         *  concat() 方法
         *  更常用的是使用'+'操作符来连接字符串，
         */
        String string0 = "a字符串+" + "b字符串";
        String string1 = "这是字符串1";
        String string2 = "这是字符串2";
        String string = string1.concat(string2);

        System.out.println(string0);
        System.out.println(string);
    }

    private void testString3() {
        String str = "这是一个,很长,的字符串,...";
        //返回指定索引处的 char 值。
        System.out.println("返回指定索引处的 char 值:"+str.charAt(2));

        //把这个字符串和另一个对象比较。
        String str1 = "Strings";
        String str2 = "Strings";
        String str3 = "Strings123";
        int result = str1.compareTo( str2 );
        System.out.println(result);
        result = str2.compareTo( str3 );
        System.out.println(result);

        result = str3.compareTo( str1 );
        System.out.println(result);

        //将此字符串与指定的对象比较。
        boolean re = str3.equals(str2);
        System.out.println(re);

        //返回指定字符在此字符串中第一次出现处的索引。如果没有这返回 -1
        int re1 = str.indexOf("长");
        int re2 = str.indexOf("长",6);
        System.out.println(re1);
        System.out.println(re2);

        // 返回字符串对象的规范化表示形式。
        System.out.println(str1.intern());

        //返回指定字符在此字符串中最后一次出现处的索引。 如果没有这返回 -1
        System.out.println("最后一次出现处的索引"+str.lastIndexOf("."));

        //boolean matches(String regex)
        //告知此字符串是否匹配给定的正则表达式。
        String str4 = new String("www.runoob.com");
        System.out.print("返回值 :" );
        System.out.println(str4.matches("(.*)runoob(.*)"));

        //String replace(char oldChar, char newChar)
        //返回一个新的字符串，它是通过用 newChar 替换此字符串中出现的所有 oldChar 得到的。
        String str5 = new String("Runoob...");
        System.out.print("返回值 :" );
        System.out.println(str5.replace(str5.charAt(str5.lastIndexOf(".")), 'T'));
        System.out.println(str5.replaceAll(".","P"));

        //String[] split(String regex)
        //根据给定正则表达式的匹配拆分此字符串。
        String[] a = str.split(",");
        Integer[] b = {1,2,4,5};
      /*  for (String i : a){
            System.out.println(i);
        }*/
        System.out.println(Arrays.asList(b).toString());
        System.out.println(Arrays.asList(a).toString());

        /**
         * String substring(int beginIndex, int endIndex)
         * 返回一个新字符串，它是此字符串的一个子字符串。
         */
        String a1 = str.substring(5);
        System.out.println("substring:"+a1);

        /**
         * char[] toCharArray()
         * 将此字符串转换为一个新的字符数组。
         */
        char[] a2 = str.toCharArray();
        for (int i = 0; i < a2.length; i++) {
            System.out.println(a2[i]);
        }

        String char1 = Arrays.toString(a2);
        System.out.println("char1:"+char1);


        /**
         * String toLowerCase()
         * 使用默认语言环境的规则将此 String 中的所有字符都转换为小写。
         */
        String aa = "ADFcdgESfasWW...SF";
        String a3 = aa.toLowerCase();
        System.out.println(a3);
        /**
         * 	String toUpperCase()
         * 使用默认语言环境的规则将此 String 中的所有字符都转换为大写。
         */
        String a4 = aa.toUpperCase();
        System.out.println(a4);

        /**
         * 	String trim()
         * 返回字符串的副本，忽略前导空白和尾部空白。
         */
        String bb = " dfasd  dfaadf3df -fdsa    ";
        String a5 = bb.trim();
        System.out.println("忽略前导空白和尾部空白："+a5);
        /**
         * 	isEmpty()
         * 判断字符串是否为空。
         */

        boolean empty = bb.isEmpty();
        System.out.println(empty);
    }
}
