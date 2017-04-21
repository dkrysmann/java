package models;

import enums.EmergencyLevel;
import utils.RegistrationTimeImpl;

public abstract class BaseEmergency {
    private String description;

    private EmergencyLevel emergencyLevel;

    private RegistrationTimeImpl registrationTime;

    protected BaseEmergency(String description, EmergencyLevel emergencyLevel, RegistrationTimeImpl registrationTime) {
        this.setDescription(description);
        this.setEmergencyLevel(emergencyLevel);
        this.setRegistrationTime(registrationTime);
    }


    public String getDescription() {
        return description;
    }

    private void setDescription(String description) {
        this.description = description;
    }

    public EmergencyLevel getEmergencyLevel() {
        return emergencyLevel;
    }

    private void setEmergencyLevel(EmergencyLevel emergencyLevel) {
        this.emergencyLevel = emergencyLevel;
    }

    public RegistrationTimeImpl getRegistrationTime() {
        return registrationTime;
    }

    private void setRegistrationTime(RegistrationTimeImpl registrationTime) {
        this.registrationTime = registrationTime;
    }
}
