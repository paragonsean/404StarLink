

# Recommendation

<p>Provides information that describes a recommendation of a target engine.</p> <p>A <i>recommendation</i> is a set of possible Amazon Web Services target engines that you can choose to migrate your source on-premises database. In this set, Fleet Advisor suggests a single target engine as the right sized migration destination. To determine this rightsized migration destination, Fleet Advisor uses the inventory metadata and metrics from data collector. You can use recommendations before the start of migration to save costs and reduce risks.</p> <p>With recommendations, you can explore different target options and compare metrics, so you can make an informed decision when you choose the migration target.</p>

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**databaseId** | [**String**](String.md) |  |  [optional] |
|**engineName** | [**String**](String.md) |  |  [optional] |
|**createdDate** | [**String**](String.md) |  |  [optional] |
|**status** | [**String**](String.md) |  |  [optional] |
|**preferred** | [**Boolean**](Boolean.md) |  |  [optional] |
|**settings** | [**RecommendationSettings**](RecommendationSettings.md) |  |  [optional] |
|**data** | [**RecommendationData**](RecommendationData.md) |  |  [optional] |



