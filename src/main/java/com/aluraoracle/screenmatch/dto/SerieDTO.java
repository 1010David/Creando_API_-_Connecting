package com.aluraoracle.screenmatch.dto;

import com.aluraoracle.screenmatch.model.Categoria;

public record SerieDTO (
        String titulo,
        Integer totalTemporadas,
        Double evaluacion,
        String poster,
        Categoria genero,
        String actores,
        String sinopsis
){
}
