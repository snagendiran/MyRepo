package com.example.demo.model;

import java.sql.Timestamp;
import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class SummaryData {

	Long id;  
	Integer streamID;  
	Integer sequenceID;  
	Integer numClaimIn;  
	String source;  
	Date startDate;  
	Date endDate;  
	Integer maxClaims;  
	Date createdTimestamp;  
	Boolean applySink;  
	@Override
	public String toString() {
		return "SummaryData [id=" + id + ", streamID=" + streamID + ", sequenceID=" + sequenceID + ", numClaimIn="
				+ numClaimIn + ", source=" + source + ", startDate=" + startDate + ", endDate=" + endDate
				+ ", maxClaims=" + maxClaims + ", createdTimestamp=" + createdTimestamp + ", applySink=" + applySink
				+ ", rebateID=" + rebateID + ", runFrequencyType=" + runFrequencyType + ", modifiedBy=" + modifiedBy
				+ ", outputModifiedTs=" + outputModifiedTs + ", numberOutputClaims=" + numberOutputClaims
				+ ", sinkModifiedTs=" + sinkModifiedTs + ", numberSinkClaims=" + numberSinkClaims + ", createdBy="
				+ createdBy + ", claimStatus=" + claimStatus + ", getId()=" + getId() + ", getStreamID()="
				+ getStreamID() + ", getSequenceID()=" + getSequenceID() + ", getNumClaimIn()=" + getNumClaimIn()
				+ ", getSource()=" + getSource() + ", getStartDate()=" + getStartDate() + ", getEndDate()="
				+ getEndDate() + ", getMaxClaims()=" + getMaxClaims() + ", getCreatedTimestamp()="
				+ getCreatedTimestamp() + ", getApplySink()=" + getApplySink() + ", getRebateID()=" + getRebateID()
				+ ", getRunFrequencyType()=" + getRunFrequencyType() + ", getModifiedBy()=" + getModifiedBy()
				+ ", getOutputModifiedTs()=" + getOutputModifiedTs() + ", getNumberOutputClaims()="
				+ getNumberOutputClaims() + ", getSinkModifiedTs()=" + getSinkModifiedTs() + ", getNumberSinkClaims()="
				+ getNumberSinkClaims() + ", getCreatedBy()=" + getCreatedBy() + ", getClaimStatus()="
				+ getClaimStatus() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	Integer rebateID;  
	String runFrequencyType;  
	String modifiedBy;  
	Date outputModifiedTs;  
	Integer numberOutputClaims;  
	Date sinkModifiedTs;  
	Integer numberSinkClaims;  
	String createdBy;  
	String claimStatus;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Integer getStreamID() {
		return streamID;
	}
	public void setStreamID(Integer streamID) {
		this.streamID = streamID;
	}
	public Integer getSequenceID() {
		return sequenceID;
	}
	public void setSequenceID(Integer sequenceID) {
		this.sequenceID = sequenceID;
	}
	public Integer getNumClaimIn() {
		return numClaimIn;
	}
	public void setNumClaimIn(Integer numClaimIn) {
		this.numClaimIn = numClaimIn;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public Integer getMaxClaims() {
		return maxClaims;
	}
	public void setMaxClaims(Integer maxClaims) {
		this.maxClaims = maxClaims;
	}
	public Date getCreatedTimestamp() {
		return createdTimestamp;
	}
	public void setCreatedTimestamp(Date date) {
		this.createdTimestamp = date;
	}
	public Boolean getApplySink() {
		return applySink;
	}
	public void setApplySink(Boolean applySink) {
		this.applySink = applySink;
	}
	public Integer getRebateID() {
		return rebateID;
	}
	public void setRebateID(Integer rebateID) {
		this.rebateID = rebateID;
	}
	public String getRunFrequencyType() {
		return runFrequencyType;
	}
	public void setRunFrequencyType(String runFrequencyType) {
		this.runFrequencyType = runFrequencyType;
	}
	public String getModifiedBy() {
		return modifiedBy;
	}
	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}
	public Date getOutputModifiedTs() {
		return outputModifiedTs;
	}
	public void setOutputModifiedTs(Date date) {
		this.outputModifiedTs = date;
	}
	public Integer getNumberOutputClaims() {
		return numberOutputClaims;
	}
	public void setNumberOutputClaims(Integer numberOutputClaims) {
		this.numberOutputClaims = numberOutputClaims;
	}
	public Date getSinkModifiedTs() {
		return sinkModifiedTs;
	}
	public void setSinkModifiedTs(Date sinkModifiedTs) {
		this.sinkModifiedTs = sinkModifiedTs;
	}
	public Integer getNumberSinkClaims() {
		return numberSinkClaims;
	}
	public void setNumberSinkClaims(Integer numberSinkClaims) {
		this.numberSinkClaims = numberSinkClaims;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getClaimStatus() {
		return claimStatus;
	}
	public void setClaimStatus(String claimStatus) {
		this.claimStatus = claimStatus;
	}
	
}
