

# CloudWatchLogsLogStream

Describes the Amazon CloudWatch logs configuration for a layer. For detailed information about members of this data type, see the <a href=\"https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/AgentReference.html\">CloudWatch Logs Agent Reference</a>.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**logGroupName** | [**String**](String.md) |  |  [optional] |
|**datetimeFormat** | [**String**](String.md) |  |  [optional] |
|**timeZone** | [**CloudWatchLogsTimeZone**](CloudWatchLogsTimeZone.md) |  |  [optional] |
|**_file** | [**String**](String.md) |  |  [optional] |
|**fileFingerprintLines** | [**String**](String.md) |  |  [optional] |
|**multiLineStartPattern** | [**String**](String.md) |  |  [optional] |
|**initialPosition** | [**CloudWatchLogsInitialPosition**](CloudWatchLogsInitialPosition.md) |  |  [optional] |
|**encoding** | [**CloudWatchLogsEncoding**](CloudWatchLogsEncoding.md) |  |  [optional] |
|**bufferDuration** | [**Integer**](Integer.md) |  |  [optional] |
|**batchCount** | [**Integer**](Integer.md) |  |  [optional] |
|**batchSize** | [**Integer**](Integer.md) |  |  [optional] |



