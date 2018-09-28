package com.sunjx.cache.beetl;

import org.beetl.sql.core.*;
import org.beetl.sql.core.db.DBStyle;
import org.beetl.sql.core.db.MySqlStyle;
import org.beetl.sql.ext.DebugInterceptor;

/**
 * Created by wangjie on 2018/3/22.
 */
public class BeetlSqlTest {
    static String driver = "com.mysql.jdbc.Driver";
    //static String url = "jdbc:mysql://127.0.0.1:3306/orm?serverTimezone=UTC&useUnicode=true&characterEncoding=utf8&useSSL=false";
    static String url = "jdbc:mysql://127.0.0.1:3306/orm?useUnicode=true&characterEncoding=utf8&useSSL=false";
    static String userName="root";
    static String password="root";

    public static void main(String[] args) throws Exception {
        ConnectionSource source = ConnectionSourceHelper.getSimple(driver, url, userName, password);
        DBStyle mysql = new MySqlStyle();
        // sql语句放在classpagth的/sql 目录下
        SQLLoader loader = new ClasspathLoader("/sql");
        // 数据库命名跟java命名转化规则，UnderlinedNameConversion 指数据库表和列是下划线分割
        //UnderlinedNameConversion nc = new  UnderlinedNameConversion();
        CustomNameConversion nc = new CustomNameConversion();
        // 最后，创建一个SQLManager,DebugInterceptor 不是必须的，但可以通过它查看sql执行情况
        SQLManager sqlManager = new SQLManager(mysql,loader,source,nc,new Interceptor[]{new DebugInterceptor()});
//        sqlManager.genPojoCodeToConsole("pay_channel");
        System.setProperty("user.dir", System.getProperty("user.dir")+"\\springboot-cache");
        sqlManager.genPojoCode("department","com.sunjx.cache.entity");
//        sqlManager.genALL("com.asiainfo.pay.beetlsql.domain",new GenConfig(),null);
    }

    public static void gen(SQLManager sqlManager) throws Exception {
        sqlManager.genPojoCodeToConsole("user");

    }
    public static void genCode(SQLManager sqlManager) throws Exception {
        sqlManager.genPojoCode("user", "com.bee.sample.ch5.entity");
    }
}
