

# Recommender

Describes a recommendation generator for a Domain dataset group. You create a recommender in a Domain dataset group for a specific domain use case (domain recipe), and specify the recommender in a <a href=\"https://docs.aws.amazon.com/personalize/latest/dg/API_RS_GetRecommendations.html\">GetRecommendations</a> request.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**recommenderArn** | [**String**](String.md) |  |  [optional] |
|**datasetGroupArn** | [**String**](String.md) |  |  [optional] |
|**name** | [**String**](String.md) |  |  [optional] |
|**recipeArn** | [**String**](String.md) |  |  [optional] |
|**recommenderConfig** | [**CreateRecommenderRequestRecommenderConfig**](CreateRecommenderRequestRecommenderConfig.md) |  |  [optional] |
|**creationDateTime** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional] |
|**lastUpdatedDateTime** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional] |
|**status** | [**String**](String.md) |  |  [optional] |
|**failureReason** | [**String**](String.md) |  |  [optional] |
|**latestRecommenderUpdate** | [**RecommenderLatestRecommenderUpdate**](RecommenderLatestRecommenderUpdate.md) |  |  [optional] |
|**modelMetrics** | [**Map**](Map.md) |  |  [optional] |



