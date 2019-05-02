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
public class HemoglobinTest extends LaboratoryTest implements TestVisitable {


    public HemoglobinTest() {
        super.testType = TestType.HEMATOLOGY;
        super.setCommonPropertyA("Hemoglobin property A");
        super.setCommonPropertyB("Hemoglobin property B");
        super.setCommonPropertyC("Hemoglobin property C");
    }

    public void calculate() {
        log.info("executing Hemoglobin legacy test");
    }

    @Override
    public void accept(TestVisitor visitor) {
        log.info("Extended Functionality");
        visitor.visit(this);
    }
}
