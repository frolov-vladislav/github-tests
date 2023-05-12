package com.vladislavfrolov.tests;

import com.vladislavfrolov.tests.actions.Actions;
import com.vladislavfrolov.tests.assertions.Assertions;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selenide.open;

public class SelenideGithubTests extends TestBase {

    String wikiUrl = "/selenide/selenide";
    String softAssertionsUrl = "/selenide/selenide/wiki/SoftAssertions";
    String JUnit5codeExample = "com.codeborne.selenide.junit5.SoftAssertsExtension";
    Actions action = new Actions();
    Assertions assertion = new Assertions();

    @Test
    public void PageHaveSoftAssertionsLink() {
        open(wikiUrl);
        action.repositoryPage.openWikiPage();
        assertion.wikiPage.softAssertionsLinkIsVisible();
    }

    @Test
    public void pageHaveJUnit5CodeExample() {
        open(softAssertionsUrl);
        assertion.selenideRepoSoftAssertionsPage.codeBlockContains(JUnit5codeExample);
    }
}