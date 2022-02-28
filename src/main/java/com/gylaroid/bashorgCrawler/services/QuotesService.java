package com.gylaroid.bashorgCrawler.services;

import com.gylaroid.bashorgCrawler.model.Quotes;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface QuotesService {
    void save(Quotes quotes);
    boolean isExist(String quoteTitle);
    List<Quotes> getAllQuotes();
}
