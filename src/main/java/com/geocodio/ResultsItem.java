package com.geocodio;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ResultsItem{

	@JsonProperty("stable_address_key")
	private Object stableAddressKey;

	@JsonProperty("formatted_address")
	private String formattedAddress;

	@JsonProperty("address_lines")
	private List<String> addressLines;

	@JsonProperty("accuracy")
	private int accuracy;

	@JsonProperty("match_type")
	private Object matchType;

	@JsonProperty("location")
	private Location location;

	@JsonProperty("accuracy_type")
	private String accuracyType;

	@JsonProperty("source")
	private String source;

	@JsonProperty("address_components")
	private AddressComponents addressComponents;

	public void setStableAddressKey(Object stableAddressKey){
		this.stableAddressKey = stableAddressKey;
	}

	public Object getStableAddressKey(){
		return stableAddressKey;
	}

	public void setFormattedAddress(String formattedAddress){
		this.formattedAddress = formattedAddress;
	}

	public String getFormattedAddress(){
		return formattedAddress;
	}

	public void setAddressLines(List<String> addressLines){
		this.addressLines = addressLines;
	}

	public List<String> getAddressLines(){
		return addressLines;
	}

	public void setAccuracy(int accuracy){
		this.accuracy = accuracy;
	}

	public int getAccuracy(){
		return accuracy;
	}

	public void setMatchType(Object matchType){
		this.matchType = matchType;
	}

	public Object getMatchType(){
		return matchType;
	}

	public void setLocation(Location location){
		this.location = location;
	}

	public Location getLocation(){
		return location;
	}

	public void setAccuracyType(String accuracyType){
		this.accuracyType = accuracyType;
	}

	public String getAccuracyType(){
		return accuracyType;
	}

	public void setSource(String source){
		this.source = source;
	}

	public String getSource(){
		return source;
	}

	public void setAddressComponents(AddressComponents addressComponents){
		this.addressComponents = addressComponents;
	}

	public AddressComponents getAddressComponents(){
		return addressComponents;
	}
}