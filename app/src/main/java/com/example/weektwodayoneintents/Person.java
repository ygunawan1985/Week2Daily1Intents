package com.example.weektwodayoneintents;

import android.os.Parcel;
import android.os.Parcelable;

public class Person implements Parcelable {
    private String firstName;
    private String lastName;
    private String gender;
    private int age;
    private String maritalStatus;

    public Person() {
    }

    public Person(String firstName, String lastName, String gender, int age, String maritalStatus) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
        this.maritalStatus = maritalStatus;
    }

    protected Person(Parcel in) {
        firstName = in.readString();
        lastName = in.readString();
        gender = in.readString();
        age = in.readInt();
        maritalStatus = in.readString();
    }

    public static final Creator<Person> CREATOR = new Creator<Person>() {
        @Override
        public Person createFromParcel(Parcel in) {
            return new Person(in);
        }

        @Override
        public Person[] newArray(int size) {
            return new Person[size];
        }
    };

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(firstName);
        parcel.writeString(lastName);
        parcel.writeString(gender);
        parcel.writeInt(age);
        parcel.writeString(maritalStatus);
    }

    @Override
    public String toString() {
        return "FirstName='" + firstName + '\'' +
                ", LastName='" + lastName + '\'' +
                ", Gender='" + gender + '\'' +
                ", Age=" + age +
                ", MaritalStatus='" + maritalStatus + '\'';
    }
}
