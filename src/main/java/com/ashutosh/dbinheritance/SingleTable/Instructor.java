package com.ashutosh.dbinheritance.SingleTable;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Instructor extends BaseUser{
    private double averageRating;
}
