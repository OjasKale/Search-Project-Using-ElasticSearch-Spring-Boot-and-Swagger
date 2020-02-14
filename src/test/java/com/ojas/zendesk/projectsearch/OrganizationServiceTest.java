package com.ojas.zendesk.projectsearch;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;

import com.ojas.zendesk.projectsearch.model.Organization;
import com.ojas.zendesk.projectsearch.service.OrganizationService;

public class OrganizationServiceTest extends ZendeskSearchProjectApplicationTests{
	@Autowired
	OrganizationService orgService;
	
	@Autowired
	ElasticsearchTemplate esTemplate;
	
	@Before
	public void before() {
        esTemplate.deleteIndex(Organization.class);
        esTemplate.createIndex(Organization.class);
        esTemplate.putMapping(Organization.class);
        esTemplate.refresh(Organization.class);
    }
	
	@Test
    public void testSave() {

		String[] domians = {"trollery.com","datagen.com","bluegrain.com","dadabase.com"};
		String[] tags = {"Vance","Ray","Jacobs","Frank"};
        Organization org = new Organization("126", "http://initech.zendesk.com/api/v2/organizations/126.json", "7cd6b8d4-2999-4ff2-8cfd-44d05aabb44e", "RetaLive", domians, "2016-04-07T08:21:44 -10:00", "MegaCorp", false,tags);
        Organization testBook = orgService.save(org);

        assertNotNull(testBook.getId());
        assertEquals(testBook.getCreatedat(), org.getCreatedat());
        assertEquals(testBook.getDetails(), org.getDetails());
        assertEquals(testBook.getExternalid(), org.getExternalid());
        assertEquals(testBook.getName(), org.getName());
        assertEquals(testBook.isSharedtickets(), org.isSharedtickets());
        assertEquals(testBook.getUrl(), org.getUrl());

    }
}
