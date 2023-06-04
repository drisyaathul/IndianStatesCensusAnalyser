package com.indiastatecensusanalyser;

import com.indianstatecensusanalyser.CensusAnalyserException;
import com.indianstatecensusanalyser.CensusAnalyser;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class CensusAnalyserTest {
    // UC1-Ability for the analyser to load the Indian States Census Information from a csv file
    private static final String indiaCensus_CSVFilePath = "D:\\RFP Day 29 Assignment\\RFP Day 29 Assignment\\src\\main\\java\\com\\bridgelabz\\IndiaStateCensusData.csv";;
    private static final String wrong_CSVFilepath = "./src/main/resources/IndiaStateCensusData.csv";

    @Test
    public void givenIndianCensusCSVFileReturnsHappyRecords() {
        try {
            CensusAnalyser stateCensusAnalyser = new CensusAnalyser();
            int numberOfRecords = stateCensusAnalyser.loadIndiaCensusData(indiaCensus_CSVFilePath);
            Assert.assertEquals(28,numberOfRecords);
        }catch (CensusAnalyserException e) {
        }
    }
//    @Test
//    public void givenIndiaCensusData_WithWrongFile_ShouldThrowException() {
//
//        CensusAnalyser censusAnalyser = new CensusAnalyser();
//        ExpectedException exceptionRule = ExpectedException.none();
//        exceptionRule.expect(CensusAnalyserException.class);
//        try {
//            censusAnalyser.loadIndiaCensusData(wrong_CSVFilepath);
//        } catch (CensusAnalyserException e) {
//            Assert.assertEquals(CensusAnalyserException.ExceptionType.CENSUS_FILE_PROBLEM,e.type);
//        }
//    }
//    @Test
//    public void givenIndiaCensusData_WithWrongFile_ShouldThrowException() {
//        try {
//            CensusAnalyser censusAnalyser = new CensusAnalyser();
//            ExpectedException exceptionRule = ExpectedException.none();
//            exceptionRule.expect(CensusAnalyserException.class);
//            censusAnalyser.loadIndiaCensusData(wrong_CSVFilepath);
//        }catch (CensusAnalyserException e) {
//            Assert.assertEquals(CensusAnalyserException.ExceptionType.CENSUS_FILE_PROBLEM, e.type);
//        }
//    }
}

