package com.anyulled.lis.model;

import com.anyulled.lis.model.test.LaboratoryTest;
import lombok.Builder;
import lombok.Data;
import lombok.Singular;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

@Data
@Builder
public class Order {

    Logger logger = LoggerFactory.getLogger(Order.class);

    private String label;
    @Singular
    private List<LaboratoryTest> tests;
    private Container container;

}
