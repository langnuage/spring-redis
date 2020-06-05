package com.yz.service;

import java.util.List;

import com.yz.pojo.Hero;

public interface HeroService {
	
	public void delete(int id); 
    
    public Hero get(int id); 
      
    public int update(Hero hero);  
        
    public List<Hero> list();
     
    public int count();
    
    public Hero add(Hero hero);

}
