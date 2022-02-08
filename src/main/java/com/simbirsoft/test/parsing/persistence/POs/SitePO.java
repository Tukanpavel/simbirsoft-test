package com.simbirsoft.test.parsing.persistence.POs;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Data
@Entity
@Table(name = "site")
public class SitePO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String url;
    private LocalDateTime createdAt;
    @OneToMany(mappedBy = "site")
    private Set<SiteToWordPO> wordCountPO;
}
