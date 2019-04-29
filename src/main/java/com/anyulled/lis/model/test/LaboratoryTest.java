package com.anyulled.lis.model.test;

import com.anyulled.lis.model.enums.TestType;
import com.anyulled.lis.service.TestVisitable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Data
@EqualsAndHashCode
@SuperBuilder
@AllArgsConstructor
public abstract class LaboratoryTest implements TestVisitable {

    protected TestType testType;
    Logger logger;
    private String commonPropertyA;
    private String commonPropertyB;
    private String commonPropertyC;

    protected LaboratoryTest() {
    }

    public void calculate() {
        logger.info("Generic laboratory test");
    }
}
