package com.springdemo.envabstract.entity;

import javax.persistence.Entity;

/**
 * 2019/10/30 01:04
 *
 * @author konglinghan
 * @version 1.0
 */
@Entity
public class Product {
    @javax.persistence.Id
    private String Id;
    private String name;
}

