# DataReplicationInfoReplicatedDisk

Request to query disks replicated.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**backlogged_storage_bytes** | **int** |  | [optional] 
**device_name** | **str** |  | [optional] 
**replicated_storage_bytes** | **int** |  | [optional] 
**rescanned_storage_bytes** | **int** |  | [optional] 
**total_storage_bytes** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.data_replication_info_replicated_disk import DataReplicationInfoReplicatedDisk

# TODO update the JSON string below
json = "{}"
# create an instance of DataReplicationInfoReplicatedDisk from a JSON string
data_replication_info_replicated_disk_instance = DataReplicationInfoReplicatedDisk.from_json(json)
# print the JSON string representation of the object
print(DataReplicationInfoReplicatedDisk.to_json())

# convert the object into a dict
data_replication_info_replicated_disk_dict = data_replication_info_replicated_disk_instance.to_dict()
# create an instance of DataReplicationInfoReplicatedDisk from a dict
data_replication_info_replicated_disk_from_dict = DataReplicationInfoReplicatedDisk.from_dict(data_replication_info_replicated_disk_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


