package com.Geocodio;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AddressComponents{

	@JsonProperty("country")
	private String country;

	@JsonProperty("city")
	private String city;

	@JsonProperty("county")
	private String county;

	@JsonProperty("state_province")
	private String stateProvince;

	@JsonProperty("postal_code")
	private String postalCode;

	public void setCountry(String country){
		this.country = country;
	}

	public String getCountry(){
		return country;
	}

	public void setCity(String city){
		this.city = city;
	}

	public String getCity(){
		return city;
	}

	public void setCounty(String county){
		this.county = county;
	}

	public String getCounty(){
		return county;
	}

	public void setStateProvince(String stateProvince){
		this.stateProvince = stateProvince;
	}

	public String getStateProvince(){
		return stateProvince;
	}

	public void setPostalCode(String postalCode){
		this.postalCode = postalCode;
	}

	public String getPostalCode(){
		return postalCode;
	}
}