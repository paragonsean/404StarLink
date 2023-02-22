

# Goal

JSON template for Analytics goal resource.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountId** | **String** | Account ID to which this goal belongs. |  [optional] |
|**active** | **Boolean** | Determines whether this goal is active. |  [optional] |
|**created** | **OffsetDateTime** | Time this goal was created. |  [optional] |
|**eventDetails** | [**GoalEventDetails**](GoalEventDetails.md) |  |  [optional] |
|**id** | **String** | Goal ID. |  [optional] |
|**internalWebPropertyId** | **String** | Internal ID for the web property to which this goal belongs. |  [optional] |
|**kind** | **String** | Resource type for an Analytics goal. |  [optional] |
|**name** | **String** | Goal name. |  [optional] |
|**parentLink** | [**GoalParentLink**](GoalParentLink.md) |  |  [optional] |
|**profileId** | **String** | View (Profile) ID to which this goal belongs. |  [optional] |
|**selfLink** | **String** | Link for this goal. |  [optional] |
|**type** | **String** | Goal type. Possible values are URL_DESTINATION, VISIT_TIME_ON_SITE, VISIT_NUM_PAGES, AND EVENT. |  [optional] |
|**updated** | **OffsetDateTime** | Time this goal was last modified. |  [optional] |
|**urlDestinationDetails** | [**GoalUrlDestinationDetails**](GoalUrlDestinationDetails.md) |  |  [optional] |
|**value** | **Float** | Goal value. |  [optional] |
|**visitNumPagesDetails** | [**GoalVisitNumPagesDetails**](GoalVisitNumPagesDetails.md) |  |  [optional] |
|**visitTimeOnSiteDetails** | [**GoalVisitTimeOnSiteDetails**](GoalVisitTimeOnSiteDetails.md) |  |  [optional] |
|**webPropertyId** | **String** | Web property ID to which this goal belongs. The web property ID is of the form UA-XXXXX-YY. |  [optional] |



