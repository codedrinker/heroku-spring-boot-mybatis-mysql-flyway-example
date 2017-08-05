package com.codedrinker.service;

import com.codedrinker.dao.AuthorizationDao;
import com.codedrinker.entity.Authorization;
import com.codedrinker.entity.ResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by codedrinker on 23/07/2017.
 */
@Component
public class AuthorizationService {
    @Autowired
    private AuthorizationDao authorizationDao;

    public ResponseDTO save(Authorization authorization) {
        if (authorization.getCtime() == null) {
            authorization.setCtime((int) (System.currentTimeMillis() / 1000));
            authorization.setUtime((int) (System.currentTimeMillis() / 1000));
        }
        authorizationDao.save(authorization);
        return ResponseDTO.ok(authorization);
    }

    public ResponseDTO update(Authorization authorization) {
        authorization.setUtime((int) (System.currentTimeMillis() / 1000));
        authorizationDao.update(authorization);
        return ResponseDTO.ok(authorization);
    }

    public void delete(Integer id) {
        authorizationDao.delete(id);
    }

    public ResponseDTO get(Integer id) {
        Authorization authorization = authorizationDao.get(id);
        return ResponseDTO.ok(authorization);
    }
}
