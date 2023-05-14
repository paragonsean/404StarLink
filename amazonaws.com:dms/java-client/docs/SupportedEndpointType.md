

# SupportedEndpointType

Provides information about types of supported endpoints in response to a request by the <code>DescribeEndpointTypes</code> operation. This information includes the type of endpoint, the database engine name, and whether change data capture (CDC) is supported.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**engineName** | [**String**](String.md) |  |  [optional] |
|**supportsCDC** | [**Boolean**](Boolean.md) |  |  [optional] |
|**endpointType** | [**ReplicationEndpointTypeValue**](ReplicationEndpointTypeValue.md) |  |  [optional] |
|**replicationInstanceEngineMinimumVersion** | [**String**](String.md) |  |  [optional] |
|**engineDisplayName** | [**String**](String.md) |  |  [optional] |



