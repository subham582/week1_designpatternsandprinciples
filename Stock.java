import java.util.List;
import java.util.ArrayList;
public interface Stock {
	void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();

}

    