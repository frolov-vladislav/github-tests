package com.vladislavfrolov.tests.pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.element;

public class RepositoryPage {

    protected SelenideElement wikiTab = element("#wiki-tab");
    protected SelenideElement issuesTab = element("#issues-tab");
}