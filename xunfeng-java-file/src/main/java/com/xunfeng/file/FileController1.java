package com.xunfeng.file;

import java.nio.file.Files;
import java.nio.file.Paths;

public class FileController1 {
    public static void main(String[] args) throws Exception {
        Files.readAllLines(
                Paths.get("D://test.txt"))
                .stream()
//                .filter(line -> !line.startsWith(""))
//                .map(line ->line.substring(0, line.length() / 2))
                .forEach(System.out::println);
    }
}
