package com.codedrinker.service;

import com.codedrinker.dao.AdminDao;
import com.codedrinker.dto.AdminDTO;
import com.codedrinker.entity.Admin;
import com.codedrinker.entity.ResponseDTO;
import com.codedrinker.request.AdminRequestBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by codedrinker on 01/04/2018.
 */
@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminDao adminDao;

    @Override
    public ResponseDTO save(AdminDTO adminDTO) {
        Admin admin = AdminRequestBuilder.build(adminDTO);
        admin.setGmtCreated(System.currentTimeMillis());
        admin.setGmtModified(admin.getGmtCreated());
        adminDao.insert(admin);
        return ResponseDTO.ok(admin);
    }

    @Override
    public ResponseDTO update(AdminDTO adminDTO) {
        Admin admin = AdminRequestBuilder.build(adminDTO);
        adminDao.update(admin);
        return ResponseDTO.ok(admin);
    }

    @Override
    public ResponseDTO select(Integer id) {
        Admin admin = adminDao.select(id);
        return ResponseDTO.ok(admin);
    }

    @Override
    public ResponseDTO list() {
        List<Admin> admins = adminDao.list();
        return ResponseDTO.ok(admins);
    }

    @Override
    public ResponseDTO delete(Integer id) {
        Integer delete = adminDao.delete(id);
        return ResponseDTO.ok(delete);
    }
}
