package com.techment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techment.entity.Nominee;
import com.techment.exception.ResourceNotFoundException;
import com.techment.service.INomineeService;

@RestController
@RequestMapping("/nominee")
public class NomineeController {	
	
	
	@Autowired
	private INomineeService iNomineeService ;
	
	@GetMapping("/getAllNominees")
	public List<Nominee> getAllNominees()
	{
		return iNomineeService.getAllNominees();
	}
	
	@GetMapping("/getNomineeById/{nomineeId}")
	public ResponseEntity<Nominee> getNomineeById(@PathVariable(value = "nomineeId") int nomineeId)
			throws ResourceNotFoundException {

		try {
			Nominee nominee = iNomineeService.getNomineeById(nomineeId);
			return ResponseEntity.ok().body(nominee);
		} catch (Exception e) {
			throw new ResourceNotFoundException("Nominee not found for this id :: " + nomineeId);
		}

	}

	@PostMapping("/addNominee")
	public Nominee addNominee(@RequestBody Nominee nominee)
	{
		return iNomineeService.addNominee(nominee);
	}
	
	@PutMapping("/updateNominee/{nomineeId}")
	public ResponseEntity<Nominee> updateNominee(@PathVariable(value = "nomineeId") int nomineeId,
			@RequestBody Nominee nominee) {
		try {
			iNomineeService.updateNominee(nomineeId, nominee);
			return ResponseEntity.ok().body(nominee);
		} catch (Exception e) {
			throw new ResourceNotFoundException("Nominee not found for this id :: " + nomineeId);
		}

	}

	
	@DeleteMapping("/deleteNominee/{nomineeId}")
	public String deleteNominee(@PathVariable(value="nomineeId") int nomineeId)
	{
		 iNomineeService.deleteNominee(nomineeId);
		 return "deleted || " + nomineeId ;
	}

}
