package com.codedrinker.controller;

import com.codedrinker.entity.Authorization;
import com.codedrinker.entity.ResponseDTO;
import com.codedrinker.service.AuthorizationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by codedrinker on 07/07/2017.
 */
@RestController
@RequestMapping(value = "authorizations")
public class AuthorizationController {
    private final Logger logger = LoggerFactory.getLogger(AuthorizationController.class);

    @Autowired
    private AuthorizationService authorizationService;

    @RequestMapping(method = RequestMethod.POST)
    Object create(@RequestBody Authorization authorization) {
        logger.info("save authorization ->{}", authorization);
        ResponseDTO responseDTO = authorizationService.save(authorization);
        return responseDTO;
    }

    @RequestMapping(method = RequestMethod.PUT)
    Object update(@RequestBody Authorization authorization) {
        logger.info("update by authorization ->{}", authorization);
        ResponseDTO responseDTO = authorizationService.update(authorization);
        return responseDTO;
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    Object delete(@PathVariable(value = "id") Integer id) {
        logger.info("delete by id ->{}", id);
        authorizationService.delete(id);
        return ResponseDTO.ok(null);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    Object get(@PathVariable(value = "id") Integer id) {
        logger.info("get by id ->{}", id);
        ResponseDTO responseDTO = authorizationService.get(id);
        return responseDTO;
    }
}
