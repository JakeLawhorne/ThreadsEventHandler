import java.util.Map;

public interface Tracker {

    void push(String message);

    boolean has(String message);

    void handle(String message, EventHandler e);
    public Map<String, Integer> tracker();
}
