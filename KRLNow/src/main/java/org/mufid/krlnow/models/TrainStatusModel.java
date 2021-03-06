package org.mufid.krlnow.models;

import java.util.Date;

/**
 * Created by mufid on 7/18/13.
 */
public class TrainStatusModel {
    int trainNumber;
    String routeName;

    public Date getArrivalAtLastDestination() {
        return arrivalAtLastDestination;
    }

    public int getTrainNumber() {
        return trainNumber;
    }

    public String getRouteName() {
        return routeName;
    }

    public TrainStatus getTrainStatus() {
        return trainStatus;
    }

    public String getStationName() {
        return stationName;
    }

    TrainStatus trainStatus;
    String stationName;
    Date arrivalAtLastDestination;

    String statusString;

    public String getStatusString() {
        return statusString;
    }

    public TrainStatusModel(int trainNumber, String routeName, Date arrivalAtLastDestination, String statusString) {
        this.trainNumber = trainNumber;
        this.routeName = routeName;
//        this.trainStatus = trainStatus;
//        this.stationName = stationName;
        this.arrivalAtLastDestination = arrivalAtLastDestination;
        this.statusString = statusString;
    }


}
