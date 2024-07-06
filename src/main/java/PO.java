import java.util.ArrayList;

public class PO implements Subject {
    private ArrayList observers;
    private String newVersion;
    public PO(){
        observers = new ArrayList<>();
    }
    @Override
    public void notObserver() {

            for (int i = 0; i < observers.size(); i++) {
                Observer observer = (Observer)observers.get(i);
                observer.update(newVersion);
            }


    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);

    }

    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        observers.remove(i);
    }
    public void setNewVersion(String newVersion) {
        this.newVersion = newVersion;
        notObserver();
    }
}
