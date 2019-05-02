package com.anyulled.lis.service.impl;

import com.anyulled.lis.service.Visitor;
import com.anyulled.lis.service.legacy.GlucoseTest;
import com.anyulled.lis.service.legacy.HemoglobinTest;
import com.anyulled.lis.service.legacy.SodiumTest;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RocheTestVisitor implements Visitor {

    private static final String STRING = "{}: processing {} test with uuid: {}";

    @Override
    public void visit(HemoglobinTest hemoglobin) {
        log.info(STRING, hemoglobin.getTestType().toString(), hemoglobin.getCommonPropertyA(), hemoglobin.getUuid());
    }

    @Override
    public void visit(GlucoseTest glucose) {
        log.info(STRING, glucose.getTestType().toString(), glucose.getCommonPropertyA(), glucose.getUuid());
    }

    @Override
    public void visit(SodiumTest sodiumTest) {
        log.info(STRING, sodiumTest.getTestType().toString(), sodiumTest.getCommonPropertyA(), sodiumTest.getUuid());
    }
}