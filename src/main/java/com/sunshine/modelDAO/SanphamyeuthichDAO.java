package com.sunshine.modelDAO;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sunshine.interfaces.SanphamyeuthichInterface;
import com.sunshine.model.Sanphamyeuthich;
@Repository
public class SanphamyeuthichDAO implements SanphamyeuthichInterface {
	@Autowired
	JdbcTemplate template;
	@Override
	public List<Map<String, Object>> list() {
		List<Map<String, Object>> list = template.queryForList("select * from tblsanphamyeuthich");
		return list;
	}

	@Override
	public List<Map<String, Object>> listId(int id) {
		List<Map<String, Object>> list = template.queryForList("select * from tblsanphamyeuthich where idkh = ",id);
		return list;
	}

	@Override
	public int add(Sanphamyeuthich p) {
		String sql = "INSERT INTO tblsanphamyeuthich ( idkh, idsp)"
				+ " VALUES ( ?, ?);";
		return template.update(sql, p.getIdkh(), p.getIdsp());
	
	}

	@Override
	public int delete(int idkh, int idsp) {
		String sql="DELETE FROM tblsanphamyeuthich WHERE idkh= ? AND idsp= ?";
		return template.update(sql,idkh,idsp);
	}

	@Override
	public int edit(Sanphamyeuthich p) {
		// TODO Auto-generated method stub
		return 0;
	}

}
