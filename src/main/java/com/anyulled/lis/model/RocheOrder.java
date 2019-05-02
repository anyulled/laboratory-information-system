package com.anyulled.lis.model;

import com.anyulled.lis.model.enums.TestType;
import com.anyulled.lis.service.Visitor;
import com.anyulled.lis.service.legacy.RocheTest;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Data
@EqualsAndHashCode(callSuper = true)
public class RocheOrder extends RocheTest {

    @Builder.Default
    private List<RocheTest> rocheTests = new ArrayList<>();
    private Container container;

    public RocheOrder(String uuid) {
        super(uuid);
        super.setTestType(TestType.IMMUNOLOGY);
    }

    @Override
    public void accept(Visitor v) {
        for (RocheTest e : this.rocheTests) {
            e.accept(v);
        }
    }
}