/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.inesa.code.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.inesa.code.dao.CodeDao;
import com.inesa.code.entity.Code;

/**
 * 字典管理Service
 * 
 * @author gaoy
 * @version 2018-04-19
 */
@Service
@Transactional(readOnly = true)
public class CodeService {

	@Autowired
	private CodeDao codeDao;

	public List<Code> findList(Code code) {

		return codeDao.findList(code);
	}
}