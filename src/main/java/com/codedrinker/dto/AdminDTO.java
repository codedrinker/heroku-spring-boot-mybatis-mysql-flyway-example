package com.codedrinker.dto;

import lombok.Data;

/**
 * Created by codedrinker on 01/04/2018.
 */
@Data
public class AdminDTO {
    private Integer id;
    private String username;
    private String password;
    private Long gmtCreated;
    private Long gmtModified;
    private Integer status = 1;
}
