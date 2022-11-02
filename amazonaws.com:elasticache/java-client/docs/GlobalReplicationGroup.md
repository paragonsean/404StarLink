

# GlobalReplicationGroup

<p>Consists of a primary cluster that accepts writes and an associated secondary cluster that resides in a different Amazon region. The secondary cluster accepts only reads. The primary cluster automatically replicates updates to the secondary cluster.</p> <ul> <li> <p>The <b>GlobalReplicationGroupIdSuffix</b> represents the name of the Global datastore, which is what you use to associate a secondary cluster.</p> </li> </ul>

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**globalReplicationGroupId** | [**String**](String.md) |  |  [optional] |
|**globalReplicationGroupDescription** | [**String**](String.md) |  |  [optional] |
|**status** | [**String**](String.md) |  |  [optional] |
|**cacheNodeType** | [**String**](String.md) |  |  [optional] |
|**engine** | [**String**](String.md) |  |  [optional] |
|**engineVersion** | [**String**](String.md) |  |  [optional] |
|**members** | [**List**](List.md) |  |  [optional] |
|**clusterEnabled** | [**Boolean**](Boolean.md) |  |  [optional] |
|**globalNodeGroups** | [**List**](List.md) |  |  [optional] |
|**authTokenEnabled** | [**Boolean**](Boolean.md) |  |  [optional] |
|**transitEncryptionEnabled** | [**Boolean**](Boolean.md) |  |  [optional] |
|**atRestEncryptionEnabled** | [**Boolean**](Boolean.md) |  |  [optional] |
|**ARN** | [**String**](String.md) |  |  [optional] |



