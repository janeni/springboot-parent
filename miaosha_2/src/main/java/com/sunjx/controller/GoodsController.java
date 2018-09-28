package com.sunjx.controller;

import com.sunjx.domain.MiaoshaUser;
import com.sunjx.redis.RedisService;
import com.sunjx.service.MiaoshaUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/goods")
public class GoodsController {

	@Autowired
	MiaoshaUserService userService;
	
	@Autowired
	RedisService redisService;
	
    /*@RequestMapping("/to_list")
    public String list(Model model,MiaoshaUser user) {
    	model.addAttribute("user", user);
        return "goods_list";
    }*/

	/**
	 * 该方法已被webconfig-代替
	 * @param model
	 * @param cookieToken
	 * @param paramToken
	 * @return
	 */
	@RequestMapping("/to_list")
	public String list(Model model,
					   @CookieValue(value = MiaoshaUserService.COOKI_NAME_TOKEN,required = false)String cookieToken,
					   @RequestParam(value = MiaoshaUserService.COOKI_NAME_TOKEN,required = false)String paramToken) {
		if(StringUtils.isEmpty(cookieToken)&&StringUtils.isEmpty(paramToken)){
			return "login";
		}
		String token=StringUtils.isEmpty(paramToken)?cookieToken:paramToken ;
		MiaoshaUser user=userService.getByToken(token);
		model.addAttribute("user",user);
		return "goods_list";
	}

    
}
