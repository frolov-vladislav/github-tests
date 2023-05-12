package com.vladislavfrolov.tests.pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.element;

public class WikiPage {

    protected SelenideElement softAssertionsLink = element(byText("Soft assertions"));
}