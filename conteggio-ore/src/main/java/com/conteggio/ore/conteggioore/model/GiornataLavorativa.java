package com.conteggio.ore.conteggioore.model;

import lombok.Data;

import java.time.LocalDate;

@Data
public class GiornataLavorativa {
    private LocalDate data;
    private int oreDiLavoro;
}
