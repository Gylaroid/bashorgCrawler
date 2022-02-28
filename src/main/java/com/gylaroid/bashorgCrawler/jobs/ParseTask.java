package com.gylaroid.bashorgCrawler.jobs;

import com.gylaroid.bashorgCrawler.model.Quotes;
import com.gylaroid.bashorgCrawler.services.QuotesService;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class ParseTask {

    @Autowired
    QuotesService quotesService;

    @Scheduled(fixedDelay = 10000)
    public void parseQuotes(){
        String url = "http://www.bashorg.org/";

        try {
            Document document = Jsoup.connect(url)
                    .userAgent("Mozilla")
                    .timeout(1000)
                    .referrer("https://google.com")
                    .get();
            Elements quotes = document.getElementsByClass("quote");
            for (Element quote: quotes){
                String text = quote.ownText();

                if (!quotesService.isExist(text)) {
                    Quotes quotesObject = new Quotes();
                    quotesObject.setText(text);
                    quotesService.save(quotesObject);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
