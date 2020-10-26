package com.zjl.study.week4;

import org.junit.Test;

import static org.junit.Assert.*;

public class MarketEmployeeTest {

    @Test
    public void print() {
        MarketEmployee me = new MarketEmployee("admin");
        me.print();
    }

    @Test
    public void getSalary() {
        MarketEmployee me = new MarketEmployee("admin");
        int salary = me.getSalary();
        assertEquals(3000,salary);
    }
}