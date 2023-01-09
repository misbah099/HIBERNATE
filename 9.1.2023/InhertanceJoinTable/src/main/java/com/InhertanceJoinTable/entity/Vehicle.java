package com.InhertanceJoinTable.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import lombok.Data;

@Entity
@Data
@Inheritance(strategy=InheritanceType.JOINED)
public class Vehicle {

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int Vid;
	@Column(length=10)
	private String Feul;
	@Column(length=10)
	private String EnginePower;
	@Column(length=4)
	private int Speed;
	@Column(length=10)
	private String Vtype;
	@Column(length=4)
	private int Price;
}
