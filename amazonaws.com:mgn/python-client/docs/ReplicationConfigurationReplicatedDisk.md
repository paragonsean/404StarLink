# ReplicationConfigurationReplicatedDisk

Replication Configuration replicated disk.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**device_name** | **str** |  | [optional] 
**iops** | **int** |  | [optional] 
**is_boot_disk** | **bool** |  | [optional] 
**staging_disk_type** | [**ReplicationConfigurationReplicatedDiskStagingDiskType**](ReplicationConfigurationReplicatedDiskStagingDiskType.md) |  | [optional] 
**throughput** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.replication_configuration_replicated_disk import ReplicationConfigurationReplicatedDisk

# TODO update the JSON string below
json = "{}"
# create an instance of ReplicationConfigurationReplicatedDisk from a JSON string
replication_configuration_replicated_disk_instance = ReplicationConfigurationReplicatedDisk.from_json(json)
# print the JSON string representation of the object
print(ReplicationConfigurationReplicatedDisk.to_json())

# convert the object into a dict
replication_configuration_replicated_disk_dict = replication_configuration_replicated_disk_instance.to_dict()
# create an instance of ReplicationConfigurationReplicatedDisk from a dict
replication_configuration_replicated_disk_from_dict = ReplicationConfigurationReplicatedDisk.from_dict(replication_configuration_replicated_disk_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


