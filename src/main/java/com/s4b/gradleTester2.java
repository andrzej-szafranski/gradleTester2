package com.s4b;

import com.s4b.core.CoreConnection;
import com.s4b.core.DB2Conector;

public class gradleTester2 {
    public static void main(String[] str) {
        System.out.println("Start ..................");
        System.out.println("Hello");
        CoreConnection c = new DB2Conector("Ambiwalent");
        System.out.println(c.getName());
        System.out.println("End ..................");
        
    }
}
