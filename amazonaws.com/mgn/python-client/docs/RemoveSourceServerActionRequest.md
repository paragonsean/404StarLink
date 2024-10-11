# RemoveSourceServerActionRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action_id** | **str** | Source server post migration custom action ID to remove. | 
**source_server_id** | **str** | Source server ID of the post migration custom action to remove. | 

## Example

```python
from openapi_client.models.remove_source_server_action_request import RemoveSourceServerActionRequest

# TODO update the JSON string below
json = "{}"
# create an instance of RemoveSourceServerActionRequest from a JSON string
remove_source_server_action_request_instance = RemoveSourceServerActionRequest.from_json(json)
# print the JSON string representation of the object
print(RemoveSourceServerActionRequest.to_json())

# convert the object into a dict
remove_source_server_action_request_dict = remove_source_server_action_request_instance.to_dict()
# create an instance of RemoveSourceServerActionRequest from a dict
remove_source_server_action_request_from_dict = RemoveSourceServerActionRequest.from_dict(remove_source_server_action_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


