package com.vladislavfrolov.tests.actions;

import com.vladislavfrolov.tests.pages.RepositoryPage;

public class RepositoryPageActions extends RepositoryPage {

    public void openWikiPage() {
        wikiTab.click();
    }

    public void openIssuesTab() {
        issuesTab.click();
    }
}