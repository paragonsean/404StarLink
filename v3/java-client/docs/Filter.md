

# Filter

JSON template for an Analytics account filter.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountId** | **String** | Account ID to which this filter belongs. |  [optional] |
|**advancedDetails** | [**FilterAdvancedDetails**](FilterAdvancedDetails.md) |  |  [optional] |
|**created** | **OffsetDateTime** | Time this filter was created. |  [optional] [readonly] |
|**excludeDetails** | [**FilterExpression**](FilterExpression.md) |  |  [optional] |
|**id** | **String** | Filter ID. |  [optional] |
|**includeDetails** | [**FilterExpression**](FilterExpression.md) |  |  [optional] |
|**kind** | **String** | Resource type for Analytics filter. |  [optional] [readonly] |
|**lowercaseDetails** | [**FilterLowercaseDetails**](FilterLowercaseDetails.md) |  |  [optional] |
|**name** | **String** | Name of this filter. |  [optional] |
|**parentLink** | [**FilterParentLink**](FilterParentLink.md) |  |  [optional] |
|**searchAndReplaceDetails** | [**FilterSearchAndReplaceDetails**](FilterSearchAndReplaceDetails.md) |  |  [optional] |
|**selfLink** | **String** | Link for this filter. |  [optional] [readonly] |
|**type** | **String** | Type of this filter. Possible values are INCLUDE, EXCLUDE, LOWERCASE, UPPERCASE, SEARCH_AND_REPLACE and ADVANCED. |  [optional] |
|**updated** | **OffsetDateTime** | Time this filter was last modified. |  [optional] [readonly] |
|**uppercaseDetails** | [**FilterUppercaseDetails**](FilterUppercaseDetails.md) |  |  [optional] |



