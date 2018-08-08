package com.spmjava.controller;

import org.springframework.web.bind.annotation.RestController;

import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

/**
 * @author qi-wei-chao
 * @description:
 * @date 2017-12-06 9:54
 * @since 1.0.0
 **/

@RestController
public class IndexController {

    public IndexController() {
    }

    public IndexController(PrintStream printStream) {

    }

    public static void main(String args[]) throws Exception {

    }
}

class A {

    int a = 0;

    public void method() {
        int a = 1;
        class B {
            int a = 2;

            public void method1() {
                int a = 3;
                System.out.println(A.this.a);
                System.out.println();
                System.out.println(B.this.a);
                System.out.println(a);
            }
        }
    }
}

