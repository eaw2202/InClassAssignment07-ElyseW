package com.elysewarren.inclassassignment07_elysew;

/**
 * Created by elysewarren on 3/31/17.
 */

public class Dog {
    public String dogType;
    public int age;
    public boolean allergic;

    public Dog() {
    }

    public Dog(String dogType, int age, boolean allergies) {
        this.dogType = dogType;
        this.age = age;
        this.allergic = isAllergic();
    }

    public String getDogType() {
        return dogType;
    }

    public int getAge() {
        return age;
    }

    public boolean isAllergic() {
        return allergic;
    }

}

