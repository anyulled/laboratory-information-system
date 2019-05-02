package com.anyulled.lis.model;

import com.anyulled.lis.service.legacy.LaboratoryTest;
import lombok.Builder;
import lombok.Data;
import lombok.Singular;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Data
@Builder
@Slf4j
public class Order {

    private String label;
    @Singular
    private List<LaboratoryTest> tests;
    private Container container;

}
