package com.chel.ya.parsing.persistence.POs;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;
@Data
@Entity
@Table(name = "word_count")
public class WordCountPO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String word;
    private Integer count;
    @OneToMany(mappedBy = "word_count")
    private Set<SiteToWordPO> sitePOs;
}
