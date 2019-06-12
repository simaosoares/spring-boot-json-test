package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.boot.test.json.JacksonTester;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

@JsonTest
@RunWith(SpringRunner.class)
public class PersonJsonTest {

    @Autowired
    private JacksonTester<Person> jacksonTester;
    private String jsonFile = "person.json";
    private final Person person = new Person("John Petrucci");

    @Test
    public void testSerialize() throws IOException {
        assertThat(jacksonTester.write(person)).isEqualToJson(jsonFile);
    }

    @Test
    public void testDeserialize() throws IOException {
        assertEquals(person.getName(), jacksonTester.read(jsonFile).getObject().getName());
    }
}