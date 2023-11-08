package com.ashutosh.dbinheritance.SingleTable;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Student extends BaseUser{
    private int psp;
    private int batch_id;
}
