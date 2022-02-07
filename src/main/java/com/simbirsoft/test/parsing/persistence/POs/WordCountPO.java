package com.simbirsoft.test.parsing.persistence.POs;

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
    @OneToMany(mappedBy = "wordCount")
    private Set<SiteToWordPO> sitePOs;
}
