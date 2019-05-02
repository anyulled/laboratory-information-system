package com.anyulled.lis.service.impl;

import com.anyulled.lis.model.enums.TestType;
import com.anyulled.lis.service.TestVisitor;
import com.anyulled.lis.service.legacy.GlucoseTest;
import com.anyulled.lis.service.legacy.HemoglobinTest;
import com.anyulled.lis.service.legacy.LaboratoryTest;
import com.anyulled.lis.service.legacy.SodiumTest;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TestVisitorA extends LaboratoryTest implements TestVisitor {

    public TestVisitorA() {
        super.testType = TestType.BIOCHEMISTRY;
        super.setCommonPropertyA("VisitorA property A");
        super.setCommonPropertyB("VisitorA property B");
        super.setCommonPropertyC("VisitorA property C");
    }

    @Override
    public void visit(GlucoseTest glucoseTest) {
        log.info("Extended functionality A - Glucose");
        glucoseTest.accept(this);
    }

    @Override
    public void visit(HemoglobinTest hemoglobinTest) {
        log.info("Extended functionality A - Hemoglobin");
        hemoglobinTest.accept(this);
    }

    @Override
    public void visit(SodiumTest sodiumTest) {
        log.info("Extended functionality A - Sodium");
        sodiumTest.accept(this);
    }
}
