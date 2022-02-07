package com.simbirsoft.test.parsing.persistence.POs;

import lombok.*;

import javax.persistence.*;
import java.util.Set;


@Data
@Entity
@Table(name = "site")
public class SitePO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String url;
    @OneToMany(mappedBy = "site")
    private Set<SiteToWordPO> wordCountPO;

}
