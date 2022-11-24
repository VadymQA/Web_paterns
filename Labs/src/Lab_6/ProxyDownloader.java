package Lab_6;

import java.util.ArrayList;
import java.util.List;

public class ProxyDownloader implements iDownloader {
    private iDownloader downloader = new SimpleDowloader();
    private static List<String> hashlist;

    static {
        hashlist = new ArrayList<String>();
        hashlist.add("Cats");
    }

    @Override
    public void download(String videoTitle) {
        if (hashlist.contains(videoTitle)) {
            System.out.println("Get cashed video: " + videoTitle);
        } else {
            downloader.download(videoTitle);
            hashlist.add(videoTitle);
        }
    }

}







