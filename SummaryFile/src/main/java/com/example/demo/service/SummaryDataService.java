package com.example.demo.service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import com.example.demo.model.SummaryData;



@Service
public class SummaryDataService {
	
	
	
	public List<SummaryData> getSummaryDataFromFile() throws IOException{
		

		return fetchAllDataFromFile();
		
		
		
	}

	/**
	 * @return
	 * @throws IOException
	 * @throws FileNotFoundException
	 */
	private List<SummaryData> fetchAllDataFromFile() throws IOException, FileNotFoundException {
		Resource resource = new ClassPathResource("inputFile.txt");
		File file = resource.getFile();
		List<SummaryData> outputList = new ArrayList<SummaryData>();

		BufferedReader br = new BufferedReader(new FileReader(file));
		try {
		    String line;
		    String header = br.readLine();
		    while ((line = br.readLine()) != null) {
		    	SummaryData newData = convertIntoObject(line);
		    	outputList.add(newData);
		    }
		} finally {
		    br.close();
		}
		for (SummaryData summaryData : outputList) {
			System.out.println(summaryData);
		}
		return outputList;
	}
	
	public List<SummaryData> getStreamSummaryData(String id) throws IOException {

		Resource resource = new ClassPathResource("inputFile.txt");
		File file = resource.getFile();
		List<SummaryData> outputList = new ArrayList<SummaryData>();

		BufferedReader br = new BufferedReader(new FileReader(file));
		try {
		    String line;
		    String header = br.readLine();
		    while ((line = br.readLine()) != null ) {
		    	String[] strArr = line.split(",");
		    	if(strArr[10].equals(id)) {
		    		outputList.add(convertIntoObject(line));
		    	}
		    }
		    
	} finally {
	    br.close();
	}
		return outputList;
	}

	public List<SummaryData> getSummaryDataSortedByCreatedTS() throws IOException {
		List<SummaryData> fetchDataFromFile = fetchAllDataFromFile();
		Sortbydate sortByDate = new Sortbydate();
		
		Collections.sort(fetchDataFromFile, sortByDate);

		return fetchDataFromFile;
	}
	class Sortbydate implements Comparator<SummaryData> 
	{ 
	    // Used for sorting in ascending order of 
	    // roll number 
	    public int compare(SummaryData a, SummaryData b) 
	    { 
	        return a.getCreatedTimestamp().compareTo(b.getCreatedTimestamp()); 
	    } 
	} 

	public Date convertStringToDate(String input) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		Date date = null;
		try {
			 date = sdf.parse(input);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			System.out.println("Date parse error");
		}
//		System.out.println(date);
		return date;
	}
	
	
	private SummaryData convertIntoObject(String line) {
		String[] values = line.split(",");
		
//		int size = values.length;
		SummaryData returnObj = new  SummaryData();
		returnObj.setId(Long.valueOf(values[0]));
		returnObj.setStreamID(Integer.valueOf(values[1]));
		returnObj.setSequenceID(Integer.valueOf(values[2]));
		returnObj.setNumClaimIn(Integer.valueOf(values[3]));
		returnObj.setSource(values[4]);
		returnObj.setStartDate(convertStringToDate(values[4]));
		returnObj.setEndDate(convertStringToDate(values[5]));
		returnObj.setMaxClaims(Integer.valueOf(values[7]));
		returnObj.setCreatedTimestamp(convertStringToDate(values[8]));
		returnObj.setApplySink(Boolean.valueOf(values[9]));
		returnObj.setRebateID(Integer.valueOf(values[10]));
		returnObj.setRunFrequencyType(values[11]);
		returnObj.setModifiedBy(values[12]);
		returnObj.setOutputModifiedTs(convertStringToDate(values[13]));
		returnObj.setNumberOutputClaims(Integer.valueOf(values[14]));
		returnObj.setSinkModifiedTs(convertStringToDate(values[15]));
		returnObj.setNumberSinkClaims(Integer.valueOf(values[16]));
		returnObj.setCreatedBy(values[17]);
		returnObj.setClaimStatus(values[18]);
		
		return returnObj;
	}



}
