

# NodeGroup

Represents a collection of cache nodes in a replication group. One node in the node group is the read/write primary node. All the other nodes are read-only Replica nodes.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**nodeGroupId** | [**String**](String.md) |  |  [optional] |
|**status** | [**String**](String.md) |  |  [optional] |
|**primaryEndpoint** | [**NodeGroupPrimaryEndpoint**](NodeGroupPrimaryEndpoint.md) |  |  [optional] |
|**readerEndpoint** | [**NodeGroupReaderEndpoint**](NodeGroupReaderEndpoint.md) |  |  [optional] |
|**slots** | [**String**](String.md) |  |  [optional] |
|**nodeGroupMembers** | [**List**](List.md) |  |  [optional] |



