package com.zjl.study.week3;

/**
 * @ClassName Test
 * @Description TODO
 * @Author zjl
 * @Date 2020/10/19
 **/
public class Test {
    public static void main(String[] args) {
        CPU cpu = new CPU();
        HardDisk hardDisk=new HardDisk();
        cpu.setSpeed(2200);
        hardDisk.setAmount(200);
        PC pc =new PC();
        pc.setCpu(cpu);
        pc.setHardDisk(hardDisk);
        pc.show();
    }
}

