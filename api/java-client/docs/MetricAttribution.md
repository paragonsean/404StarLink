

# MetricAttribution

Contains information on a metric attribution. A metric attribution creates reports on the data that you import into Amazon Personalize. Depending on how you import the data, you can view reports in Amazon CloudWatch or Amazon S3. For more information, see <a href=\"https://docs.aws.amazon.com/personalize/latest/dg/measuring-recommendation-impact.html\">Measuring impact of recommendations</a>.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | [**String**](String.md) |  |  [optional] |
|**metricAttributionArn** | [**String**](String.md) |  |  [optional] |
|**datasetGroupArn** | [**String**](String.md) |  |  [optional] |
|**metricsOutputConfig** | [**MetricAttributionMetricsOutputConfig**](MetricAttributionMetricsOutputConfig.md) |  |  [optional] |
|**status** | [**String**](String.md) |  |  [optional] |
|**creationDateTime** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional] |
|**lastUpdatedDateTime** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional] |
|**failureReason** | [**String**](String.md) |  |  [optional] |



