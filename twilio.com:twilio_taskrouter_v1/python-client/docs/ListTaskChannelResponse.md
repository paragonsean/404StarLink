# ListTaskChannelResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**channels** | [**List[TaskrouterV1WorkspaceTaskChannel]**](TaskrouterV1WorkspaceTaskChannel.md) |  | [optional] 
**meta** | [**ListWorkspaceResponseMeta**](ListWorkspaceResponseMeta.md) |  | [optional] 

## Example

```python
from openapi_client.models.list_task_channel_response import ListTaskChannelResponse

# TODO update the JSON string below
json = "{}"
# create an instance of ListTaskChannelResponse from a JSON string
list_task_channel_response_instance = ListTaskChannelResponse.from_json(json)
# print the JSON string representation of the object
print(ListTaskChannelResponse.to_json())

# convert the object into a dict
list_task_channel_response_dict = list_task_channel_response_instance.to_dict()
# create an instance of ListTaskChannelResponse from a dict
list_task_channel_response_from_dict = ListTaskChannelResponse.from_dict(list_task_channel_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


