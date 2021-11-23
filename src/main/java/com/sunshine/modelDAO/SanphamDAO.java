package com.sunshine.modelDAO;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sunshine.interfaces.SanphamInterface;
import com.sunshine.model.Sanpham;
@Repository
public class SanphamDAO implements SanphamInterface{
	@Autowired
	JdbcTemplate template;
	@Override
	public List<Map<String, Object>> list() {
		List<Map<String, Object>> list = template.queryForList("select * from tblsanpham");
		return list;
	}

	@Override
	public List<Map<String, Object>> listId(int id) {
		List<Map<String, Object>> list = template.queryForList("select * from tblsanpham where idsp = ?",id);
		return list;
	}

	@Override
	public int add(Sanpham p) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int edit(Sanpham p) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

}
