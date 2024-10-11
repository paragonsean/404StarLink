# StartReplicationRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**source_server_id** | **str** | ID of source server on which to start replication. | 

## Example

```python
from openapi_client.models.start_replication_request import StartReplicationRequest

# TODO update the JSON string below
json = "{}"
# create an instance of StartReplicationRequest from a JSON string
start_replication_request_instance = StartReplicationRequest.from_json(json)
# print the JSON string representation of the object
print(StartReplicationRequest.to_json())

# convert the object into a dict
start_replication_request_dict = start_replication_request_instance.to_dict()
# create an instance of StartReplicationRequest from a dict
start_replication_request_from_dict = StartReplicationRequest.from_dict(start_replication_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


