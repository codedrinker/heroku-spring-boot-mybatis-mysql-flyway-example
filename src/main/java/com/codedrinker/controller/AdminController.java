package com.codedrinker.controller;

import com.codedrinker.dto.AdminDTO;
import com.codedrinker.entity.ResponseDTO;
import com.codedrinker.service.AdminService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by codedrinker on 07/07/2017.
 */
@RestController
@RequestMapping(value = "admins")
public class AdminController {
    private final Logger logger = LoggerFactory.getLogger(AdminController.class);

    @Autowired
    private AdminService adminService;

    @RequestMapping(method = RequestMethod.POST)
    Object create(@RequestBody AdminDTO admin) {
        logger.info("insert admin -> {}", admin);
        return adminService.save(admin);
    }

    @RequestMapping(method = RequestMethod.PUT)
    Object update(@RequestBody AdminDTO admin) {
        logger.info("update admin -> {}", admin);
        return adminService.update(admin);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    Object delete(@PathVariable(value = "id") Integer id) {
        logger.info("delete admin id -> {}", id);
        return adminService.delete(id);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    Object get(@PathVariable(value = "id") Integer id) {
        logger.info("select by id -> {}", id);
        ResponseDTO responseDTO = adminService.select(id);
        return responseDTO;
    }

    @RequestMapping(method = RequestMethod.GET)
    Object list() {
        logger.info("list");
        ResponseDTO responseDTO = adminService.list();
        return responseDTO;
    }
}
