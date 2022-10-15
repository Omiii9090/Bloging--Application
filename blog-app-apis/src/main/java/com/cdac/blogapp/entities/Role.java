package com.cdac.blogapp.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
public class Role {
	
	@Id
private int id;
private String name;


}
