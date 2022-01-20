package com.apple.io;

import java.io.File;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class IODemo001 {
    public static void main(String[] args) {
        File f = new File("/Users/apple/Library/Mobile Documents/com~apple~CloudDocs/娇娇/天空之城-娇娇.m4a");
        System.out.println("文件构造路径:" + f.getPath());
        System.out.println("文件名称:" + f.getName());
        System.out.println("文件长度:" + f.length() + "字节");
        System.out.println("文件最后修改时间：" + LocalDateTime.ofInstant(Instant.ofEpochMilli(f.lastModified()), ZoneId.of("Asia/Shanghai")));

        // 判断是否存在
        System.out.println("是否存在:" + f.exists());
        System.out.println("是否存在:" + f.exists());
        // 判断是文件还是目录
        System.out.println("文件?:" + f.isFile());
        System.out.println("目录?:" + f.isDirectory());
    }
}
