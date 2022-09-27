package boffin;
import static spark.Spark.get;
public class Server {
    public static void main(String[] args) {
        //get("/", (req, res) -> "<h1 style='color:purple;font-family:\"Marker Felt";cursor:crosshair'>Hello World!</h1>");
        get("/", (req, res) -> "<h1>Hello World!</h1>");

       // get("/hello", (req, res) -> {
       //     return "<html><body><h1>Hello World!</h1></body></html>";
       // });
        //http://localhost:4567/hello?name=Jason
        //it handles the hello as we told the handler what to do. Right now it is ignoring ?name=Jason as it doesn't know what to do with it

        get("/hello", (req, res) -> {
            String name = req.queryParams("name");
            return "<h1>Hello " + name + "!</h1>";
        });
        //http://localhost:4567/hello?name=Tiff it spits back out Hello Tiff!
    }
}
