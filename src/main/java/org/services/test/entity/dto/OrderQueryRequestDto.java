package org.services.test.entity.dto;

import java.io.Serializable;
import java.util.Date;

public class OrderQueryRequestDto implements Serializable {
    private static final long serialVersionUID = -9017244846225173267L;

    private Date travelDateStart;

    private Date travelDateEnd;

    private Date boughtDateStart;

    private Date boughtDateEnd;

    private int state;

    private boolean enableTravelDateQuery;

    private boolean enableBoughtDateQuery;

    private boolean enableStateQuery;

    public Date getTravelDateStart() {
        return travelDateStart;
    }

    public Date getTravelDateEnd() {
        return travelDateEnd;
    }

    public Date getBoughtDateStart() {
        return boughtDateStart;
    }

    public Date getBoughtDateEnd() {
        return boughtDateEnd;
    }

    public int getState() {
        return state;
    }

    public void enableTravelDateQuery(Date startTime, Date endTime) {
        enableTravelDateQuery = true;
        travelDateStart = startTime;
        travelDateEnd = endTime;
    }

    public void disableTravelDateQuery() {
        enableTravelDateQuery = false;
        travelDateStart = null;
        travelDateEnd = null;
    }

    public void enableBoughtDateQuery(Date startTime, Date endTime) {
        enableBoughtDateQuery = true;
        boughtDateStart = startTime;
        boughtDateEnd = endTime;
    }

    public void disableBoughtDateQuery() {
        enableBoughtDateQuery = false;
        boughtDateStart = null;
        boughtDateEnd = null;
    }

    public void enableStateQuery(int targetStatus) {
        enableStateQuery = true;
        state = targetStatus;
    }

    public void disableStateQuery() {
        enableTravelDateQuery = false;
        state = -1;
    }

    public boolean isEnableTravelDateQuery() {
        return enableTravelDateQuery;
    }

    public boolean isEnableBoughtDateQuery() {
        return enableBoughtDateQuery;
    }

    public boolean isEnableStateQuery() {
        return enableStateQuery;
    }
}
