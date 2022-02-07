package com.chel.ya.parsing.persistence.POs;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Data
@Embeddable
class SiteToWordKey implements Serializable {
    @Column(name = "site_id")
    Long siteId;

    @Column(name = "word_id")
    Long wordId;
}
