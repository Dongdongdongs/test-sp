package com.test.sp.dao;

import java.util.List;

import com.test.sp.vo.TtInfo;

public interface TtInfoDAO {
	
	public List<TtInfo> getTtInfoList();
	public TtInfo getTtInfo(Integer tnum);
	public int insertTtInfo(TtInfo ttif);
	public int updateTtInfo(TtInfo ttif);
	public int deleteTtInfo(TtInfo ttif);
}
