/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstgit;

/**
 *
 * @author wboyer
 */
public class Animal {

    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (validateAge(age)) {
            this.age = age;
        }
    }

    private boolean validateAge(int age) {
        if (age < 0 || age > 999) {
            return true;
        } else {
            return false;
        }
    }
}
