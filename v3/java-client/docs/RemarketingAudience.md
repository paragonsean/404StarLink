

# RemarketingAudience

JSON template for an Analytics remarketing audience.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountId** | **String** | Account ID to which this remarketing audience belongs. |  [optional] |
|**audienceDefinition** | [**RemarketingAudienceAudienceDefinition**](RemarketingAudienceAudienceDefinition.md) |  |  [optional] |
|**audienceType** | **String** | The type of audience, either SIMPLE or STATE_BASED. |  [optional] |
|**created** | **OffsetDateTime** | Time this remarketing audience was created. |  [optional] [readonly] |
|**description** | **String** | The description of this remarketing audience. |  [optional] [readonly] |
|**id** | **String** | Remarketing Audience ID. |  [optional] |
|**internalWebPropertyId** | **String** | Internal ID for the web property to which this remarketing audience belongs. |  [optional] [readonly] |
|**kind** | **String** | Collection type. |  [optional] |
|**linkedAdAccounts** | [**List&lt;LinkedForeignAccount&gt;**](LinkedForeignAccount.md) | The linked ad accounts associated with this remarketing audience. A remarketing audience can have only one linkedAdAccount currently. |  [optional] |
|**linkedViews** | **List&lt;String&gt;** | The views (profiles) that this remarketing audience is linked to. |  [optional] |
|**name** | **String** | The name of this remarketing audience. |  [optional] |
|**stateBasedAudienceDefinition** | [**RemarketingAudienceStateBasedAudienceDefinition**](RemarketingAudienceStateBasedAudienceDefinition.md) |  |  [optional] |
|**updated** | **OffsetDateTime** | Time this remarketing audience was last modified. |  [optional] [readonly] |
|**webPropertyId** | **String** | Web property ID of the form UA-XXXXX-YY to which this remarketing audience belongs. |  [optional] |



