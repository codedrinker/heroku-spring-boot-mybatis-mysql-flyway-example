package com.codedrinker.request;

import com.codedrinker.dto.AdminDTO;
import com.codedrinker.entity.Admin;
import org.springframework.beans.BeanUtils;

/**
 * Created by codedrinker on 01/04/2018.
 */
public class AdminRequestBuilder {
    public static Admin build(AdminDTO adminDTO) {
        Admin admin = new Admin();
        BeanUtils.copyProperties(adminDTO, admin);
        return admin;
    }
}
