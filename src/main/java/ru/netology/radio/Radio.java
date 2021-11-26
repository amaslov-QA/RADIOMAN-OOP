package ru.netology.radio;

public class Radio {
    private int currentVolume;
    private int currentRadioStation;


    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getRadioStation() {
        return currentRadioStation;
    }

    public int setCurrentRadioStation(int currentRadioStation) {

        if (currentRadioStation > 9) {
            currentRadioStation = 0;
        }

        if (currentRadioStation < 0) {
            currentRadioStation = 0;
        }

        if (currentRadioStation > 0) {
            this.currentRadioStation = currentRadioStation;
        }

        this.currentRadioStation = currentRadioStation;


        return currentRadioStation;
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
        int volume = 0;
        if (currentVolume < 10) {
            volume = currentVolume + 1;
        } else {
            volume = 10;

        }
        return volume;
    }


    public int setMinusVolume() {
        int volume = 0;
        if (currentVolume > 0) {
            volume = currentVolume - 1;
        } else {
            volume = 0;

        }
        return volume;
    }

    public int setStartRadioStationMinus() {
        int stan = 0;
        if (currentRadioStation > 0) {
            stan = currentRadioStation - 1;
        } else {
            stan = 9;
        }
        return stan;
    }

    public int setStartStation() {
        int stan = 0;
        if (currentRadioStation < 9) {
            stan = currentRadioStation + 1;
        } else {
            stan = 0;

        }
        return stan;

    }

}

