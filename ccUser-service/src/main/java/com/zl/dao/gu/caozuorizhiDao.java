package com.zl.dao.gu;

import java.util.List;

import com.zl.pojo.manger.OperateLog;
/**
 * 操作日志模块
 */
public interface caozuorizhiDao {
	/**
	 * 增加日志
	 */
	public int insertOperateLog(OperateLog operateLog);
	/**
	 * 查询最后五条日志
	 */
	public List<OperateLog> queryAllOperateLog();
}
