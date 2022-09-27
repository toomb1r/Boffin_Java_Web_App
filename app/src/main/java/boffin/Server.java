package boffin;
import static spark.Spark.get;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.mustache.MustacheTemplateEngine;
public class Server {
    public static void main(String[] args) {
        //get("/", (req, res) -> "<h1 style='color:purple;font-family:\"Marker Felt";cursor:crosshair'>Hello World!</h1>");
        get("/", (req, res) -> "<h1>Hello World!</h1>");

       // get("/hello", (req, res) -> {
       //     return "<html><body><h1>Hello World!</h1></body></html>";
       // });
       //http://localhost:4567/hello?name=Jason
        //it handles /hello in the URL. the handler knows what to do now. RN. it is ignoring ?name=Jason as it doesn't know what to do with it

        get("/hello", (req, res) -> {
            String name = req.queryParams("name");
           // */ return "<h1>Hello " + name + "!</h1>";
           //http://localhost:4567/hello?name=Tiff it spits back out Hello Tiff!
           if (name != null) {
            return "<h1>Hello " + name + "!</h1>";
           }
           return "<form method='get'> <label>Name: <input name='name'><button>Submit</button></form>";

        });

        get("/heyo", (req, res) -> {
            HashMap<String, Object> model = new HashMap<>();
            return new MustacheTemplateEngine().render(
                new ModelAndView(model, "index.mustache"));
        });

        get("/heyo", (req, res) -> {
            HashMap<String, Object> model = new HashMap<>();
            return new MustacheTemplateEngine().render(
                new ModelAndView(model, "index.mustache"));
        });

        
    }
}
