package com.ruoyi.web.controller.tool;

public class testmyself {
    public static void main(String[] args) {
        long timestamp = System.currentTimeMillis(); // 获取当前时间戳（毫秒）
        String time = Long.toString(timestamp);
        System.out.println(time);
        String str = "123456789.fasta";
        String str1 = str.substring(0,str.length()-5);
        System.out.println(str1);
    }
}
