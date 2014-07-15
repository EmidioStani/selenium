package org.openqa.selenium.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        TestGoogleResult.class,
        TestWikipediaResult.class
})
public class TestSuite {
}