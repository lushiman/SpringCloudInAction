package com.forezp.client.hystrix;

import com.forezp.client.UserServiceClient;
import com.forezp.dto.RespDTO;
import com.forezp.entity.User;
import org.springframework.stereotype.Component;



@Component
public class UserServiceHystrix implements UserServiceClient {

    @Override
    public RespDTO<User> getUser(String token, String username) {
        System.out.println(token);
        System.out.println(username);
        return null;
    }

	@Override
	public RespDTO<String> getLsm01(String token, String abc) {
		System.out.println("熔断器执行="+abc);
		return null;
	}
}
