package com.anyulled.lis.service.legacy;

import com.anyulled.lis.model.enums.TestType;
import com.anyulled.lis.service.TestVisitable;
import com.anyulled.lis.service.TestVisitor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;
import lombok.extern.slf4j.Slf4j;

@Data
@EqualsAndHashCode(callSuper = true)
@SuperBuilder
@Slf4j
public class GlucoseTest extends LaboratoryTest implements TestVisitable {

    private String specificPropertyA;
    private String specificPropertyB;
    private String specificPropertyC;

    public GlucoseTest() {
        super.testType = TestType.HEMATOLOGY;
        super.setCommonPropertyA("Glucose property A");
        super.setCommonPropertyB("Glucose property B");
        super.setCommonPropertyC("Glucose property C");
    }

    public void calculate() {
        log.info("executing glucose legacy test");
    }

    @Override
    public void accept(TestVisitor visitor) {
        log.info("Extended Functionality");
        visitor.visit(this);
    }
}
