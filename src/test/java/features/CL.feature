Feature: Login into LeafTaps
Scenario Outline: Create Lead
Given enter user name "<username>"
And enter password "<pass>"
When click login
Then display login name
Examples:
|username|pass|
|Demosalesmanager|crmsfa|