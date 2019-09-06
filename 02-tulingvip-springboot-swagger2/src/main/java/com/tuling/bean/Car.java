package com.tuling.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by smlz on 2019/5/5.
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Car {

    public String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
