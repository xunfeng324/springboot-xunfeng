package xunfemg.controller;

public class Java8_base64 {
    public static void main(String[] args) {
        //Java8 Base64
        base64();
    }

    private static void base64() {
        /*
         *在Java 8中，Base64编码已经成为Java类库的标准。
         * Java 8 内置了 Base64 编码的编码器和解码器。
         * Base64工具类提供了一套静态方法获取下面三种BASE64编解码器：
         * 基本：输出被映射到一组字符A-Za-z0-9+/，编码不添加任何行标，输出的解码仅支持A-Za-z0-9+/。
         * URL：输出映射到一组字符A-Za-z0-9+_，输出是URL和文件。
         * MIME：输出隐射到MIME友好格式。输出每行不超过76字符，并且使用'\r'并跟随'\n'作为分割。编码输出最后没有行分割。
         * */
    }
}
