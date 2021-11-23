package com.sunshine.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sunshine.service.PhuongxaService;

@RestController
@RequestMapping("/phuongxa")
public class PhuongxaController {
	@Autowired
	private PhuongxaService service;
	
	@GetMapping("/list")
	public List<Map<String, Object>> list(Model model) {
		return service.list();
	}

	@GetMapping("/list/{id}")
	public List<Map<String, Object>> listId(@PathVariable int id, Model model) {

		return service.listId(id);
	}
}
