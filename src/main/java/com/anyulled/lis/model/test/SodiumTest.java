package com.anyulled.lis.model.test;

import com.anyulled.lis.model.enums.TestType;
import com.anyulled.lis.service.TestVisitor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Data
@EqualsAndHashCode(callSuper = true)
@SuperBuilder
public class SodiumTest extends LaboratoryTest {

    private Logger logger = LoggerFactory.getLogger(SodiumTest.class);

    public SodiumTest() {
        super.testType = TestType.BIOCHEMISTRY;
    }

    @Override
    public void calculate() {
        logger.info("executing sodium test");
    }

    @Override
    public void accept(TestVisitor visitor) {
        visitor.visit(this);
    }
}
