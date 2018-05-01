package com.codedrinker.entity;

import lombok.Data;

/**
 * Created by codedrinker on 23/07/2017.
 */

@Data
public class Admin {
    private Integer id;
    private String username;
    private String password;
    private Long gmtCreated;
    private Long gmtModified;
    private Integer status = 1;
}
