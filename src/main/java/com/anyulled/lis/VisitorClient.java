package com.anyulled.lis;

import com.anyulled.lis.model.RocheOrder;
import com.anyulled.lis.service.Visitor;
import com.anyulled.lis.service.impl.RocheTestVisitor;
import com.anyulled.lis.service.legacy.GlucoseTest;
import com.anyulled.lis.service.legacy.HemoglobinTest;
import com.anyulled.lis.service.legacy.SodiumTest;

import java.util.UUID;

public class VisitorClient {

    public static void main(String[] args) {

        Visitor visitor = new RocheTestVisitor();

        RocheOrder order = new RocheOrder(generateUuid());

        order.getRocheTests().add(new GlucoseTest(generateUuid()));
        order.getRocheTests().add(new SodiumTest(generateUuid()));
        order.getRocheTests().add(new GlucoseTest(generateUuid()));
        order.getRocheTests().add(new HemoglobinTest(generateUuid()));

        order.accept(visitor);
    }

    private static String generateUuid() {
        return UUID.randomUUID().toString();
    }
}