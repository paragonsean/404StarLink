# DeleteSourceServerRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**source_server_id** | **str** | Request to delete Source Server from service by Server ID. | 

## Example

```python
from openapi_client.models.delete_source_server_request import DeleteSourceServerRequest

# TODO update the JSON string below
json = "{}"
# create an instance of DeleteSourceServerRequest from a JSON string
delete_source_server_request_instance = DeleteSourceServerRequest.from_json(json)
# print the JSON string representation of the object
print(DeleteSourceServerRequest.to_json())

# convert the object into a dict
delete_source_server_request_dict = delete_source_server_request_instance.to_dict()
# create an instance of DeleteSourceServerRequest from a dict
delete_source_server_request_from_dict = DeleteSourceServerRequest.from_dict(delete_source_server_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


