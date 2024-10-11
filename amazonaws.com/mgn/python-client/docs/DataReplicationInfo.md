# DataReplicationInfo

Request data replication info.

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
from openapi_client.models.data_replication_info import DataReplicationInfo

# TODO update the JSON string below
json = "{}"
# create an instance of DataReplicationInfo from a JSON string
data_replication_info_instance = DataReplicationInfo.from_json(json)
# print the JSON string representation of the object
print(DataReplicationInfo.to_json())

# convert the object into a dict
data_replication_info_dict = data_replication_info_instance.to_dict()
# create an instance of DataReplicationInfo from a dict
data_replication_info_from_dict = DataReplicationInfo.from_dict(data_replication_info_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


