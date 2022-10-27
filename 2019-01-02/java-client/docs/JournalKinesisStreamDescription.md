

# JournalKinesisStreamDescription

Information about an Amazon QLDB journal stream, including the Amazon Resource Name (ARN), stream name, creation time, current status, and the parameters of the original stream creation request.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**ledgerName** | [**String**](String.md) |  |  |
|**creationTime** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional] |
|**inclusiveStartTime** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional] |
|**exclusiveEndTime** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional] |
|**roleArn** | [**String**](String.md) |  |  |
|**streamId** | [**String**](String.md) |  |  |
|**arn** | [**String**](String.md) |  |  [optional] |
|**status** | [**StreamStatus**](StreamStatus.md) |  |  |
|**kinesisConfiguration** | [**JournalKinesisStreamDescriptionKinesisConfiguration**](JournalKinesisStreamDescriptionKinesisConfiguration.md) |  |  |
|**errorCause** | [**ErrorCause**](ErrorCause.md) |  |  [optional] |
|**streamName** | [**String**](String.md) |  |  |



