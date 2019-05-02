package com.anyulled.lis.service.legacy;

import com.anyulled.lis.model.enums.TestType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@EqualsAndHashCode
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public abstract class LaboratoryTest {

    protected TestType testType;
    private String commonPropertyA;
    private String commonPropertyB;
    private String commonPropertyC;

}
