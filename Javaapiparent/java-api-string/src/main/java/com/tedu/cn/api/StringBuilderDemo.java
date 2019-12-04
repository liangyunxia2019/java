package com.tedu.cn.api;

import org.junit.Test;

public class StringBuilderDemo {
    @Test
    public void m1(){
        StringBuilder builder=new StringBuilder();
        builder.append("I love you  "  );
        builder.append(2019);
        builder.append("  希望2020会好 ");
        System.out.println(builder.toString());
    }

}
