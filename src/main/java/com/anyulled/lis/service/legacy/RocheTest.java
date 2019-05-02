package com.anyulled.lis.service.legacy;

import com.anyulled.lis.model.enums.TestType;
import com.anyulled.lis.service.Visitor;
import lombok.Data;

@Data
public abstract class RocheTest {

    String uuid;
    String commonPropertyA;
    String commonPropertyB;
    TestType testType;

    protected RocheTest(String uuid) {
        this.uuid = uuid;
    }

    public abstract void accept(Visitor v);
}