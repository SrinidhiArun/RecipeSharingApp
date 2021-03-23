package org.launchcode.recipeapp.model;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
public class User extends AbstractEntity {
    @NotBlank(message = "User name is required")
    private String name;
    @Size(max= 120)
    private String aboutUser;
    @Size(max= 30)
    private String location;
    @OneToMany
    private List<Recipe> recipeList;

    public User() {
    }

    public User(@NotBlank(message = "User name is required") String name, String aboutUser, String location, List<Recipe> recipeList) {
        this.name = name;
        this.aboutUser = aboutUser;
        this.location = location;
        this.recipeList = recipeList;
    }
}
