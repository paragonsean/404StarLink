

# GoalUrlDestinationDetails

Details for the goal of the type URL_DESTINATION.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**caseSensitive** | **Boolean** | Determines if the goal URL must exactly match the capitalization of visited URLs. |  [optional] |
|**firstStepRequired** | **Boolean** | Determines if the first step in this goal is required. |  [optional] |
|**matchType** | **String** | Match type for the goal URL. Possible values are HEAD, EXACT, or REGEX. |  [optional] |
|**steps** | [**List&lt;GoalUrlDestinationDetailsStepsInner&gt;**](GoalUrlDestinationDetailsStepsInner.md) | List of steps configured for this goal funnel. |  [optional] |
|**url** | **String** | URL for this goal. |  [optional] |



