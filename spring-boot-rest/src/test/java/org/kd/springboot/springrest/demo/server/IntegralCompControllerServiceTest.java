package org.kd.springboot.springrest.demo.server;

import org.junit.BeforeClass;
import org.junit.Test;
import org.kd.springboot.springrest.demo.server.model.Country;
import org.kd.springboot.springrest.demo.server.service.CountryService;

import java.util.stream.Collectors;

import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;

public class IntegralCompControllerServiceTest {

    @BeforeClass
    public static void setUp() {
        CountryDemoApplication.main(new String[0]);
    }

    @Test
    public void testGetFirstCountry() {
        assertEquals("Poland"
                , CountryDemoApplication.getContext()
                        .getBean(CountryService.class)
                        .getFirstCountry()
                        .getName());
    }

    @Test
    public void testGetAllCountries() {
        assertThat(CountryDemoApplication.getContext()
                        .getBean(CountryService.class)
                        .getAllCountries()
                        .stream()
                        .map(Country::getName)
                        .collect(Collectors.toList())
                , hasItems("Poland", "Germany", "Chad"));
    }

}