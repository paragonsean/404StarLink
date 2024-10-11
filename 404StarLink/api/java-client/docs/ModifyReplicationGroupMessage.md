

# ModifyReplicationGroupMessage

Represents the input of a <code>ModifyReplicationGroups</code> operation.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**replicationGroupId** | [**String**](String.md) |  |  |
|**replicationGroupDescription** | [**String**](String.md) |  |  [optional] |
|**primaryClusterId** | [**String**](String.md) |  |  [optional] |
|**snapshottingClusterId** | [**String**](String.md) |  |  [optional] |
|**automaticFailoverEnabled** | [**Boolean**](Boolean.md) |  |  [optional] |
|**multiAZEnabled** | [**Boolean**](Boolean.md) |  |  [optional] |
|**nodeGroupId** | [**String**](String.md) |  |  [optional] |
|**cacheSecurityGroupNames** | [**List**](List.md) |  |  [optional] |
|**securityGroupIds** | [**List**](List.md) |  |  [optional] |
|**preferredMaintenanceWindow** | [**String**](String.md) |  |  [optional] |
|**notificationTopicArn** | [**String**](String.md) |  |  [optional] |
|**cacheParameterGroupName** | [**String**](String.md) |  |  [optional] |
|**notificationTopicStatus** | [**String**](String.md) |  |  [optional] |
|**applyImmediately** | [**Boolean**](Boolean.md) |  |  [optional] |
|**engineVersion** | [**String**](String.md) |  |  [optional] |
|**autoMinorVersionUpgrade** | [**Boolean**](Boolean.md) |  |  [optional] |
|**snapshotRetentionLimit** | [**Integer**](Integer.md) |  |  [optional] |
|**snapshotWindow** | [**String**](String.md) |  |  [optional] |
|**cacheNodeType** | [**String**](String.md) |  |  [optional] |
|**authToken** | [**String**](String.md) |  |  [optional] |
|**authTokenUpdateStrategy** | [**AuthTokenUpdateStrategyType**](AuthTokenUpdateStrategyType.md) |  |  [optional] |
|**userGroupIdsToAdd** | [**List**](List.md) |  |  [optional] |
|**userGroupIdsToRemove** | [**List**](List.md) |  |  [optional] |
|**removeUserGroups** | [**Boolean**](Boolean.md) |  |  [optional] |
|**logDeliveryConfigurations** | [**List**](List.md) |  |  [optional] |
|**ipDiscovery** | [**IpDiscovery**](IpDiscovery.md) |  |  [optional] |
|**transitEncryptionEnabled** | [**Boolean**](Boolean.md) |  |  [optional] |
|**transitEncryptionMode** | [**TransitEncryptionMode**](TransitEncryptionMode.md) |  |  [optional] |



