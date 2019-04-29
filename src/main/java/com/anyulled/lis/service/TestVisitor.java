package com.anyulled.lis.service;

import com.anyulled.lis.model.test.GlucoseTest;
import com.anyulled.lis.model.test.HemoglobinTest;
import com.anyulled.lis.model.test.LaboratoryTest;
import com.anyulled.lis.model.test.SodiumTest;

public interface TestVisitor {

    void visit(LaboratoryTest test);
    void visit(GlucoseTest glucoseTest);
    void visit(HemoglobinTest hemoglobinTest);
    void visit(SodiumTest sodiumTest);
}
