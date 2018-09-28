package com.sunjx.cache.beetl;

import org.beetl.sql.core.NameConversion;
import org.beetl.sql.core.annotatoin.Table;
import org.beetl.sql.core.kit.StringKit;

/**
 * Created by wangjie on 2018/3/22.
 */
public class CustomNameConversion extends NameConversion {
    @Override
    public String getTableName(Class<?> c) {
       Table table = (Table)c.getAnnotation(Table.class);
       return table != null?table.name(): StringKit.enCodeUnderlined(c.getSimpleName());
    }

    public String getClassName(String tableName) {
       String temp = StringKit.deCodeUnderlined(tableName.toLowerCase());
       return StringKit.toUpperCaseFirstOne(temp);
    }

    @Override
    public String getColName(Class<?> aClass, String attrName) {
        return attrName;
    }

    @Override
    public String getPropertyName(Class<?> aClass, String colName) {
        return colName;
    }
}
