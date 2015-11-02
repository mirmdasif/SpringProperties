package com.springapp.mvc;

import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * @author asif.hossain
 * @since 11/1/15
 */

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration("file:src/main/webapp/WEB-INF/mvc-dispatcher-servlet.xml")
public class PropertyTest {
    
    @Value("${jdbc.url}")
    private String url;
    
    @Test
    public void test_if_properties_created() throws Exception {
        Assert.assertEquals(url, "localhost");
    }
}
