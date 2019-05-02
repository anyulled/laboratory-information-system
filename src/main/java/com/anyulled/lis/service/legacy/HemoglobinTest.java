package com.anyulled.lis.service.legacy;

import com.anyulled.lis.model.enums.TestType;
import com.anyulled.lis.service.Visitor;

public class HemoglobinTest extends RocheTest {

    public HemoglobinTest(String uuid) {
        super(uuid);
        super.testType = TestType.HEMATOLOGY;
        super.commonPropertyA = "Hemoglobin";
        super.commonPropertyB = "property";
    }

    public void accept(Visitor v) {
        v.visit(this);
    }
}