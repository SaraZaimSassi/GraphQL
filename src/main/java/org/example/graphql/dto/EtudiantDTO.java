package org.example.graphql.dto;

import org.example.graphql.enums.Genre;

public record EtudiantDTO (
        String nom,
        String prenom,
        Genre genre,
        Long centreId
){ }