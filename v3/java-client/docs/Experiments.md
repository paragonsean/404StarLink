

# Experiments

An experiment collection lists Analytics experiments to which the user has access. Each view (profile) can have a set of experiments. Each resource in the Experiment collection corresponds to a single Analytics experiment.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**items** | [**List&lt;Experiment&gt;**](Experiment.md) | A list of experiments. |  [optional] |
|**itemsPerPage** | **Integer** | The maximum number of resources the response can contain, regardless of the actual number of resources returned. Its value ranges from 1 to 1000 with a value of 1000 by default, or otherwise specified by the max-results query parameter. |  [optional] |
|**kind** | **String** | Collection type. |  [optional] |
|**nextLink** | **String** | Link to next page for this experiment collection. |  [optional] |
|**previousLink** | **String** | Link to previous page for this experiment collection. |  [optional] |
|**startIndex** | **Integer** | The starting index of the resources, which is 1 by default or otherwise specified by the start-index query parameter. |  [optional] |
|**totalResults** | **Integer** | The total number of results for the query, regardless of the number of resources in the result. |  [optional] |
|**username** | **String** | Email ID of the authenticated user |  [optional] |



