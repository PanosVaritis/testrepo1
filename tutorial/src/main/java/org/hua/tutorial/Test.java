package org.hua.tutorial;

/**
 *
 * @author panos
 */
public class Test {
    private String name;
    private int age;
    private String surname;
    private int taxNumber;

    public Test(String name, int age, String surname, int taxNumber) {
        this.name = name;
        this.age = age;
        this.surname = surname;
        this.taxNumber = taxNumber;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSurname() {
        return surname;
    }

    public int getTaxNumber() {
        return taxNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setTaxNumber(int taxNumber) {
        this.taxNumber = taxNumber;
    }    
    
    
}
