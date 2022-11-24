package Lab_6;

public class SimpleDowloader implements iDownloader {

    @Override
    public void download(String videoTitle) {
        //some download code
        System.out.println(videoTitle + " Downloading....");
    }

}
