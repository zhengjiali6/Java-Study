package com.zjl.study.week4;

/**
 * @ClassName MarketEmployee
 * @Description TODO
 * @Author zjl
 * @Date 2020/10/26
 **/
public class MarketEmployee extends BaseEmployee {
    private String id;
    private static final String ADMIN = "admin";
    private static final int HIGHER_SALARY =3000;
    private static final int LOWER_SALARY =3000;

    public MarketEmployee(String id) {
        this.id = id;
    }
    public MarketEmployee(){
    }
    @Override
    public void print(){
        super.print();
        System.out.println("This is a MarketEmployee class");
    }


    @Override
    public int getSalary() {
        if (ADMIN.equals(this.id)) {
            return HIGHER_SALARY;
        }else{
            return LOWER_SALARY;
        }
    }

}
