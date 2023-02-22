

# WebPropertySummary

JSON template for an Analytics WebPropertySummary. WebPropertySummary returns basic information (i.e., summary) for a web property.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Web property ID of the form UA-XXXXX-YY. |  [optional] |
|**internalWebPropertyId** | **String** | Internal ID for this web property. |  [optional] |
|**kind** | **String** | Resource type for Analytics WebPropertySummary. |  [optional] |
|**level** | **String** | Level for this web property. Possible values are STANDARD or PREMIUM. |  [optional] |
|**name** | **String** | Web property name. |  [optional] |
|**profiles** | [**List&lt;ProfileSummary&gt;**](ProfileSummary.md) | List of profiles under this web property. |  [optional] |
|**starred** | **Boolean** | Indicates whether this web property is starred or not. |  [optional] |
|**websiteUrl** | **String** | Website url for this web property. |  [optional] |



