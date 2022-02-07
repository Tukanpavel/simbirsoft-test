package com.simbirsoft.test.parsing.persistence.POs;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class SiteToWordPO {
    @EmbeddedId
    SiteToWordKey id;

    @ManyToOne
    @MapsId("siteId")
    @JoinColumn(name = "site_id")
    SitePO site;

    @ManyToOne
    @MapsId("wordId")
    @JoinColumn(name = "word_id")
    WordCountPO wordCount;
}

