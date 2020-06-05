package com.yz.spring_redis;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.redis.core.RedisTemplate;

import com.yz.pojo.Hero;
import com.yz.service.HeroService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext
        		("spring-*.xml");  
        HeroService hs = applicationContext.getBean(HeroService.class);
        RedisTemplate redisTemplate = applicationContext.getBean(RedisTemplate.class);
        Hero hero = new Hero();
        hero.setHname("dr2222");
        //redisTemplate.opsForValue().set("hero_1", hero);
        hs.add(hero);
        Hero newHero = hs.get(hero.getId());
        //Hero newHero = (Hero) redisTemplate.opsForValue().get("hero_47");
        System.out.println(newHero.getId()+"   "+newHero.getHname());

        //System.out.println(hero.getId());
        //hss.add(hero);
        //System.out.println(hero.getId());
        //Hero getHero = hss.get(35);
        
    }
}
