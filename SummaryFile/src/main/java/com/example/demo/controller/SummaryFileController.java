package com.example.demo.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.SummaryData;
import com.example.demo.service.SummaryDataService;

@RestController
public class SummaryFileController {
	
	
	
	  SummaryDataService summaryDataService;
	
	@Autowired
	public SummaryFileController(SummaryDataService summaryDataService) {
		this.summaryDataService = summaryDataService;
	}


	@GetMapping(path="/getStreamSummaryData")
	public  List<SummaryData> getStreamSummaryData() throws IOException {
		return summaryDataService.getSummaryDataFromFile();
	
	}
	@GetMapping(path="/getStreamSummaryData/{id}")
	public  List<SummaryData> getStreamSummaryData(@PathVariable String id) throws IOException {
		return summaryDataService.getStreamSummaryData(id);
	
	}
	
	@GetMapping(path="//getSummaryDataSortedByCreatedTS")
	public  List<SummaryData> getSummaryDataSortedByCreatedTS() throws IOException {
		return summaryDataService.getSummaryDataSortedByCreatedTS();
	
	}
	
}
