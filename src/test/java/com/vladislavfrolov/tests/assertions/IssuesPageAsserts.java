package com.vladislavfrolov.tests.assertions;

import com.vladislavfrolov.tests.pages.IssuesPage;
import static com.codeborne.selenide.Condition.visible;

public class IssuesPageAsserts extends IssuesPage {

    public void issueIsVisible(String issueName) {
        issue(issueName).shouldBe(visible);
    }
}