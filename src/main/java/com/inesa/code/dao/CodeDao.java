/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.inesa.code.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.SelectProvider;
import com.inesa.code.entity.Code;
import com.inesa.code.sql.CodeSql;

/**
 * 用户状态管理DAO接口
 * 
 * @author gaoy
 * @version 2018-04-19
 */
@Mapper
public interface CodeDao {

	@SelectProvider(type = CodeSql.class, method = "findList")
	public List<Code> findList(Code code);
}