/**
 * Copyright (c) 2015, Gigaware Solutions.
 */
package com.gigaware.golf.service;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gigaware.golf.dao.MemberDao;
import com.gigaware.golf.entity.Member;

/**
 * @author alex andrade
 * yngwie_alex@hotmail.com
 */
@Service("memberService")
@Transactional
public class MemberServiceImpl implements MemberService, Serializable {

	private static final long serialVersionUID = 4801185605237096560L;
	
	@Autowired
	MemberDao memberDao;
	
	@Override
	public void save(Member m) {
		memberDao.save(m);
	}

	@Override
	public void saveAll(List<Member> members) {
		for(Member m : members){
			this.save(m);
		}
	}

	@Override
	public void update(Member m) {
		memberDao.update(m);
	}

	@Override
	public void delete(Member m) {
		memberDao.delete(m);
	}

	@Override
	public List<Member> getAll() {
		return memberDao.getAll();
	}

	@Override
	public Member getById(Long idPerson) {
		return memberDao.getById(idPerson);
	}

	public void setMemberDao(MemberDao memberDao) {
		this.memberDao = memberDao;
	}
	
	

}