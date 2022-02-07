package com.chel.ya.parsing.persistence.POs;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

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

