package com.aluraoracle.screenmatch.controller;


import com.aluraoracle.screenmatch.dto.EpisodioDTO;
import com.aluraoracle.screenmatch.dto.SerieDTO;
import com.aluraoracle.screenmatch.service.SerieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/series")
public class SerieController {

    @Autowired
    private SerieService servicio;


    @GetMapping("/series")
    public List<SerieDTO> obtenerSeries() {
        return servicio.obtenerSeries();
    }

    @GetMapping("/top5")
    public List<SerieDTO> obtenerTop5(){
        return servicio.obtenerTop5();
    }

    @GetMapping("/lanzamientos")
    public  List<SerieDTO> obtenerLanzamientosRecientes(){
        return servicio.lanzamientosRecientes();
    }

    @GetMapping("/{id}")
    public SerieDTO obtenerPorId(@PathVariable Long id){
        return servicio.obtenerPorId(id);
    }

    @GetMapping("/{id}/temporadas/todas")
        public List<EpisodioDTO> ObtenerTemporadas(@PathVariable Long id){
            return servicio.obtenerTemporadas(id);
    }

    @GetMapping("/{id}/temporadas/{numeroTemporada}")

    public List<EpisodioDTO> obtenerTeporadasPorNumero(@PathVariable Long id,
                                                       @PathVariable Long numeroTemporada){
        return servicio.obtenerTmporadasPorNumero(id,numeroTemporada);
    }

}