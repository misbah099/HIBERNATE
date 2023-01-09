package com.InhertanceJoinTable.entity;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@PrimaryKeyJoinColumn(name="vid")
public class TwoWheels extends Vehicle {
private int Modelno;
private String Modelname;
private boolean Abs;
private int Tyretype;
private String Btype;
}
