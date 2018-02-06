package com.zuosh.bt;

import java.lang.management.ManagementFactory;

/**
 * Created by zuoshuai on 2018/2/2.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        String name = ManagementFactory.getRuntimeMXBean().getName();
        String pid = name.split("@")[0];
        System.out.println("Pid is:" + pid);
        int i = 0;
        while (true) {
            Thread.sleep(1000L);
            say("yes" + i++);
        }
    }

    public static void say(String greet) throws InterruptedException {
        System.out.println(greet);
    }
}
