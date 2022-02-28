package com.gylaroid.bashorgCrawler.services;

import com.gylaroid.bashorgCrawler.model.Quotes;
import com.gylaroid.bashorgCrawler.repository.QuotesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuotesServiceImplementation implements QuotesService{

    @Autowired
    QuotesRepository quotesRepository;

    @Override
    public void save(Quotes quotes) {
        quotesRepository.save(quotes);
    }

    @Override
    public boolean isExist(String quoteTitle) {
        List<Quotes> quotes = quotesRepository.findAll();
        for(Quotes quote: quotes){
            if(quote.getText().equals(quoteTitle)){
                return true;
            }
        }
        return false;
    }

    @Override
    public List<Quotes> getAllQuotes() {
        return quotesRepository.findAll();
    }
}
