package co.simplon.heroku.entity;


import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

/*
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString*/
public class Company implements Serializable{
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private boolean selected;
}
