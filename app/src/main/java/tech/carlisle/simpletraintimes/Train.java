package tech.carlisle.simpletraintimes;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;

/**
 * Created by Ross on 27/01/2018.
 */

public class Train {

    private String departure, platformDeparture, arrival;

    public Train() {

    }

    public Train(String departure, String platformDeparture, String arrival) {

        this.departure = departure;
        this.platformDeparture = platformDeparture;
        this.arrival = arrival;

    }

    public String getDeparture() {
        return departure;
    }

    public String getPlatformDeparture() {
        return platformDeparture;
    }

    public String getArrival() {
        return arrival;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public void setPlatformDeparture(String platformDeparture) {
        this.platformDeparture = platformDeparture;
    }

    public void setArrival(String arrival) {
        this.arrival = arrival;
    }

    public static Comparator<Train> trainComparator = new Comparator<Train>() {

        public int compare(Train trainOne, Train trainTwo) {

            DateFormat dateFormat = new SimpleDateFormat("hh:mm");
            try {
                Date trainOneDate = dateFormat.parse(trainOne.getArrival());
                Date trainTwoDate = dateFormat.parse(trainTwo.getArrival());

                return trainOneDate.compareTo(trainTwoDate);

            } catch (ParseException e) {
                e.printStackTrace();
            }

            return 0;
        }};

}
