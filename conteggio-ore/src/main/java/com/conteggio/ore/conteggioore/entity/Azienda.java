package com.conteggio.ore.conteggioore.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Azienda {
    @Id
    private int id;
    private String nome;
    private String partitaIva;
}
