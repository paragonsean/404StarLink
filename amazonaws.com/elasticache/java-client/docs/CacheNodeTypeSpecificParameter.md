

# CacheNodeTypeSpecificParameter

A parameter that has a different value for each cache node type it is applied to. For example, in a Redis cluster, a <code>cache.m1.large</code> cache node type would have a larger <code>maxmemory</code> value than a <code>cache.m1.small</code> type.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**parameterName** | [**String**](String.md) |  |  [optional] |
|**description** | [**String**](String.md) |  |  [optional] |
|**source** | [**String**](String.md) |  |  [optional] |
|**dataType** | [**String**](String.md) |  |  [optional] |
|**allowedValues** | [**String**](String.md) |  |  [optional] |
|**isModifiable** | [**Boolean**](Boolean.md) |  |  [optional] |
|**minimumEngineVersion** | [**String**](String.md) |  |  [optional] |
|**cacheNodeTypeSpecificValues** | [**List**](List.md) |  |  [optional] |
|**changeType** | [**ChangeType**](ChangeType.md) |  |  [optional] |



