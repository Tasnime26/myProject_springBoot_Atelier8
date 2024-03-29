package com.tasnime.freelancer.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Role {
@Id
@GeneratedValue (strategy=GenerationType.IDENTITY) 
private Long role_id;
private String role;
}