package chapter.ten.java;

/**
 * Created by edytawrobel on 06/05/2017.
 */
public class olivePress {

    static void main(String[] args) {
        OlivePress press = new OlivePress( {new Olive(), new Olive(), new Olive() } );
        OliveOil oil = press.getOil(olives);
    }

    private Olive[] _olives;

    public void OlivePress(Olive[] olives) {
        this._olives = olives;
    }

    public OliveOil getOil() {
        if (_olives == null ) {
            return null;
        }
        OliveOil oil = new OliveOil();
        for (Olive olive:olives) {
            int yield = olive.crush();
            oil.add(yield);
        }
        return oil;
    }
}
