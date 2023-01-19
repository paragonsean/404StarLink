

# Alarm

<p>Describes an alarm.</p> <p>An alarm is a way to monitor your Lightsail resource metrics. For more information, see <a href=\"https://lightsail.aws.amazon.com/ls/docs/en_us/articles/amazon-lightsail-alarms\">Alarms in Amazon Lightsail</a>.</p>

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | [**String**](String.md) |  |  [optional] |
|**arn** | [**String**](String.md) |  |  [optional] |
|**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional] |
|**location** | [**AlarmLocation**](AlarmLocation.md) |  |  [optional] |
|**resourceType** | [**ResourceType**](ResourceType.md) |  |  [optional] |
|**supportCode** | [**String**](String.md) |  |  [optional] |
|**monitoredResourceInfo** | [**AlarmMonitoredResourceInfo**](AlarmMonitoredResourceInfo.md) |  |  [optional] |
|**comparisonOperator** | [**ComparisonOperator**](ComparisonOperator.md) |  |  [optional] |
|**evaluationPeriods** | [**Integer**](Integer.md) |  |  [optional] |
|**period** | [**Integer**](Integer.md) |  |  [optional] |
|**threshold** | [**Double**](Double.md) |  |  [optional] |
|**datapointsToAlarm** | [**Integer**](Integer.md) |  |  [optional] |
|**treatMissingData** | [**TreatMissingData**](TreatMissingData.md) |  |  [optional] |
|**statistic** | [**MetricStatistic**](MetricStatistic.md) |  |  [optional] |
|**metricName** | [**MetricName**](MetricName.md) |  |  [optional] |
|**state** | [**AlarmState**](AlarmState.md) |  |  [optional] |
|**unit** | [**MetricUnit**](MetricUnit.md) |  |  [optional] |
|**contactProtocols** | [**List**](List.md) |  |  [optional] |
|**notificationTriggers** | [**List**](List.md) |  |  [optional] |
|**notificationEnabled** | [**Boolean**](Boolean.md) |  |  [optional] |



