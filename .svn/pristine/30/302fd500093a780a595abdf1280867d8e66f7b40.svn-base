package com.inesa.code.sql;

import com.inesa.code.entity.Code;

public class CodeSql {
	
	public String findList(Code code) {
		StringBuffer sb = new StringBuffer();
		sb.append(" SELECT a.name tableName, b.name colName, c.name colType ,c.length colLength, b.colorder, c.allownulls ");
		sb.append(" FROM sysobjects a ");
		sb.append(" INNER JOIN syscolumns b ");
		sb.append(" 	ON a.id=b.id AND a.xtype='U' ");
		sb.append(" INNER JOIN systypes c ");
		sb.append(" 	ON b.xtype=c.xusertype ");
		sb.append(" WHERE a.name=#{tableName} ");
		sb.append(" ORDER BY b.colorder ");
		return sb.toString();
	}
}
