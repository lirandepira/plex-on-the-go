package org.lolobored.plex.elasticsearch.query;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.lolobored.plex.elasticsearch.filters.Filter;
import org.lolobored.plex.model.Media;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Should {

	@JsonProperty("term")
	private Filter filter;

	private Bool bool;

	public Filter getFilter() {
		return filter;
	}

	public void setFilter(Filter filter) {
		this.filter = filter;
	}

	public Bool getBool() {
		return bool;
	}

	public void setBool(Bool bool) {
		this.bool = bool;
	}
}
