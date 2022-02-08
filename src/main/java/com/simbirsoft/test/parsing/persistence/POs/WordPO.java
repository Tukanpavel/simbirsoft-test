package com.simbirsoft.test.parsing.persistence.POs;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@Table(name = "word_count")
public class WordPO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String word;
    @OneToMany(mappedBy = "wordCount")
    private Set<SiteToWordPO> siteToWordPOs;
}
