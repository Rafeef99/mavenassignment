package najah.edu.tc;

import static org.junit.Assert.*;


import org.junit.Test;
import org.junit.runner.RunWith;

import io.cucumber.junit.*;

import io.cucumber.junit.CucumberOptions.SnippetType;
@RunWith(Cucumber.class)
@CucumberOptions(features = "use_case",
plugin= {"html:target/cucumber/wikipedia.html"},
monochrome= true,
snippets = SnippetType.CAMELCASE,
glue= {"najah.edu.tc"},
strict=true)

public class checkout_test {

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
