package com.uniquecode.licensingservice.model;

/**
 * Author: Abbos Fayziboev
 * Date: 20/12/22
 * Email: abbosFayziboev@gmail.com
 */
import org.springframework.hateoas.RepresentationModel;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter @Setter @ToString
public class License extends RepresentationModel<License> {

    private int id;
    private String licenseId;
    private String description;
    private String organizationId;
    private String productName;
    private String licenseType;

}