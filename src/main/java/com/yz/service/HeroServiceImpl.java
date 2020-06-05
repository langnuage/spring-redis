package com.yz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.yz.mapper.HeroMapper;
import com.yz.pojo.Hero;

@Service
public class HeroServiceImpl implements HeroService {

	@Autowired
	private HeroMapper hm;
	@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.READ_COMMITTED)
	public List<Hero> list() {
		// TODO Auto-generated method stub
		return hm.list();
	}
	public void delete(int id) {
		// TODO Auto-generated method stub
		hm.delete(id);
		
	}
	@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.READ_COMMITTED)
	@Cacheable(value="redisCacheManager", key="'hero_'+#id")
	public Hero get(int id) {
		// TODO Auto-generated method stub
		return hm.get(id);
	}
	public int update(Hero hero) {
		// TODO Auto-generated method stub
		hm.update(hero);
		return 0;
	}
	public int count() {
		// TODO Auto-generated method stub
		return hm.count();
	}
	@Transactional(propagation=Propagation.REQUIRED, isolation=Isolation.READ_COMMITTED)
	@CachePut(value="redisCacheManager", key="'hero_'+#hero.id")
	public Hero add(Hero hero) {
		// TODO Auto-generated method stub
		hm.add(hero);
		return hero;
	}

}
