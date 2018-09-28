package com.sunjx.springboot.controller;

import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by jx on 2018/6/12.
 */
@Controller
@RequestMapping("/steredis")
public class RedisStringController {
    private StringRedisTemplate redisClient;

    @RequestMapping("/setget.html")
    public @ResponseBody String env(@RequestParam(defaultValue="123") String para  ) throws Exception{
        GenericJackson2JsonRedisSerializer genericJackson2JsonRedisSerializer=
                new GenericJackson2JsonRedisSerializer();
        redisClient.opsForValue().set("testenv", para);
        String str = redisClient.opsForValue().get("testenv");
        return str;
    }

}
