package com.vladislavfrolov.tests;

import com.vladislavfrolov.tests.actions.Actions;
import com.vladislavfrolov.tests.assertions.Assertions;
import com.vladislavfrolov.tests.web_steps.IssueTestSteps;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class IssueTest extends TestBase {

    private final static String REPOSITORY = "eroshenkoam/allure-example";
    private final static String ISSUE_NAME = "с днем археолога!";
    Assertions assertion = new Assertions();
    Actions action = new Actions();

    @Test
    public void onlySelenideTest() {
        open("https://github.com");
        action.mainPage.fillSearchFieldAndSubmit(REPOSITORY);
        action.repositoriesPage.openRepo(REPOSITORY);
        action.repositoryPage.openIssuesTab();
        assertion.issuesPage.issueIsVisible(ISSUE_NAME);
    }

    @Test
    public void issueTestWithLambda() {
        step("Открыть главную страницу", () -> {
            open("https://github.com");
        });
        step("Найти репозиторий с именем: " + REPOSITORY, () -> {
            action.mainPage.fillSearchFieldAndSubmit(REPOSITORY);
        });
        step("Перейти в репозиторий с именем: " + REPOSITORY, () -> {
            action.repositoriesPage.openRepo(REPOSITORY);
        });
        step("Перейти в раздел 'Issues'", () -> {
            action.repositoryPage.openIssuesTab();
        });
        step("Проверить, что issue с именем '" + ISSUE_NAME + "' присутствует на странице", () -> {
            assertion.issuesPage.issueIsVisible(ISSUE_NAME);
        });
    }

    @Test
    public void issueTestWithAnnotatedSteps() {
        IssueTestSteps steps = new IssueTestSteps();
        steps.openMainPage();
        steps.searchForRepository(REPOSITORY);
        steps.openRepo(REPOSITORY);
        steps.openIssueTab();
        steps.issueIsVisible(ISSUE_NAME);
    }
}