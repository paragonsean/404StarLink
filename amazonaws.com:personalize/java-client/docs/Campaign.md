

# Campaign

An object that describes the deployment of a solution version. For more information on campaigns, see <a href=\"https://docs.aws.amazon.com/personalize/latest/dg/API_CreateCampaign.html\">CreateCampaign</a>.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | [**String**](String.md) |  |  [optional] |
|**campaignArn** | [**String**](String.md) |  |  [optional] |
|**solutionVersionArn** | [**String**](String.md) |  |  [optional] |
|**minProvisionedTPS** | [**Integer**](Integer.md) |  |  [optional] |
|**campaignConfig** | [**CreateCampaignRequestCampaignConfig**](CreateCampaignRequestCampaignConfig.md) |  |  [optional] |
|**status** | [**String**](String.md) |  |  [optional] |
|**failureReason** | [**String**](String.md) |  |  [optional] |
|**creationDateTime** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional] |
|**lastUpdatedDateTime** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional] |
|**latestCampaignUpdate** | [**CampaignUpdateSummary**](CampaignUpdateSummary.md) |  |  [optional] |



