package org.example.graphql.repository;

import org.example.graphql.model.Centre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CentreRepository extends JpaRepository<Centre,Long> {
}
