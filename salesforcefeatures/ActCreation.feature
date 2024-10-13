Feature: Account Creation of Salesforce application

Scenario: Creation of Account with valid credentials

Given Launch Browser and load Url
Given Log into salesforceapp with valid credentials
When Click login button
When Navigate to Salesforce app.
When Click on the toggle button at left top corner
When Click on ViewAll in the menu
When Click on the Sales in the App launcher
When Click on Accounts tab
When Click on New Button
When Enter the Account name as TestActName
When Select the ownership as Public
When Click Save button
Then Account Creation should be successful and verify the account name