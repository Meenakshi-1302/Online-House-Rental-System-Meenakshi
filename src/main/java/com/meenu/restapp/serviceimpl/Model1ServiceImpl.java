package com.meenu.restapp.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import com.meenu.restapp.model.Model1;
import com.meenu.restapp.repository.Model1Repo;
import com.meenu.restapp.service.Model1Service;
@Service
public class Model1ServiceImpl implements Model1Service {
	
	
	Model1Repo mrepo;
	

	public Model1ServiceImpl(Model1Repo mrepo) {
		super();
		this.mrepo = mrepo;
	}

	@Override
	public void addData(Model1 mod) {
		
		mrepo.save(mod);
		
		
	}

	@Override
	public Model1 getData(int id) {
		
		    Optional<Model1> ModelOptional = mrepo.findById(id);
		    return (Model1) ModelOptional.orElse(null);
		}
	

	@Override
	public List<Model1> getAllDatas() {
		
		return mrepo.findAll();
	}

	@Override
	public void updateData(Model1 mod) {
		
		mrepo.save(mod);
		
	}

	@Override
	public void deleteData(int id) {
		
		mrepo.deleteById(id);
		
	}

}
