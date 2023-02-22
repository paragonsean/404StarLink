

# Webproperty

JSON template for an Analytics web property.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountId** | **String** | Account ID to which this web property belongs. |  [optional] |
|**childLink** | [**WebpropertyChildLink**](WebpropertyChildLink.md) |  |  [optional] |
|**created** | **OffsetDateTime** | Time this web property was created. |  [optional] [readonly] |
|**dataRetentionResetOnNewActivity** | **Boolean** | Set to true to reset the retention period of the user identifier with each new event from that user (thus setting the expiration date to current time plus retention period). Set to false to delete data associated with the user identifier automatically after the rentention period. This property cannot be set on insert. |  [optional] |
|**dataRetentionTtl** | **String** | The length of time for which user and event data is retained. This property cannot be set on insert. |  [optional] |
|**defaultProfileId** | **String** | Default view (profile) ID. |  [optional] |
|**id** | **String** | Web property ID of the form UA-XXXXX-YY. |  [optional] |
|**industryVertical** | **String** | The industry vertical/category selected for this web property. |  [optional] |
|**internalWebPropertyId** | **String** | Internal ID for this web property. |  [optional] [readonly] |
|**kind** | **String** | Resource type for Analytics WebProperty. |  [optional] [readonly] |
|**level** | **String** | Level for this web property. Possible values are STANDARD or PREMIUM. |  [optional] [readonly] |
|**name** | **String** | Name of this web property. |  [optional] |
|**parentLink** | [**WebpropertyParentLink**](WebpropertyParentLink.md) |  |  [optional] |
|**permissions** | [**WebpropertyPermissions**](WebpropertyPermissions.md) |  |  [optional] |
|**profileCount** | **Integer** | View (Profile) count for this web property. |  [optional] [readonly] |
|**selfLink** | **String** | Link for this web property. |  [optional] [readonly] |
|**starred** | **Boolean** | Indicates whether this web property is starred or not. |  [optional] |
|**updated** | **OffsetDateTime** | Time this web property was last modified. |  [optional] [readonly] |
|**websiteUrl** | **String** | Website url for this web property. |  [optional] |



