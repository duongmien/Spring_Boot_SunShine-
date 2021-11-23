package com.sunshine.modelDAO;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sunshine.interfaces.ChitiethoadonInterface;
import com.sunshine.model.Chitiethoadon;

@Repository
public class ChitiethoadonDAO implements ChitiethoadonInterface{
	@Autowired
	JdbcTemplate template;
	@Override
	public List<Map<String, Object>> list() {
		List<Map<String, Object>> list = template.queryForList("select * from tblchitiethoadon");
		return list;
	}

	@Override
	public List<Map<String, Object>> listId(int id) {
		List<Map<String, Object>> list = template.queryForList("select * from tblchitiethoadon where idkh = ?",id);
		return list;
	}

	@Override
	public int add(Chitiethoadon p) {
		String sql = "INSERT INTO tblchitiethoadon (idhd, idsp, soluong)"
				+ " VALUES (?, ?, ?);";
		return template.update(sql, p.getIdhd(),p.getIdsp(),p.getSoluong());
	}

	@Override
	public int edit(Chitiethoadon p) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

}
