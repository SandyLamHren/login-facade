package com.dhxl33.facade;

import com.dhxl33.dto.UserInfoDTO;
import com.dhxl33.dto.UserLoginDTO;

/**
 * @author HaoHao
 * @Description: 用户登录facade
 * @date 2018/4/30下午1:49
 */
public interface LoginFacade {

    /**
     * 用户登录
     * @param userLoginDTO
     * @return
     */
    UserInfoDTO login(UserLoginDTO userLoginDTO);
}
