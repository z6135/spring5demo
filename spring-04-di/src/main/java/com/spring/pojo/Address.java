package com.spring.pojo;

/**
 * @ProjectName: Spring5study
 * @Package: com.spring.pojo
 * @ClassName: Address
 * @Author: 张晟睿
 * @Date: 2022/2/2 12:42
 * @Version: 1.0
 */
public class Address {
    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Address{" +
                "address='" + address + '\'' +
                '}';
    }
}
