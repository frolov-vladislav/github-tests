package com.vladislavfrolov.tests.pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.element;

public class IssuesPage {

    protected SelenideElement issue(String issueName) {
        return element(byText(issueName));
    }
}