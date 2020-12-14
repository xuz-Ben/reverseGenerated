package com.reverseGenerated;

import com.baomidou.mybatisplus.core.exceptions.MybatisPlusException;
import com.baomidou.mybatisplus.core.toolkit.StringPool;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.FileOutConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.TemplateConfig;
import com.baomidou.mybatisplus.generator.config.po.TableInfo;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @Author xuz_Ben
 * @Date 2020/12/8
 */
public class MysqlGenerator {

  public static String scanner(String tip) {
    Scanner scanner = new Scanner(System.in);
    StringBuilder help = new StringBuilder();
    help.append("请输入").append(tip).append("：");
    System.out.println(help.toString());
    if (scanner.hasNext()) {
      String ipt = scanner.next();
      if (StringUtils.isNotBlank(ipt)) {
        return ipt;
      }
    }
    throw new MybatisPlusException("请输入正确的" + tip + "！");
  }

  public static void main(String[] args) {
    //代码生成器
    AutoGenerator autoGenerator = new AutoGenerator();

    String projectPath = "E:\\master\\open_data_service\\interfaceData";


    //数据原配置
    DataSourceConfig dsc = new DataSourceConfig();
    dsc.setUrl("jdbc:mysql://127.0.0.1:3306/interface-data?useUnicode=true&characterEncoding=utf-8&useSSL=false");
    // dsc.setSchemaName("public");
    dsc.setDriverName("com.mysql.jdbc.Driver");
    dsc.setUsername("root");
    dsc.setPassword("root");
    autoGenerator.setDataSource(dsc);

    List<FileOutConfig> focList = new ArrayList<>();
    focList.add(new FileOutConfig("template/mapper.xml.vm") {
      @Override
      public String outputFile(TableInfo tableInfo) {
        // 自定义输入文件名称
        return projectPath + "/src/main/resources/mapper/" + tableInfo.getEntityName() + "Mapper" + StringPool.DOT_XML;
      }
    });

    InjectionConfig cfg = new InjectionConfig() {
      @Override
      public void initMap() {
        // to do nothing
      }
    };

    cfg.setFileOutConfigList(focList);
    autoGenerator.setCfg(cfg);

    //设置包属性
    PackageConfig packageConfig = new PackageConfig();
    packageConfig.setEntity("pojo.entities");
    packageConfig.setMapper("dao");
    packageConfig.setService("service");
    packageConfig.setServiceImpl("service.Impl");
    packageConfig.setController("controller");
    packageConfig.setParent("com.openData.interfaceData");
    autoGenerator.setPackageInfo(packageConfig);

    //模板
    TemplateConfig tc = new TemplateConfig();
    tc.setXml(null)
        .setServiceImpl("template/serviceImpl.java.vm")
        .setController("template/controller.java.vm")
        .setEntity("template/entity.java.vm")
        .setService("template/service.java.vm")
        .setMapper("template/mapper.java.vm");
    autoGenerator.setTemplate(tc);

    String tableName = scanner("表名");
    StrategyConfig strategyConfig = new StrategyConfig();
    strategyConfig
        .setCapitalMode(true)
        .setLogicDeleteFieldName("rec_status")
        .setEntityLombokModel(false)
        .setNaming(NamingStrategy.underline_to_camel)
        .setInclude(tableName)//修改替换成你需要的表名，多个表名传数组
        .setEntityLombokModel(true);//是否使用lombok
    autoGenerator.setStrategy(strategyConfig);

    //生成实例名
    if(tableName.substring(0, 2).equals("p_")) {
      tableName = tableName.substring(2);
    }

    tableName = tableName.substring(0, 1).toUpperCase() + tableName.substring(1);
    dealTableName(tableName);
    String newTableName = dealTableName(tableName);
    System.out.println(newTableName);

    //全局配置器
    GlobalConfig globalConfig = new GlobalConfig();
    //设置全局路径
    globalConfig.setOutputDir(projectPath + "/src/main/java");
    //设置作者
    globalConfig.setAuthor("xuz_Ben");
    globalConfig.setOpen(false);
    globalConfig.setEntityName(newTableName);
    globalConfig.setMapperName(newTableName + "Mapper");
    globalConfig.setXmlName(newTableName + "Mapper");
    globalConfig.setServiceName(newTableName + "Service");
    globalConfig.setServiceImplName(newTableName + "ServiceImpl");
    globalConfig.setControllerName(newTableName + "Controller");
    autoGenerator.setGlobalConfig(globalConfig);

    autoGenerator.execute();
  }

  public static String dealTableName(String tableName){
    if(tableName.indexOf("_") > -1) {
        String str = tableName.substring(0, tableName.indexOf("_"));
        String endStr = tableName.substring(tableName.indexOf("_") + 1);
        endStr = endStr.substring(0, 1).toUpperCase() + endStr.substring(1);
        return dealTableName(str + endStr);
      } else {
        return tableName;
      }
  }
}
