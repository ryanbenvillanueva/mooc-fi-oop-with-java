
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Ryan Ben
 */
public class RingingCentre {

    private Map<Bird, List<String>> observationPlaces;

    public RingingCentre() {
        this.observationPlaces = new HashMap<Bird, List<String>>();
    }

    public void observe(Bird bird, String place) {
        if (!observationPlaces.containsKey(bird)) {
            observationPlaces.put(bird, new ArrayList<String>());
        }

        observationPlaces.get(bird).add(place);
    }

    public void observations(Bird bird) {
        System.out.print(bird.toString() + " observations: ");

        if (!observationPlaces.containsKey(bird)) {
            System.out.println("0");
        } else {
            System.out.println(observationPlaces.get(bird).size());

            for (String place : observationPlaces.get(bird)) {
                System.out.println(place);
            }
        }
    }

}
