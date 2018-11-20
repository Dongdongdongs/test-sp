package com.test.sp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.test.sp.service.TtInfoService;
import com.test.sp.vo.TtInfo;

@Controller
public class TtInfoController {

	@Autowired
	private TtInfoService tis;
	
	@GetMapping(value="/ttinfos")
	public @ResponseBody List<TtInfo> getTtInfoList() {
		return tis.getTtInfoList();
	}
	
	@PostMapping(value="/ttinfos")
	public @ResponseBody int insertTtInfo(@RequestBody TtInfo ttif) {
		
		return tis.insertTtInfo(ttif);
	}
	
	@PutMapping(value="/ttinfos/{tnum}")
	public @ResponseBody int updateTtInfo(@RequestBody TtInfo ttif, @PathVariable Integer tnum) {
		ttif.setTnum(tnum);
		return tis.updateTtInfo(ttif);
	}
	
	@DeleteMapping(value="/ttinfos/{tnum}")
	public @ResponseBody int deleteTtInfo(@RequestBody TtInfo ttif, @PathVariable Integer tnum) {
		ttif.setTnum(tnum);
		return tis.deleteTtInfo(ttif);
	}
}
