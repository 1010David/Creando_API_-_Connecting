package com.aluraoracle.screenmatch.repository;

import com.aluraoracle.screenmatch.dto.EpisodioDTO;
import com.aluraoracle.screenmatch.model.Categoria;
import com.aluraoracle.screenmatch.model.Episodio;
import com.aluraoracle.screenmatch.model.Serie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface SerieRepository extends JpaRepository<Serie,Long>{
    Optional<Serie> findByTituloContainingIgnoreCase(String nombreSerie);

    List<Serie> findTop5ByOrderByEvaluacionDesc();

    List<Serie> findByGenero(Categoria categoria);

    @Query("select s from Serie s WHERE s.totalTemporadas <= :totalTemporadas AND s.evaluacion >= :evaluacion")
    List<Serie> seriesPorTemporadaYEvaluacion(int totalTemporadas, double evaluacion);

    // List<Serie> findByTotalTemporadasLessThanEqualAndEvaluacionGreaterThanEqual(int totalTemporadas, Double evaluacion);

    @Query("SELECT s FROM Serie s " + "JOIN s.episodios e " + "GROUP BY s " + "ORDER BY MAX(e.fechaDeLanzamiento) DESC LIMIT 5")

    List<Serie>lanzamientoRecientes();

    @Query("SELECT s FROM Serie s JOIN s.episodios e " + "WHERE s,id = :id AND e.temporada = :numero")
    List<Episodio> obtenerTemporadasPorNumero(Long id, Long numeroTemporada);
}
