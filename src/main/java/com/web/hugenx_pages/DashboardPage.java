package com.web.hugenx_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DashboardPage
{
    public WebDriver driver;


    public DashboardPage (WebDriver driver)
    {
        this.driver= driver;
    }

    private By analyticsGraph = By.cssSelector("#myChart");
    private By accessionedCard = By.xpath("//h6[contains(text(), 'Accessioned')]");
    private By totalTestsCard = By.xpath("//h6[contains(text(), 'Total Tests')]");
    private By pendingCard = By.xpath("//h6[contains(text(), 'Pending')]");
    private By resultedCard = By.xpath("//h6[contains(text(), 'Resulted')]");
    private By sendoutsCard = By.xpath("//h6[contains(text(), 'Sendouts')]");
    private By issuesCard = By.xpath("//h6[contains(text(), 'Issues')]");
    private By dateRangeButtons = By.cssSelector(".btn.mb-sm-2.mb-2.ml-2.tabActiveClass");
    private By tableRows = By.xpath("//thead[@class='table table-bordered table-striped accession-list-header']");

    // Method to get text from the "Accessioned" card
    public String getAccessionedText()
    {
        return driver.findElement(accessionedCard).getText();
    }

    // Method to get text from the "Total Tests" card
    public String getTotalTestsText()
    {
        return driver.findElement(totalTestsCard).getText();
    }

    // Method to get text from the "Pending" card
    public String getPendingText()
    {
        return driver.findElement(pendingCard).getText();
    }

    // Method to interact with the Analytics graph (stub method)
    public void interactWithAnalyticsGraph()
    {
        // Implementation depends on the exact actions possible with the graph
        WebElement graphElement = driver.findElement(analyticsGraph);
        // Example interaction with the graph could be clicking it, hovering, etc.
    }

    // Method to select a date range button
    public void selectDateRange(String rangeText,By element)
    {
        List<WebElement> dateButtons = driver.findElements(element);
        for (WebElement button : dateButtons) {
            if (button.getText().equalsIgnoreCase(rangeText))
            {
                button.click();
                break;
            }
        }
    }

    // Method to print the data table (stub method)
    public void printDataTable()
    {
        List<WebElement> rows = driver.findElements(tableRows);
        for (WebElement row : rows) {
            System.out.println(row.getText());
        }
    }

    // Additional methods for other elements on the dashboard can be added similarly

    public void printTableData()
    {
        // Find all rows within the table body
        List<WebElement> rows = driver.findElements(tableRows);

        // Loop through each row and print the data
        for (WebElement row : rows)
        {
            // Retrieve all cells in the current row
            List<WebElement> cells = row.findElements(By.tagName("td"));

            // Create a StringBuilder to accumulate the cell data
            StringBuilder rowData = new StringBuilder();

            // Loop through all cells and append their text to the rowData
            for (WebElement cell : cells)
            {
                rowData.append(cell.getText()).append(" | ");
            }

            // Print the accumulated row data, removing the last separator
            System.out.println(rowData.substring(0, rowData.length() - 3));
        }
    }
}
