package com.ojas.zendesk.projectsearch.model;

import java.util.Arrays;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName="ojaszendeskticket",type="ticket",shards=2)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ticket {
	
	@Id
	private String id;
	private String url;
	private String externalid;
	private String createdat;
	private String type;
	private String subject;
	private String description;
	private String priority;
	private String status;
	private String submitterid;
	private String assigneeid;
	private String organizationid;
	private String[] tags;
	private Boolean hasincidents;
	private String dueat;
	private String via;
	
	public Ticket() {
		
	}
	
	public Ticket(String id, String url, String externalid, String createdat,
			String type, String subject, String description, String priority,
			String status, String submitterid, String assigneeid,
			String organizationid, String[] tags, Boolean hasincidents,
			String dueat, String via) {
		super();
		this.id = id;
		this.url = url;
		this.externalid = externalid;
		this.createdat = createdat;
		this.type = type;
		this.subject = subject;
		this.description = description;
		this.priority = priority;
		this.status = status;
		this.submitterid = submitterid;
		this.assigneeid = assigneeid;
		this.organizationid = organizationid;
		this.tags = tags;
		this.hasincidents = hasincidents;
		this.dueat = dueat;
		this.via = via;
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

	public String getCreatedat() {
		return createdat;
	}

	public void setCreatedat(String createdat) {
		this.createdat = createdat;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getSubmitterid() {
		return submitterid;
	}

	public void setSubmitterid(String submitterid) {
		this.submitterid = submitterid;
	}

	public String getAssigneeid() {
		return assigneeid;
	}

	public void setAssigneeid(String assigneeid) {
		this.assigneeid = assigneeid;
	}

	public String getOrganizationid() {
		return organizationid;
	}

	public void setOrganizationid(String organizationid) {
		this.organizationid = organizationid;
	}

	public String[] getTags() {
		return tags;
	}

	public void setTags(String[] tags) {
		this.tags = tags;
	}

	public Boolean isHasincidents() {
		return hasincidents;
	}

	public void setHasincidents(Boolean hasincidents) {
		this.hasincidents = hasincidents;
	}

	public String getDueat() {
		return dueat;
	}

	public void setDueat(String dueat) {
		this.dueat = dueat;
	}

	public String getVia() {
		return via;
	}

	public void setVia(String via) {
		this.via = via;
	}

	@Override
	public String toString() {
		return "Ticket [id=" + id + ", url=" + url + ", externalid="
				+ externalid + ", createdat=" + createdat + ", type=" + type
				+ ", subject=" + subject + ", description=" + description
				+ ", priority=" + priority + ", status=" + status
				+ ", submitterid=" + submitterid + ", assigneeid=" + assigneeid
				+ ", organizationid=" + organizationid + ", tags="
				+ Arrays.toString(tags) + ", hasincidents=" + hasincidents
				+ ", dueat=" + dueat + ", via=" + via + "]";
	}
}
