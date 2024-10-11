# DataReplicationInfoDataReplicationError


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**error** | [**DataReplicationErrorString**](DataReplicationErrorString.md) |  | [optional] 
**raw_error** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.data_replication_info_data_replication_error import DataReplicationInfoDataReplicationError

# TODO update the JSON string below
json = "{}"
# create an instance of DataReplicationInfoDataReplicationError from a JSON string
data_replication_info_data_replication_error_instance = DataReplicationInfoDataReplicationError.from_json(json)
# print the JSON string representation of the object
print(DataReplicationInfoDataReplicationError.to_json())

# convert the object into a dict
data_replication_info_data_replication_error_dict = data_replication_info_data_replication_error_instance.to_dict()
# create an instance of DataReplicationInfoDataReplicationError from a dict
data_replication_info_data_replication_error_from_dict = DataReplicationInfoDataReplicationError.from_dict(data_replication_info_data_replication_error_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


