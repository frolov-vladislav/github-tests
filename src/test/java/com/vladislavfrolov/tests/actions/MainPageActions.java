package com.vladislavfrolov.tests.actions;

import com.vladislavfrolov.tests.pages.MainPage;

public class MainPageActions extends MainPage {

    public void fillSearchFieldAndSubmit(String value) {
        searchInput.click();
        searchInput.sendKeys(value);
        searchInput.submit();
    }
}