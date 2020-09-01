package com.forezp.client;

import com.forezp.client.hystrix.UserServiceHystrix;
import com.forezp.dto.RespDTO;
import com.forezp.entity.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;





@FeignClient(value = "user-service",fallback = UserServiceHystrix.class )
public interface UserServiceClient {

    @PostMapping(value = "/user/{username}")
    RespDTO<User> getUser(@RequestHeader(value = "Authorization") String token, @PathVariable("username") String username);
    
    @PostMapping(value = "/user/lsm01")
    RespDTO<String> getLsm01(@RequestHeader(value = "Authorization") String token, @RequestParam(value = "abc") String abc); 
}



