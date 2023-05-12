package com.vladislavfrolov.tests.assertions;

import com.vladislavfrolov.tests.pages.WikiPage;
import static com.codeborne.selenide.Condition.visible;

public class WikiPageAsserts extends WikiPage {

    public void softAssertionsLinkIsVisible() {
        softAssertionsLink.shouldBe(visible);
    }
}