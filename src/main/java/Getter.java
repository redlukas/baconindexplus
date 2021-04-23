import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.DataInput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;

public class Getter {
    private final String API_KEY = "6d7e675bfdb581e041545b3c6953eede";

    public Person getPerson(String name){
        name=name.replace(" ", "%20");
        Person person = null;
        try {
            URL url = new URL("https://api.themoviedb.org/3/search/person?query="+name+"&api_key="+API_KEY);
            person =  new ObjectMapper().readValue(url, Person.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
    return person;
    }
}
