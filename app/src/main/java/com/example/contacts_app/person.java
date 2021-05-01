package com.example.contacts_app;

public class person {
    String name;
    String email;
    String preference;
    String no;
    String adress;
    String dateofbirth;

    public person(String name,String email,String preference,String no,String adress, String dateofbirth) {
        this.name = name;
        this.email = email;
        this.preference = preference;
        this.no=no;
        this.adress=adress;
        this.dateofbirth=dateofbirth;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;

    }

    public String getPreference() {
        return preference;
    }

    public void setPreference(String preference) {
        this.preference = preference;
    }

    public String getNo() {
        return no;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setNo(String no) {
        this.no = no;

    }

    public String getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(String dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    @Override
    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", preference='" + preference + '\'' +
                ", no='" + no + '\'' +
                ", adress='" + adress + '\'' +
                ", dateofbirth='" + dateofbirth + '\'' +
                '}';
    }
}
