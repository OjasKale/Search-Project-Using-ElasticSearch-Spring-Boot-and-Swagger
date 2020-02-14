package com.ojas.zendesk.projectsearch.model;

import java.util.Arrays;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName="ojaszendeskuser",type="user",shards=2)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
	@Id
	private String id;
	private String url;
	private String externalid;
	private String name;
	private String alias;
	private String createdat;
	private Boolean active;
	private Boolean verified;
	private Boolean shared;
	private String locale;
	private String timezone;
	private String lastloginat;
	private String email;
	private String phone;
	private String signature;
	private String organizationid;
	private String[] tags;
	private Boolean suspended;
	private String role;
	
	public User(){
		
	}

	public User(String id, String url, String externalid, String name,
			String alias, String createdat, Boolean active, Boolean verified,
			Boolean shared, String locale, String timezone, String lastloginat,
			String email, String phone, String signature, String organizationid,
			String[] tags, Boolean suspended, String role) {
		super();
		this.id = id;
		this.url = url;
		this.externalid = externalid;
		this.name = name;
		this.alias = alias;
		this.createdat = createdat;
		this.active = active;
		this.verified = verified;
		this.shared = shared;
		this.locale = locale;
		this.timezone = timezone;
		this.lastloginat = lastloginat;
		this.email = email;
		this.phone = phone;
		this.signature = signature;
		this.organizationid = organizationid;
		this.tags = tags;
		this.suspended = suspended;
		this.role = role;
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

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public String getCreatedat() {
		return createdat;
	}

	public void setCreatedat(String createdat) {
		this.createdat = createdat;
	}

	public Boolean isActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public Boolean isVerified() {
		return verified;
	}

	public void setVerified(Boolean verified) {
		this.verified = verified;
	}

	public Boolean isShared() {
		return shared;
	}

	public void setShared(Boolean shared) {
		this.shared = shared;
	}

	public String getLocale() {
		return locale;
	}

	public void setLocale(String locale) {
		this.locale = locale;
	}

	public String getTimezone() {
		return timezone;
	}

	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}

	public String getLastloginat() {
		return lastloginat;
	}

	public void setLastloginat(String lastloginat) {
		this.lastloginat = lastloginat;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getSignature() {
		return signature;
	}

	public void setSignature(String signature) {
		this.signature = signature;
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

	public Boolean isSuspended() {
		return suspended;
	}

	public void setSuspended(Boolean suspended) {
		this.suspended = suspended;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", url=" + url + ", externalid=" + externalid
				+ ", name=" + name + ", alias=" + alias + ", createdat="
				+ createdat + ", active=" + active + ", verified=" + verified
				+ ", shared=" + shared + ", locale=" + locale + ", timezone="
				+ timezone + ", lastloginat=" + lastloginat + ", email="
				+ email + ", phone=" + phone + ", signature=" + signature
				+ ", organizationid=" + organizationid + ", tags="
				+ Arrays.toString(tags) + ", suspended=" + suspended
				+ ", role=" + role + "]";
	}
	
	
	
}
