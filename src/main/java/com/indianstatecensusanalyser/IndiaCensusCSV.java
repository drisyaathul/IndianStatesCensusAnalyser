package com.indianstatecensusanalyser;

import com.opencsv.bean.CsvBindByName;

public class IndiaCensusCSV {
    // UC1-Ability for the analyser to load the Indian States Census Information from a csv file
    @CsvBindByName(column = "state",required = true)
    public String state;

    @CsvBindByName(column = "Population",required = true)
    public String population;

    @CsvBindByName(column = "AreaInSqKm",required = true)
    public String areaInSqKm;

    @CsvBindByName(column = "DensityPerSqKm",required = true)
    public String densityPerSqKm;

    @Override
    public String toString() {
        return "IndiaCensusCSV{" +
                "state='" + state + '\'' +
                ", population='" + population + '\'' +
                ", areaInSqKm='" + areaInSqKm + '\'' +
                ", densityPerSqKm='" + densityPerSqKm + '\'' +
                '}';
    }
}
