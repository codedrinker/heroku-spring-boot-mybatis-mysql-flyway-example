package com.codedrinker.service;

import com.codedrinker.dto.AdminDTO;
import com.codedrinker.entity.ResponseDTO;

/**
 * Created by codedrinker on 23/07/2017.
 */
public interface AdminService {
    ResponseDTO save(AdminDTO adminDTO);
    ResponseDTO update(AdminDTO adminDTO);
    ResponseDTO select(Integer id);
    ResponseDTO list();
    ResponseDTO delete(Integer id);
}
