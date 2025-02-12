package com.wdbyte.test.junit5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.condition.EnabledOnJre;

import static org.junit.jupiter.api.condition.JRE.JAVA_19;

/**
 * @author niulang
 * @date 2022/11/17
 */
@TestMethodOrder(OrderAnnotation.class)
public class JUnitJDKVersion {

    @Test
    //@EnabledOnJre(JAVA_19)
    @DisplayName("测试是否是狗")
    @Order(2)
    public void testIsDog() {
        String name = "dog";
        Assertions.assertEquals(name, "dog");
        System.out.println("is dog");
    }

    @DisplayName("是否是猫")
    @Test
    @Order(10)
    public void testIsCat() {
        String name = "cat";
        Assertions.assertEquals(name, "cat");
        System.out.println("is cat");
    }
}
