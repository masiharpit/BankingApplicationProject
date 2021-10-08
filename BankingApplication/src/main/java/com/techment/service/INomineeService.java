package com.techment.service;

import java.util.List;

import com.techment.entity.Nominee;

public interface INomineeService {

	public Nominee addNominee(Nominee nominee);
	public Nominee updateNominee(int nomineeId , Nominee nominee);
	public String deleteNominee(int nomineeId);
	public Nominee getNomineeById(int nomineeId);
	public List<Nominee> getAllNominees();


}
