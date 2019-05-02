package com.anyulled.lis.service.legacy;

import com.anyulled.lis.model.enums.TestType;
import com.anyulled.lis.service.Visitor;

public class GlucoseTest extends RocheTest {

    public GlucoseTest(String uuid) {
        super(uuid);
        super.testType = TestType.BIOCHEMISTRY;
        super.commonPropertyA = "Glucose";
        super.commonPropertyB = "property";
    }

    public void accept(Visitor v) {
        v.visit(this);
    }
}