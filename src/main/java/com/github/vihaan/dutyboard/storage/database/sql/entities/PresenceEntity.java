package com.github.vihaan.dutyboard.storage.database.sql.entities;

import javax.persistence.*;

@Entity
@Table(name = "presence")
public class PresenceEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_presence")
    private Long id;
}
