

# KinesisSettings

Provides information that describes an Amazon Kinesis Data Stream endpoint. This information includes the output format of records applied to the endpoint and details of transaction and control table data information.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**streamArn** | [**String**](String.md) |  |  [optional] |
|**messageFormat** | [**MessageFormatValue**](MessageFormatValue.md) |  |  [optional] |
|**serviceAccessRoleArn** | [**String**](String.md) |  |  [optional] |
|**includeTransactionDetails** | [**Boolean**](Boolean.md) |  |  [optional] |
|**includePartitionValue** | [**Boolean**](Boolean.md) |  |  [optional] |
|**partitionIncludeSchemaTable** | [**Boolean**](Boolean.md) |  |  [optional] |
|**includeTableAlterOperations** | [**Boolean**](Boolean.md) |  |  [optional] |
|**includeControlDetails** | [**Boolean**](Boolean.md) |  |  [optional] |
|**includeNullAndEmpty** | [**Boolean**](Boolean.md) |  |  [optional] |
|**noHexPrefix** | [**Boolean**](Boolean.md) |  |  [optional] |



