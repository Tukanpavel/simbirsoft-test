package com.simbirsoft.test.parsing.persistence.creator;

import com.simbirsoft.test.parsing.base.service.ParsedWord;
import com.simbirsoft.test.parsing.persistence.POs.SitePO;
import com.simbirsoft.test.parsing.persistence.POs.SiteToWordPO;
import com.simbirsoft.test.parsing.persistence.POs.WordPO;
import com.simbirsoft.test.parsing.persistence.repository.WordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Component
public class SiteToWordCreator {
    @Autowired
    EntityManager entityManager;
    @Autowired
    WordRepository wordRepository;

    public void create(List<ParsedWord> parsedWords, String url) {
        SitePO sitePO = new SitePO();
        sitePO.setUrl(url);
        sitePO.setCreatedAt(LocalDateTime.now());

        entityManager.persist(sitePO);

        for (ParsedWord parsedWord : parsedWords) {
            WordPO wordPO;
            Optional<WordPO> wordPOOptional = wordRepository.getWordPOByWord(parsedWord.getWord());
            if (wordPOOptional.isEmpty()) {
                wordPO = new WordPO();
                wordPO.setWord(wordPO.getWord());
                entityManager.persist(wordPO);
            } else {
                wordPO = wordPOOptional.get();
            }

            SiteToWordPO siteToWordPO = new SiteToWordPO();

            siteToWordPO.setSite(sitePO);
            siteToWordPO.setWordCount(wordPO);
            siteToWordPO.setCount(parsedWord.getCount());
        }

    }
}
