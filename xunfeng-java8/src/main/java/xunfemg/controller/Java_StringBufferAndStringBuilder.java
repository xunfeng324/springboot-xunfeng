package xunfemg.controller;

public class Java_StringBufferAndStringBuilder {
    /**
     * Java StringBuffer 和 StringBuilder 类
     * 当对字符串进行修改的时候，需要使用 StringBuffer 和 StringBuilder 类。
     * 和 String 类不同的是，StringBuffer 和 StringBuilder 类的对象能够被多次的修改，并且不产生新的未使用对象。
     */
    public static void main(String[] args) {
//        stringBufferTest();
        stringBuilderTest();
    }

    private static void stringBuilderTest() {
        /**
         * StringBuilder 类在 Java 5 中被提出，
         * 它和 StringBuffer 之间的最大不同在于 StringBuilder 的方法不是线程安全的（不能同步访问）。
         * 由于 StringBuilder 相较于 StringBuffer 有速度优势，所以多数情况下建议使用 StringBuilder 类。
         */
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            builder.append(i);
        }
        System.out.println(builder);
        /**
         * public StringBuffer reverse()
         * 将此字符序列用其反转形式取代。
         */
        StringBuilder reverse = builder.reverse();
        System.out.println(reverse);
        /**
         * 	public delete(int start, int end)
         * 移除此序列的子字符串中的字符。
         */
        StringBuilder delete = builder.delete(0, 5);
        System.out.println(delete);
        /**
         * 	public insert(int offset, int i)
         * 将 int 参数的字符串表示形式插入此序列中。
         */
        StringBuilder insert = builder.insert(1, 2);
        System.out.println(insert);
        /**
         * replace(int start, int end, String str)
         * 使用给定 String 中的字符替换此序列的子字符串中的字符。
         */
        StringBuilder replace = builder.replace(2, 5,"sf");
        System.out.println(replace);
        /**
         * int capacity()
         * 返回当前容量。
         */
        int capacity = builder.capacity();
        System.out.println(capacity);
    }

    private static void stringBufferTest() {
        /**
         * 在使用 StringBuffer 类时，每次都会对 StringBuffer 对象本身进行操作，
         * 而不是生成新的对象，所以如果需要对字符串进行修改推荐使用 StringBuffer。
         */
        StringBuffer buffer = new StringBuffer("sffa");
        for (int i = 0; i <100; i++) {
            buffer.append(i+",");
        }
        System.out.println(buffer);
    }
}
