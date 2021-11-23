package com.sunshine.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sunshine.model.Sanphamyeuthich;
import com.sunshine.service.SanphamyeuthichService;

@RestController
@RequestMapping("/sanphamyeuthich")
public class SanphamyeuthichController {
	@Autowired
	private SanphamyeuthichService service;
	@GetMapping("/list")
	public List<Map<String, Object>> list(Model model) {
		return service.list();
	}
	@GetMapping("/list/{id}")
	public List<Map<String, Object>> listId(@PathVariable int id, Model model) {

		return service.listId(id);
	}

	@PostMapping("/add")
	public String save(@RequestBody Sanphamyeuthich p, Model model) {
		int id = service.add(p);
		if (id == 0) {
			return "Them that bai!!!";
		}
		return "Them thanh cong!!!";
	}

	
	@PostMapping("/delete/{idkh}/{idsp}")
	public String delete(@PathVariable int idkh,@PathVariable  int idsp, Model model) {
		int r = service.delete(idkh,idsp);
		if (r == 0) {
			return "Xoa that bai!!!";
		}
		return "Xoa thanh cong!!!";
	}
}
