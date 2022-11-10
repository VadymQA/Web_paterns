package Lab_5;


public class Main {
    public static void main(String[] args) {
        Product prod = new Product("Product", "Desription bla bla", "photo1.jpg", 4);
        pages(new ProductPage(prod));
        pages(new SimplePage("header", "content"));
    }

    public static void pages(BasePage page) {

        HTMLRender first_render = new HTMLRender(page);
        first_render.renderPage();

        JsonRender second_render = new JsonRender(page);
        second_render.renderPage();

        XMLRender third_render = new XMLRender(page);
        third_render.renderPage();

    }
}