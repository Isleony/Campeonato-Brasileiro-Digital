package br.com.cbf.campeonatobrasileiro.service;


import br.com.cbf.campeonatobrasileiro.entity.Time;
import br.com.cbf.campeonatobrasileiro.repository.TimeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class TimeServico {
    //cadastrar um time

    @Autowired
    private TimeRepository repository;
    public void cadastrarTime(Time time){
        repository.save(time);

    }
    public List<Time> listarTimes(){
        repository.findAll();
        return List.of();
    }
    public Time obterTime(Integer id){
       return  repository.findAllById(Collections.singleton(id)).get(listarTimes().indexOf(id));
    }
}
