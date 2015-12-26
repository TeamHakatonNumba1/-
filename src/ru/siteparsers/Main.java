package ru.siteparsers;

import java.util.LinkedList;
import java.util.List;

class Main {

    public Main() {}

    public void run() {
        NewsCollector collector = new NewsCollector();
        AbstractSiteParser parser1 = new ElectricSupplySiteParser(collector);
        AbstractSiteParser parser2 = new WaterSupplySiteParser(collector);
        collector.addSiteParser(parser1);
        collector.addSiteParser(parser2);
        collector.refreshNews();
        List<News> news = collector.getNews();
        for (News news_i : news) {
            Main.printNews(news_i);
        }
    }

    public static void printNews(News news) {
        print("Date: %s\n", news.getDate().toString());
        String src_code = news.getSource();
        String src = (
            (src_code == WaterSupplySiteParser.SOURCE_CODE)? "Vodokanal" :
            (src_code == ElectricSupplySiteParser.SOURCE_CODE)? "DonEnergo" :
            "Unknown");
        print("Source: %s\n", src);
        print("Related to user: %i\n", news.isRelatedToUser());
        print("Text: %s\n", news.getText());
        print("\n");
    }

    private static void print(String msg, Object... args) {
        System.out.print(String.format(msg, args));
    }

    public static void main(String[] args) {
        Main app = new Main();
        app.run();
    }
}
