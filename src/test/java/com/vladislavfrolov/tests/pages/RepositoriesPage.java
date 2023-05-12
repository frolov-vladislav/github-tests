package com.vladislavfrolov.tests.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.element;

public class RepositoriesPage {

    protected SelenideElement repo(String repoName) {
        return element(By.linkText(repoName));
    }
}