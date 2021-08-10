package xunfemg.controller;

import java.io.*;
import java.util.Scanner;

public class Java_Stream_File_IO {

    public static void main(String[] args) throws IOException {
        /**
         * 流
         */
//        testStream1();
//        testStream2();
//        testStream3();
        /**
         * 读写文件
         */
//        testFile();
//        testFile1();
        testFile2();
//        testFile3();
//        testFileInputStream();
//        testFileOutputStream();
    }

    private static void testFile3() {
        System.out.println("输入文件夹：");
        String s = new Scanner(System.in).nextLine();
        File dir = new File(s);
        if (!dir.isDirectory()) {
            System.out.println(
                    "请输入正确的文件夹");
            return;
        }
        String[] names = dir.list();
        File[] files = dir.listFiles();
        if (names == null) {
            //文件、不存在的路径、无权进入的目录
            System.out.println("无法获得列表");
            return;
        }
        for (String n : names) {
            System.out.println(n);//只有文件名
        }
        System.out.println("-----------");
        for (File f : files) {
            //File对象中有文件的各种属性
            System.out.println(
                    f.getName() + " - " + f.length());
        }
    }

    private static void testFile2() throws IOException {
        /**
         * 新建 d:/abc/aa 目录
         * 新建 d:/abc/aa/f1 文件
         * 删除 f1 文件
         * 删除 d:/abc/aa 目录
         */
        System.out.println("按回车执行");
        new Scanner(System.in).nextLine();
        File dir = new File("d:/abc/aa");
        dir.mkdirs();
        new Scanner(System.in).nextLine();
        File file = new File(dir, "f1");
        file.createNewFile();
        new Scanner(System.in).nextLine();
        file.delete();
        new Scanner(System.in).nextLine();
        dir.delete();
    }

    private static void testFile1() {
        String path;
        //path = "D:\\home\\java\\eclipse\\eclipse.exe";//存在的文件
        //path = "D:/home/java/eclipse";//存在的文件夹
        path = "k:/gsdwew/sfsdf";//不存在的路径
        File f = new File(path);
        System.out.println("名字：" + f.getName());
        System.out.println("父目录：" + f.getParent());
        System.out.println("完整路径：" + f.getAbsolutePath());
        System.out.println("是否存在：" + f.exists());
        System.out.println("是否文件：" + f.isFile());
        System.out.println("是否文件夹" + f.isDirectory());
        System.out.println("字节量，文件夹无效：" + f.length());
        System.out.println("最后修改时间：" + f.lastModified());
    }

    private static void testFileOutputStream() {
    }

    private static void testFileInputStream() throws FileNotFoundException {
        /**
         * 该流用于从文件读取数据，它的对象可以用关键字 new 来创建。
         * 有多种构造方法可用来创建对象。
         * 可以使用字符串类型的文件名来创建一个输入流对象来读取文件：
         */

        InputStream f = new FileInputStream("D:/hello.txt");

        /**
         * 也可以使用一个文件对象来创建一个输入流对象来读取文件。
         * 我们首先得使用 File() 方法来创建一个文件对象：
         */
        File f1 = new File("D:/hello.txt");
        InputStream out = new FileInputStream(f1);
    }

    private static void testFile() {
        /**
         * 一个流被定义为一个数据序列。输入流用于从源读取数据，输出流用于向目标写数据。
         * 字符流
         *      Reader
         *          BufferedReader
         *          InputStreamReader
         *              FileReader
         *          StringReader
         *          PipedReader
         *          CharArrayReader
         *          FilterReader
         *              PushbackReader
         *       Writer
         *          OutputStreamWriter
         *              FileWriter
         *          PrintWriter
         *          StringWriter
         *          PipedWriter
         *          CharArrayWriter
         *          FilterReader
         */
        /**
         * 字节流
         *      InputStream
         *          FileInputStream
         *          FilterInputStream
         *              BufferedInputStream
         *              DataInputStream
         *              PushbackInputStream
         *          ObjectInputStream
         *          PipedInputStream
         *          SequenceInputStream
         *          StringBufferInputStream
         *          ByteArrayInputStream
         *      OutputStream
         *          FileOutputStream
         *          FilterOutputStream
         *              BufferedOutputStream
         *              DataOutputStream
         *              PrintStream
         *          ObjectOutputStream
         *          PipedOutputStream
         *          ByteArrayOutputStream
         *
         */


    }


    private static void testStream3() {
        /**
         * 控制台输出
         */

        int a = 'A';
        System.out.write(a);
    }

    private static void testStream2() throws IOException {
        /**
         * 从控制台读取字符串
         * 从标准输入读取一个字符串需要使用 BufferedReader 的 readLine() 方法。
         */
        // 使用 System.in 创建 BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        System.out.println("Enter lines of text.");
        System.out.println("Enter 'end' to quit.");
        do {
            str = br.readLine();
            System.out.println(str);
        } while (!str.equals("end"));
    }

    private static void testStream1() throws IOException {
        /**
         * 从控制台读取多字符输入
         * 从 BufferedReader 对象读取一个字符要使用 read() 方法，它的语法如下：
         */

        char c;
        // 使用 System.in 创建 BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("输入字符, 按下 'q' 键退出。");
        // 读取字符
        do {
            c = (char) br.read();
            System.out.println(c);
        } while (c != 'q');
    }

}
