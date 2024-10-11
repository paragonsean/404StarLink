# ListWorkerChannelResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**channels** | [**List[TaskrouterV1WorkspaceWorkerWorkerChannel]**](TaskrouterV1WorkspaceWorkerWorkerChannel.md) |  | [optional] 
**meta** | [**ListWorkspaceResponseMeta**](ListWorkspaceResponseMeta.md) |  | [optional] 

## Example

```python
from openapi_client.models.list_worker_channel_response import ListWorkerChannelResponse

# TODO update the JSON string below
json = "{}"
# create an instance of ListWorkerChannelResponse from a JSON string
list_worker_channel_response_instance = ListWorkerChannelResponse.from_json(json)
# print the JSON string representation of the object
print(ListWorkerChannelResponse.to_json())

# convert the object into a dict
list_worker_channel_response_dict = list_worker_channel_response_instance.to_dict()
# create an instance of ListWorkerChannelResponse from a dict
list_worker_channel_response_from_dict = ListWorkerChannelResponse.from_dict(list_worker_channel_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


