package org.restapi;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import io.smallrye.common.constraint.NotNull;
import jakarta.persistence.Entity;

@Entity
public class Person extends PanacheEntity {

    @NotNull
    public String firstName;
    @NotNull
    public String lastName;
    public String otherName;


    public Person() {
    }

    public Person(String firstName, String lastName, String otherName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.otherName = otherName;
    }
}
