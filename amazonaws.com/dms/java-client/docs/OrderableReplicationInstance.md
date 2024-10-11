

# OrderableReplicationInstance

In response to the <code>DescribeOrderableReplicationInstances</code> operation, this object describes an available replication instance. This description includes the replication instance's type, engine version, and allocated storage.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**engineVersion** | [**String**](String.md) |  |  [optional] |
|**replicationInstanceClass** | [**String**](String.md) |  |  [optional] |
|**storageType** | [**String**](String.md) |  |  [optional] |
|**minAllocatedStorage** | [**Integer**](Integer.md) |  |  [optional] |
|**maxAllocatedStorage** | [**Integer**](Integer.md) |  |  [optional] |
|**defaultAllocatedStorage** | [**Integer**](Integer.md) |  |  [optional] |
|**includedAllocatedStorage** | [**Integer**](Integer.md) |  |  [optional] |
|**availabilityZones** | [**List**](List.md) |  |  [optional] |
|**releaseStatus** | [**ReleaseStatusValues**](ReleaseStatusValues.md) |  |  [optional] |



