package com.Geocodio;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class GeocodioResponse {

	@JsonProperty("results")
	private List<ResultsItem> results;

	public void setResults(List<ResultsItem> results){
		this.results = results;
	}

	public List<ResultsItem> getResults(){
		return results;
	}
}