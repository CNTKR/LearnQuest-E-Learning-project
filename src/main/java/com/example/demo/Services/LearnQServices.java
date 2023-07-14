package com.example.demo.Services;


import org.springframework.stereotype.Service;

import com.example.demo.Entity.TrainerStudent;
import com.example.demo.Repository.LearnQ;

@Service
public   class LearnQServices implements LearnQinterface {
	
	LearnQ lq;
	public LearnQServices(LearnQ lq) {
		super();
		this.lq = lq;
	}
	
	@Override
	public String Store(TrainerStudent ts) {
		lq.save(ts);
		return "Stored Successful";
	}
	
	@Override
	public boolean Checkemail(String email) {
		
		return lq.existsByEmail(email);
	}
	@Override
	public boolean valid(String email, String password) {
		if(lq.existsByEmail(email)) {
		TrainerStudent ts = lq.getByEmail(email);
		String dbpasswd=ts.getPassword();
		ts.getProfession();
		if(password.equals(dbpasswd)) {
			return true;
		}
		else {
			return false;
		}
		}
		else {
			return false;
		}
		}

	@Override
	public String getuserRole(String email) {
		 TrainerStudent ts = lq.getByEmail(email);
		    return ts.getProfession();
		
	}
	}


