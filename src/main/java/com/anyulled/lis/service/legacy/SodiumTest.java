package com.anyulled.lis.service.legacy;

import com.anyulled.lis.model.enums.TestType;
import com.anyulled.lis.service.Visitor;

public class SodiumTest extends RocheTest {

    public SodiumTest(String uuid) {
        super(uuid);
        super.testType = TestType.MICROBIOLOGY;
        super.commonPropertyA = "Sodium";
        super.commonPropertyB = "property";
    }

    public void accept(Visitor v) {
        v.visit(this);
    }
}