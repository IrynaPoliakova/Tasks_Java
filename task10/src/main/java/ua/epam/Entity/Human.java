package ua.epam.Entity;

import java.util.Date;

/**
 * Created by irinapoliakova on 25.09.16.
 */
public class Human {

    private String name;
    private Date birthDate;
    public enum Gender { MALE , FEMALE };
    private Gender gender;
    public enum BloodGroup {FIRST , SECOND, THIRD , FOURTH};
    private BloodGroup bloodGroup;

    public Human() {
    }

    public Human(String name, Date birthDate, Gender gender, BloodGroup bloodGroup) {
        this.name = name;
        this.birthDate = birthDate;
        this.gender = gender;
        this.bloodGroup = bloodGroup;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public BloodGroup getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(BloodGroup bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", birthDate=" + birthDate +
                ", gender=" + gender +
                ", bloodGroup=" + bloodGroup +
                '}';
    }
}
