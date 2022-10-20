# UpdateSourceServerReplicationTypeRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**replication_type** | **str** | Replication type to which to update source server. | 
**source_server_id** | **str** | ID of source server on which to update replication type. | 

## Example

```python
from openapi_client.models.update_source_server_replication_type_request import UpdateSourceServerReplicationTypeRequest

# TODO update the JSON string below
json = "{}"
# create an instance of UpdateSourceServerReplicationTypeRequest from a JSON string
update_source_server_replication_type_request_instance = UpdateSourceServerReplicationTypeRequest.from_json(json)
# print the JSON string representation of the object
print(UpdateSourceServerReplicationTypeRequest.to_json())

# convert the object into a dict
update_source_server_replication_type_request_dict = update_source_server_replication_type_request_instance.to_dict()
# create an instance of UpdateSourceServerReplicationTypeRequest from a dict
update_source_server_replication_type_request_from_dict = UpdateSourceServerReplicationTypeRequest.from_dict(update_source_server_replication_type_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


