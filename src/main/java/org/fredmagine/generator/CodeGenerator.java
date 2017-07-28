package org.fredmagine.generator;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class CodeGenerator {
    public static void generator(){

        List<String> warnings=new ArrayList<String>();
        try {
//      导入配置表mybatis-generator.xml
            File configFile=new File("src/main/resources/mybatis-generator.xml");
//      解析
            ConfigurationParser cp=new ConfigurationParser(warnings);
            Configuration config=cp.parseConfiguration(configFile);
//      是否覆盖
            DefaultShellCallback dsc=new DefaultShellCallback(true);
            MyBatisGenerator mg=new MyBatisGenerator(config, dsc, warnings);
            mg.generate(null);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        CodeGenerator.generator();
        System.out.println("done!");
    }

}