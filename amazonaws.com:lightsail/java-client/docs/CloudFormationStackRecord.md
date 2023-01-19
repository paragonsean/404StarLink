

# CloudFormationStackRecord

<p>Describes a CloudFormation stack record created as a result of the <code>create cloud formation stack</code> action.</p> <p>A CloudFormation stack record provides information about the AWS CloudFormation stack used to create a new Amazon Elastic Compute Cloud instance from an exported Lightsail instance snapshot.</p>

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | [**String**](String.md) |  |  [optional] |
|**arn** | [**String**](String.md) |  |  [optional] |
|**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional] |
|**location** | [**CloudFormationStackRecordLocation**](CloudFormationStackRecordLocation.md) |  |  [optional] |
|**resourceType** | [**ResourceType**](ResourceType.md) |  |  [optional] |
|**state** | [**RecordState**](RecordState.md) |  |  [optional] |
|**sourceInfo** | [**List**](List.md) |  |  [optional] |
|**destinationInfo** | [**CloudFormationStackRecordDestinationInfo**](CloudFormationStackRecordDestinationInfo.md) |  |  [optional] |



