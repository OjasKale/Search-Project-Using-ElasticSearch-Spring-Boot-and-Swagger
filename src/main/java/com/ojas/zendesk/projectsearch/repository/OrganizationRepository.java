package com.ojas.zendesk.projectsearch.repository;

import java.util.List;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import com.ojas.zendesk.projectsearch.model.Organization;

@Repository
public interface OrganizationRepository extends ElasticsearchRepository<Organization, String>{

	//List<Organization> findById(String id);
	
	List<Organization> findByUrl(String url);

	List<Organization> findByExternalid(String externalid);

	List<Organization> findByName(String name);

	List<Organization> findByDomainnames(String domainnames);

	List<Organization> findByCreatedat(String createdat);

	List<Organization> findByDetails(String details);

	List<Organization> findBySharedtickets(boolean sharedtickets);

	List<Organization> findByTags(String tags);

}
