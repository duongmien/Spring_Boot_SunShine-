package com.sunshine.modelDAO;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sunshine.interfaces.ThongbaoInterface;
import com.sunshine.model.Thongbao;
@Repository
public class ThongbaoDAO implements ThongbaoInterface {
	@Autowired
	JdbcTemplate template;
	@Override
	public List<Map<String, Object>> list() {
		List<Map<String, Object>> list = template.queryForList("select * from tblthongbao");
		return list;
	}

	@Override
	public List<Map<String, Object>> listId(int id) {
		List<Map<String, Object>> list = template.queryForList("select * from tblthongbao where idtb = ?",id);
		return list;
	}

	@Override
	public int add(Thongbao p) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int edit(Thongbao p) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
