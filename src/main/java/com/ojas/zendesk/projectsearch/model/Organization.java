package com.ojas.zendesk.projectsearch.model;

import java.util.Arrays;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;


@Document(indexName="ojaszendeskorganization",type="organization",shards=2)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Organization {
	
	@Id
	private String id;
	private String url;
	private String externalid;
	private String name;
	private String[] domainnames;
	private String createdat;
	private String details;
	private boolean sharedtickets;
	private String[] tags;
	
	public Organization(){
		
	}

	public Organization(String id, String url, String externalid, String name,
			String[] domainnames, String createdat, String details,
			boolean sharedtickets, String[] tags) {
		super();
		this.id = id;
		this.url = url;
		this.externalid = externalid;
		this.name = name;
		this.domainnames = domainnames;
		this.createdat = createdat;
		this.details = details;
		this.sharedtickets = sharedtickets;
		this.tags = tags;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getExternalid() {
		return externalid;
	}

	public void setExternalid(String externalid) {
		this.externalid = externalid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String[] getDomainnames() {
		return domainnames;
	}

	public void setDomainnames(String[] domainnames) {
		this.domainnames = domainnames;
	}

	public String getCreatedat() {
		return createdat;
	}

	public void setCreatedat(String createdat) {
		this.createdat = createdat;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public boolean isSharedtickets() {
		return sharedtickets;
	}

	public void setSharedtickets(boolean sharedtickets) {
		this.sharedtickets = sharedtickets;
	}

	public String[] getTags() {
		return tags;
	}

	public void setTags(String[] tags) {
		this.tags = tags;
	}

	@Override
	public String toString() {
		return "Organization [id=" + id + ", url=" + url + ", externalid="
				+ externalid + ", name=" + name + ", domainnames="
				+ Arrays.toString(domainnames) + ", createdat=" + createdat
				+ ", details=" + details + ", sharedtickets=" + sharedtickets
				+ ", tags=" + Arrays.toString(tags) + "]";
	}
	
	
	
}
