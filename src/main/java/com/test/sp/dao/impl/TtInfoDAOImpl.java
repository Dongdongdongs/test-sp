package com.test.sp.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.test.sp.dao.TtInfoDAO;
import com.test.sp.vo.TtInfo;

@Repository
public class TtInfoDAOImpl implements TtInfoDAO {
	@Autowired
	private SqlSession ss;
	
	@Override
	public List<TtInfo> getTtInfoList() {
		// TODO Auto-generated method stub
		return ss.selectList("com.test.sp.TTINFO.selectTTINFO");
	}

	@Override
	public TtInfo getTtInfo(Integer tnum) {
		// TODO Auto-generated method stub
		return ss.selectOne("com.test.sp.TTINFO.selectTTINFOONE",tnum);
	}

	@Override
	public int insertTtInfo(TtInfo ttif) {
		return ss.insert("com.test.sp.TTINFO.insertTTINFO",ttif);
	}

	@Override
	public int updateTtInfo(TtInfo ttif) {
		// TODO Auto-generated method stub
		return ss.update("com.test.sp.TTINFO.updateTTINFO",ttif);
	}

	@Override
	public int deleteTtInfo(TtInfo ttif) {
		// TODO Auto-generated method stub
		return ss.delete("com.test.sp.TTINFO.deleteTTINFO",ttif);
	}
   
}
