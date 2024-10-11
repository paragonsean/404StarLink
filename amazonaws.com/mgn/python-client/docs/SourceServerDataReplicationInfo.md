# SourceServerDataReplicationInfo


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**data_replication_error** | [**DataReplicationInfoDataReplicationError**](DataReplicationInfoDataReplicationError.md) |  | [optional] 
**data_replication_initiation** | [**DataReplicationInfoDataReplicationInitiation**](DataReplicationInfoDataReplicationInitiation.md) |  | [optional] 
**data_replication_state** | [**DataReplicationState**](DataReplicationState.md) |  | [optional] 
**eta_date_time** | **str** |  | [optional] 
**lag_duration** | **str** |  | [optional] 
**last_snapshot_date_time** | **str** |  | [optional] 
**replicated_disks** | **List** |  | [optional] 

## Example

```python
from openapi_client.models.source_server_data_replication_info import SourceServerDataReplicationInfo

# TODO update the JSON string below
json = "{}"
# create an instance of SourceServerDataReplicationInfo from a JSON string
source_server_data_replication_info_instance = SourceServerDataReplicationInfo.from_json(json)
# print the JSON string representation of the object
print(SourceServerDataReplicationInfo.to_json())

# convert the object into a dict
source_server_data_replication_info_dict = source_server_data_replication_info_instance.to_dict()
# create an instance of SourceServerDataReplicationInfo from a dict
source_server_data_replication_info_from_dict = SourceServerDataReplicationInfo.from_dict(source_server_data_replication_info_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


