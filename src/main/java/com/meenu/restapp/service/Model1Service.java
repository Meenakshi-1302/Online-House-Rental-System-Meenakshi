package com.meenu.restapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.meenu.restapp.model.Model1;
@Service
public interface Model1Service  {
	public void addData(Model1 mod);
	public Model1 getData(int id);
	public List<Model1> getAllDatas();
	public void updateData(Model1 mod);
	public void deleteData(int id);

}
