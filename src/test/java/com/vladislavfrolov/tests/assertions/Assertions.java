package com.vladislavfrolov.tests.assertions;

import com.vladislavfrolov.tests.assertions.selenide_repo.SoftAssertionsPageAsserts;

public class Assertions {

    public SoftAssertionsPageAsserts selenideRepoSoftAssertionsPage = new SoftAssertionsPageAsserts();
    public WikiPageAsserts wikiPage = new WikiPageAsserts();
    public IssuesPageAsserts issuesPage = new IssuesPageAsserts();
}