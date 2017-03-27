package com.lee.demo.mybatis.generator;

import org.mybatis.generator.api.ShellRunner;

/**
 * Mybatis代码生成器
 */
public class MyBatisCodeGenerator {

    public static void main(String[] args) {
        String path = System.class.getResource("/mybatis-generator-cfg.xml").getPath();
        ShellRunner.main(new String[]{"-configfile", path, "-overwrite"});
    }

}
