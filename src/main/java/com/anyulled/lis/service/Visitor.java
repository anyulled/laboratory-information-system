package com.anyulled.lis.service;

import com.anyulled.lis.service.legacy.GlucoseTest;
import com.anyulled.lis.service.legacy.HemoglobinTest;
import com.anyulled.lis.service.legacy.SodiumTest;

public interface Visitor {

    void visit(HemoglobinTest xe);

    void visit(GlucoseTest je);

    void visit(SodiumTest sodiumTest);
}
