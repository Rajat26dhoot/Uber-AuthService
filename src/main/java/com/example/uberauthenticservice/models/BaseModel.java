package com.example.uberauthenticservice.models;

import jakarta.annotation.Generated;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@Getter
@Setter
public abstract class BaseModel {
    @Id// this anntaiona make the id property a primary key of our table
    @GeneratedValue(strategy = GenerationType.IDENTITY)//Identiny means auto incremeant
    protected Long id;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP) // this tell spring about the format of date what and which type store
    @CreatedDate        // this tell spring that only handle for object creation
    protected Date createdAt;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate  // this tell spring that only handle for object update
    protected Date updatedAt;


}