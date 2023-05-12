package com.vladislavfrolov.tests.actions;

import com.vladislavfrolov.tests.pages.RepositoriesPage;

public class RepositoriesPageActions extends RepositoriesPage {

    public void openRepo(String repoName) {
        this.repo(repoName).click();
    }
}