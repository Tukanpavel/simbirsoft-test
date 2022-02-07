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
    SitePO sitePo;

    @ManyToOne
    @MapsId("wordId")
    @JoinColumn(name = "word_id")
    WordCountPO wordCountPO;
}

@Data
@Embeddable
class SiteToWordKey implements Serializable {
    @Column(name = "site_id")
    Long siteId;

    @Column(name = "word_id")
    Long wordId;
}
