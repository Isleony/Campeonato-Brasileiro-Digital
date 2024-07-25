package br.com.cbf.campeonatobrasileiro.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.util.UUID;


@Entity
@Data
public class Jogo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn( name = "time_1_id")
    private Time time1;

    @ManyToOne
    @JoinColumn( name = "time_2_id" )
    private Time time2;



    private Integer golsTime1;
    private Integer golsTime2;

    private Integer publicoPagante;

    private UUID uuid;
}
