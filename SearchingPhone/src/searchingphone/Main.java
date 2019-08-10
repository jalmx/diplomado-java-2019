package searchingphone;

import java.util.ArrayList;
import java.util.List;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Main {

    public static void main(String[] args) throws Exception {

        Document doc = Jsoup.connect("https://listado.mercadolibre.com.mx/iphone-xr#D[A:iphone%20xr]").get();
        Elements posts = doc.select(".rowItem");

        List<Post> listPost = new ArrayList<>();

        for (Element post : posts) {
            listPost.add(new Post(
                    post.select(".main-title").text(),
                    Integer.parseInt(post.select(".price__fraction").text().replace(",", "")),
                    post.select(".item__title").select("a").attr("href")
            ));
        }

        int position = 0;
        int oldPrice = listPost.get(0).getPrice();
        
        for (int x = 1; x < listPost.size(); x++) {
            if(oldPrice > listPost.get(x).getPrice()){
                oldPrice = listPost.get(x).getPrice();
                position = x;
            }
        }

        System.out.println(listPost.get(position));
    }

}
