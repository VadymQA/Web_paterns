package Lab_6;

public class Main {

    public static void main(String[] args)
    {
        iDownloader downloader = new ProxyDownloader();
        downloader.download("Cats");
        downloader.download("Dogs");
        downloader.download("Dogs");
    }

}
