package com.anyulled.lis.service.impl;

import com.anyulled.lis.model.enums.TestType;
import com.anyulled.lis.service.TestVisitor;
import com.anyulled.lis.service.legacy.GlucoseTest;
import com.anyulled.lis.service.legacy.HemoglobinTest;
import com.anyulled.lis.service.legacy.LaboratoryTest;
import com.anyulled.lis.service.legacy.SodiumTest;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TestVisitorB extends LaboratoryTest implements TestVisitor {

    public TestVisitorB() {
        super.testType = TestType.BIOCHEMISTRY;
        super.setCommonPropertyA("VisitorB property A");
        super.setCommonPropertyB("VisitorB property B");
        super.setCommonPropertyC("VisitorB property C");
    }

    @Override
    public void visit(GlucoseTest glucoseTest) {
        log.info("Extended functionality B - Glucose");
        glucoseTest.accept(this);
    }

    @Override
    public void visit(HemoglobinTest hemoglobinTest) {
        log.info("Extended functionality B - Hemoglobin");
        hemoglobinTest.accept(this);
    }

    @Override
    public void visit(SodiumTest sodiumTest) {
        log.info("Extended functionality B - Sodium");
        sodiumTest.accept(this);
    }
}
