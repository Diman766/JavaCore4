package org.example;

public class Buyer {
    String name;
    String phone;
    int age;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public Buyer(String name, String phone, int age) {
        this.name = name;
        this.phone = phone;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Buyer person = (Buyer) o;

        if (!getName().equals(person.getName())) {
            return false;
        }
        if (!getPhone().equals(person.getPhone())) {
            return false;
        }
        return getAge() == person.getAge();
    }
}
