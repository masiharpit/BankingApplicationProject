package com.techment.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techment.entity.Nominee;
import com.techment.repository.INomineeRepository;

@Service
public class NomineeService implements INomineeService{

	@Autowired
	private INomineeRepository repository ;

	
	@Override
	public Nominee addNominee(Nominee nominee) {
		  repository.save(nominee);
		  return nominee ;
	}
	
	@Override
	public List<Nominee> getAllNominees()
	{
		return repository.findAll();
		
	}

	@Override
	public Nominee updateNominee(int nomineeId , Nominee nominee) 
	{
		Nominee existingNominee = repository.findById(nomineeId).get();
		existingNominee.setNomineeId(nominee.getNomineeId());
		existingNominee.setName(nominee.getName());
		existingNominee.setGovtId(nominee.getGovtId());
		existingNominee.setPhoneNo(nominee.getPhoneNo());
		repository.save(existingNominee);
		return existingNominee;
	}

	@Override
	public String deleteNominee(int nomineeId) {
		repository.deleteById(nomineeId);
		return "Nominee Deleted || " + nomineeId ;
	}

	@Override
	public Nominee getNomineeById(int nomineeId) {
		return repository.findById(nomineeId).get();

	}		
	
	
}
