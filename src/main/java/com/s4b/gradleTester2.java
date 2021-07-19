package com.s4b;

import com.s4b.core.CoreConnection;

public class gradleTester2 {
    public static void main(String[] str) {
        System.out.println("Hello");
        CoreConnection c = new CoreConnection("Ambiwalent");
        System.out.println(c.getName());
        System.out.println("End ..................");
    }
}