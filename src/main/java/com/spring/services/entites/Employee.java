package com.spring.services.entites;
import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="employee")
public class Employee {
    @Id
	
	private Long id;
	@Column(name="NAME",nullable=false)
	private String name;
	@Column(name="DEP",nullable=false)
	private String dep;
	@Column(name="ROLE",nullable=false)
	private String role;
	

    public Employee() {
    }

    public Employee(Long id, String name, String dep, String role) {
        this.id = id;
        this.name = name;
        this.dep = dep;
        this.role = role;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDep() {
        return this.dep;
    }

    public void setDep(String dep) {
        this.dep = dep;
    }

    public String getRole() {
        return this.role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", name='" + getName() + "'" +
            ", dep='" + getDep() + "'" +
            ", role='" + getRole() + "'" +
            "}";
    }
	
    
}
