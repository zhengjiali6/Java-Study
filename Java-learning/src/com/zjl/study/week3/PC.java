package com.zjl.study.week3;

import lombok.Getter;
import lombok.Setter;

/**
 * @ClassName PC
 * @Description TODO
 * @Author zjl
 * @Date 2020/10/19
 **/
@Setter
@Getter
public class PC {
    CPU cpu;
    HardDisk hardDisk;

    void show() {
        System.out.println("CPU速度======>" + cpu.getSpeed());
        System.out.println("硬盘容量======>" + hardDisk.getAmount());
    }
}

