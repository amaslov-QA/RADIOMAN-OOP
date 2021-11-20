package ru.netology.radio;

public class Radio {
    private int id = 1;
    private int currentVolume = 10;
    private int radioStation = 0;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int numberStation = 30;
    private int maxStation = numberStation;
    private int minStation = 0;

    public Radio() {

    }

    public Radio(int numberStation) {
        this.numberStation = numberStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getStation() {
        return radioStation;
    }

    public int setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            currentVolume = minVolume;
        }
        if (currentVolume > 100) {
            currentVolume = maxVolume;
        }
        return currentVolume;
    }

    public int setRadioStation(int station) {
        if (station < 0) {
            station = maxStation;
            return station;
        }
        if (station > maxStation) {
            station = minStation;
            return station;
        }
        return station;
    }

    public int setIncreaseVolume(int currentVolume) {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = maxVolume;
        }
        return currentVolume;
    }

    public int setMinusVolume(int currentVolume) {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        } else {
            currentVolume = minVolume;
        }
        return currentVolume;
    }

    public int setRadioStationMinus(int station) {
        if (station > 0) {
            station = station - 1;

        } else {
            station = maxStation;
        }
        return station;
    }

    public int setIncreaseStation(int station) {
        if (station < maxStation) {
            station = station + 1;

        } else {
            station = minStation;
        }
        return station;
    }
}


