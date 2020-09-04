package io.fulchr3356.upkeepassistant.models;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "user", schema = "upkeep_assistant")
public class User implements EntityInterface<String>{
    private String id;
    private String name;
    private String email;

    @Id
    @Column(name = "id", nullable = false)
    public String getId() {
        return id;
    }

    public void  setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name", nullable = false, length = 50)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "email", nullable = false, length = 50)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id) &&
                Objects.equals(name, user.name) &&
                Objects.equals(email, user.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, email);
    }
}
