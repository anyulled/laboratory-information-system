package com.anyulled.lis.model;

import com.anyulled.lis.model.enums.SampleType;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Sample {
    String label;
    SampleType type;
}
