package com.example.spring_todo_app.entity;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "todos")
public class Todo {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Long id; 

   @Column(name = "name")
   @NotBlank
   private String name;

   @Column(name = "description")
   private String description;

   @Column(name = "completed")
   @Nonnull
   private Boolean completed;
}
