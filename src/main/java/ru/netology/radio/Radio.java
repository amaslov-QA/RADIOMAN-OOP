package ru.netology.radio;

public class Radio {
    private int currentVolume;
    private int currentRadioStation;

    public int setCurrentRadioStation(int newCurrentRadioStation) {

        if (newCurrentRadioStation > 9) {
            newCurrentRadioStation = 0;
        }

        if (newCurrentRadioStation < 0) {
            newCurrentRadioStation = 9;
        }
        currentRadioStation = newCurrentRadioStation;
        return currentRadioStation;
    }

    public int getRadioStation() {

        return currentRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }


    public int setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            newCurrentVolume = 0;
        }
        if (newCurrentVolume > 10) {
            newCurrentVolume = 10;
        }
        currentVolume = newCurrentVolume;
        return currentVolume;
    }

    public int setStartVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = 10;

        }
        return currentVolume;
    }


    public int setMinusVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        } else {
            currentVolume = 0;

        }
        return currentVolume;
    }

    public int setStartRadioStationMinus() {
        if (currentRadioStation > 0) {
            currentRadioStation = currentRadioStation - 1;
        }
        if (currentRadioStation <= 0) {
            currentRadioStation = 9;
        }
        return currentRadioStation;
    }

    public int setStartStation() {
        if (currentRadioStation < 9) {
            currentRadioStation = currentRadioStation + 1;
        } else {
            currentRadioStation = 0;
        }
        return currentRadioStation;

    }

}
