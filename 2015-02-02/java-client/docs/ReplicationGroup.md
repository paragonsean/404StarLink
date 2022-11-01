

# ReplicationGroup

Contains all of the attributes of a specific Redis replication group.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**replicationGroupId** | [**String**](String.md) |  |  [optional] |
|**description** | [**String**](String.md) |  |  [optional] |
|**globalReplicationGroupInfo** | [**ReplicationGroupGlobalReplicationGroupInfo**](ReplicationGroupGlobalReplicationGroupInfo.md) |  |  [optional] |
|**status** | [**String**](String.md) |  |  [optional] |
|**pendingModifiedValues** | [**ReplicationGroupPendingModifiedValues**](ReplicationGroupPendingModifiedValues.md) |  |  [optional] |
|**memberClusters** | [**List**](List.md) |  |  [optional] |
|**nodeGroups** | [**List**](List.md) |  |  [optional] |
|**snapshottingClusterId** | [**String**](String.md) |  |  [optional] |
|**automaticFailover** | [**AutomaticFailoverStatus**](AutomaticFailoverStatus.md) |  |  [optional] |
|**multiAZ** | [**MultiAZStatus**](MultiAZStatus.md) |  |  [optional] |
|**configurationEndpoint** | [**ReplicationGroupConfigurationEndpoint**](ReplicationGroupConfigurationEndpoint.md) |  |  [optional] |
|**snapshotRetentionLimit** | [**Integer**](Integer.md) |  |  [optional] |
|**snapshotWindow** | [**String**](String.md) |  |  [optional] |
|**clusterEnabled** | [**Boolean**](Boolean.md) |  |  [optional] |
|**cacheNodeType** | [**String**](String.md) |  |  [optional] |
|**authTokenEnabled** | [**Boolean**](Boolean.md) |  |  [optional] |
|**authTokenLastModifiedDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional] |
|**transitEncryptionEnabled** | [**Boolean**](Boolean.md) |  |  [optional] |
|**atRestEncryptionEnabled** | [**Boolean**](Boolean.md) |  |  [optional] |
|**memberClustersOutpostArns** | [**List**](List.md) |  |  [optional] |
|**kmsKeyId** | [**String**](String.md) |  |  [optional] |
|**ARN** | [**String**](String.md) |  |  [optional] |
|**userGroupIds** | [**List**](List.md) |  |  [optional] |
|**logDeliveryConfigurations** | [**List**](List.md) |  |  [optional] |
|**replicationGroupCreateTime** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional] |
|**dataTiering** | [**DataTieringStatus**](DataTieringStatus.md) |  |  [optional] |
|**autoMinorVersionUpgrade** | [**Boolean**](Boolean.md) |  |  [optional] |
|**networkType** | [**NetworkType**](NetworkType.md) |  |  [optional] |
|**ipDiscovery** | [**IpDiscovery**](IpDiscovery.md) |  |  [optional] |
|**transitEncryptionMode** | [**TransitEncryptionMode**](TransitEncryptionMode.md) |  |  [optional] |



