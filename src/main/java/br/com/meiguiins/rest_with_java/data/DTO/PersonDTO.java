package br.com.meiguiins.rest_with_java.data.DTO;

import java.io.Serializable;
import java.util.Objects;



public class PersonDTO implements Serializable {

    private static  final long serialVersionUID = 1L;

    private Long id;
    private String firstName;
    private String lastName;
    private String adrress;
    private String gender;

    public PersonDTO() {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.adrress = adrress;
        this.gender = gender;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public String getAdrress() {
        return adrress;
    }

    public void setAdrress(String adrress) {
        this.adrress = adrress;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof PersonDTO person)) return false;
        return Objects.equals(getId(), person.getId()) && Objects.equals(getFirstName(), person.getFirstName()) && Objects.equals(getLastName(), person.getLastName()) && Objects.equals(getAdrress(), person.getAdrress()) && Objects.equals(getGender(), person.getGender());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getFirstName(), getLastName(), getAdrress(), getGender());
    }


}
