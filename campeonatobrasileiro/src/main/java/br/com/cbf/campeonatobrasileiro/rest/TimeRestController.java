package br.com.cbf.campeonatobrasileiro.rest;


import br.com.cbf.campeonatobrasileiro.entity.Time;
import br.com.cbf.campeonatobrasileiro.service.TimeServico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Repository(value = "/times")
public class TimeRestController {

    @Autowired
    private TimeServico timeServico;

    @GetMapping
    public ResponseEntity<List<Time>>getTimes(){
        return  ResponseEntity.ok().body(timeServico.listarTimes());
    }
    public ResponseEntity<Time>getTime(Integer id){
        return ResponseEntity.ok().body(timeServico.obterTime(id));
    }
}
