package ru.netology.radio;

public class Radio {
    private int radioVolume;
    private int stationNumber;

    public int getRadioVolume() {
        return radioVolume;
    }

    public void setRadioVolume(int i) {
        this.radioVolume = radioVolume;
    }

    public int getStationNumber(){

        return stationNumber;
    }

    public void setStationNumber(int stationNumber) {

        this.stationNumber = stationNumber;
    }

    public void increaseStation() {
        if (stationNumber < 9) {
            stationNumber = stationNumber + 1;
        }
    }
    public void increaseVolume() {
        if (radioVolume < 10) {
            radioVolume = radioVolume + 1;
        }
    }

}



