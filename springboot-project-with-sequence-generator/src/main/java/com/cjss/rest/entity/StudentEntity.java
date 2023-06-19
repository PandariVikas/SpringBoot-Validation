package com.cjss.rest.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
public class StudentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "sid_generator")
    @SequenceGenerator(name = "sid_generator", sequenceName = "sid_generator", initialValue = 1, allocationSize=10)
    @GenericGenerator(name="sid_generator", strategy = "com.cjss.rest.entity.StringPrefixedSequenceGenerator",parameters = {
            @Parameter(name = StringPrefixedSequenceIdGenerator.INCREMENT_PARAM, value = "1"),
            @Parameter(name = StringPrefixedSequenceIdGenerator.VALUE_PREFIX_PARAMETER, value = "CJSS_"),
            @Parameter(name = StringPrefixedSequenceIdGenerator.NUMBER_FORMAT_PARAMETER, value = "%05d") })
    private String sid;
    private String name;
}
