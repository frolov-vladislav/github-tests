package com.vladislavfrolov.tests.web_steps;

import com.vladislavfrolov.tests.actions.Actions;
import com.vladislavfrolov.tests.assertions.Assertions;
import io.qameta.allure.Step;
import static com.codeborne.selenide.Selenide.open;

public class IssueTestSteps {

    Actions action = new Actions();
    Assertions assertion = new Assertions();

    @Step("Открыть главную страницу")
    public void openMainPage() {
        open("https://github.com");
    }

    @Step("Найти репозиторий с именем '{repoName}'")
    public void searchForRepository(String repoName) {
        action.mainPage.fillSearchFieldAndSubmit(repoName);
    }

    @Step("Перейти в репозиторий с именем '{repoName}'")
    public void openRepo(String repoName) {
        action.repositoriesPage.openRepo(repoName);
    }

    @Step("Открыть раздел Issues")
    public void openIssueTab() {
        action.repositoryPage.openIssuesTab();
    }

    @Step("Проверить, что Issue с именем '{issueName}' присутствует на странице")
    public void issueIsVisible(String issueName) {
        assertion.issuesPage.issueIsVisible(issueName);
    }
}