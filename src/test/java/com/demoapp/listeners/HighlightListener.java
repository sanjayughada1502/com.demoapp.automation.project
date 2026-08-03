package com.demoapp.listeners;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverListener;

public class HighlightListener implements WebDriverListener {

    private final WebDriver driver;

    public HighlightListener(WebDriver driver) {
        this.driver = driver;
    }

    private void highlight(WebElement element) {

        try {
            JavascriptExecutor js = (JavascriptExecutor) driver;

            String originalStyle = element.getAttribute("style");

            js.executeScript(
                    "arguments[0].setAttribute('style', arguments[1]);",
                    element,
                    originalStyle + "border:3px solid red;background:yellow;"
            );

            Thread.sleep(200);

            js.executeScript(
                    "arguments[0].setAttribute('style', arguments[1]);",
                    element,
                    originalStyle
            );

        } catch (Exception ignored) {
        }
    }

    @Override
    public void beforeClick(WebElement element) {
        highlight(element);
    }

    @Override
    public void beforeSendKeys(WebElement element, CharSequence... keysToSend) {
        highlight(element);
    }

    @Override
    public void beforeClear(WebElement element) {
        highlight(element);
    }
}