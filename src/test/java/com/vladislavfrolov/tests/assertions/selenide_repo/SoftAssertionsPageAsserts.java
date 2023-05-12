package com.vladislavfrolov.tests.assertions.selenide_repo;

import com.codeborne.selenide.Condition;
import com.vladislavfrolov.tests.pages.SoftAssertionsPage;
import static com.codeborne.selenide.Condition.visible;

public class SoftAssertionsPageAsserts extends SoftAssertionsPage {

    public void codeBlockContains(String code) {
        this.code.filter(Condition.exactText(code)).first().shouldBe(visible);
    }
}