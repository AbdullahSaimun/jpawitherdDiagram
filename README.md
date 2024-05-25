# JPA Entities README

## Overview

This project implements JPA entities with various relationships and annotations for a Spring Boot application. Below are the explanations of the annotations used in the entities.

## Annotations Explanation

1. **@OneToMany(mappedBy = "teacher", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)**
    - Defines a one-to-many relationship where the inverse side is specified by the `teacher` field in the child entity.
    - Cascades all operations to associated entities.
    - Removes orphaned entities from the database.
    - Lazy loads associated entities.

2. **@ManyToMany(mappedBy = "teachers", fetch = FetchType.LAZY)**
    - Defines a many-to-many relationship where the inverse side is specified by the `teachers` field in the associated entity.
    - Lazy loads associated entities.

    **@JoinTable**
    - Specifies the details of the join table for the many-to-many relationship.
        - `name = "SubjectTeacher"`: Specifies the name of the join table.
        - `joinColumns = @JoinColumn(name = "subject_id")`: Specifies the column in the join table that references the `Subject` entity.
        - `inverseJoinColumns = @JoinColumn(name = "teacher_id")`: Specifies the column in the join table that references the `Teacher` entity.

3. **@ManyToOne**
    - Defines a many-to-one relationship.

4. **@OneToOne**
    - Defines a one-to-one relationship between two entities.
   
5. **@JsonManagedReference**
    - Used on the owning side of a bidirectional relationship for proper JSON serialization.


6. **@JsonBackReference**
    - Used on the inverse side of a bidirectional relationship to avoid circular references during JSON serialization.


## Usage

- Use these annotations in your entity classes to define relationships between entities.
- Customize cascade types and fetch types based on your application requirements.
- Ensure proper management of bidirectional relationships to avoid circular references during serialization.

