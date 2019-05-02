package com.anyulled.lis.service;

import com.anyulled.lis.service.legacy.GlucoseTest;
import com.anyulled.lis.service.legacy.HemoglobinTest;
import com.anyulled.lis.service.legacy.SodiumTest;

public interface TestVisitor {

    void visit(GlucoseTest glucoseTest);
    void visit(HemoglobinTest hemoglobinTest);
    void visit(SodiumTest sodiumTest);
}
