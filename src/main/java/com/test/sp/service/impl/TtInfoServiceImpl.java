package com.test.sp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.sp.dao.TtInfoDAO;
import com.test.sp.service.TtInfoService;
import com.test.sp.vo.TtInfo;

@Service	// 서비스를 테스트 하려면 한가지를 더 추가해야함
public class TtInfoServiceImpl implements TtInfoService {

	@Autowired
	private TtInfoDAO tidao;
	
	@Override
	public List<TtInfo> getTtInfoList() {
		// TODO Auto-generated method stub
		return tidao.getTtInfoList();
	}

	@Override
	public TtInfo getTtInfo(Integer tnum) {
		// TODO Auto-generated method stub
		return tidao.getTtInfo(tnum);
	}

	@Override
	public int insertTtInfo(TtInfo ttif) {
		// TODO Auto-generated method stub
		return tidao.insertTtInfo(ttif);
	}

	@Override
	public int updateTtInfo(TtInfo ttif) {
		// TODO Auto-generated method stub
		return tidao.updateTtInfo(ttif);
	}

	@Override
	public int deleteTtInfo(TtInfo ttif) {
		// TODO Auto-generated method stub
		return tidao.deleteTtInfo(ttif);
	}

}
