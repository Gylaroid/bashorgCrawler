package com.gylaroid.bashorgCrawler.api;

import com.gylaroid.bashorgCrawler.model.Quotes;
import com.gylaroid.bashorgCrawler.services.QuotesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class QuotesController {
    @Autowired
    QuotesService quotesService;

    @GetMapping(value = "/quotes")
    public List<Quotes> getAllQuotes(){
        return quotesService.getAllQuotes();
    }

}
