package com.yz.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.yz.pojo.Hero;

@Repository
public interface HeroMapper {
	
	public int add(Hero hero); 
    
    public void delete(int id); 
        
    public Hero get(int id); 
      
    public int update(Hero hero);  
        
    public List<Hero> list();
     
    public int count();


}
