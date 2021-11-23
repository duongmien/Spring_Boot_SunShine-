package com.sunshine.modelDAO;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sunshine.interfaces.ThanhphoInterface;

@Repository
public class ThanhphoDAO implements ThanhphoInterface{
	@Autowired
	JdbcTemplate template;
	@Override
	public List<Map<String, Object>> list() {
		List<Map<String, Object>> list = template.queryForList("select * from tblthanhpho");
		return list;
	}

	@Override
	public List<Map<String, Object>> listId(int id) {
		List<Map<String, Object>> list = template.queryForList("select * from tblthanhpho where idtp = ?",id);
		return list;
	}
	
}
