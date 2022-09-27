package boffin;
import static spark.Spark.get;
public class Server {
    public static void main(String[] args) {
        get("/", (req, res) -> "Hello World!");
    }
}
