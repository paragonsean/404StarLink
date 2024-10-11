# ListWorkerResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**meta** | [**ListWorkspaceResponseMeta**](ListWorkspaceResponseMeta.md) |  | [optional] 
**workers** | [**List[TaskrouterV1WorkspaceWorker]**](TaskrouterV1WorkspaceWorker.md) |  | [optional] 

## Example

```python
from openapi_client.models.list_worker_response import ListWorkerResponse

# TODO update the JSON string below
json = "{}"
# create an instance of ListWorkerResponse from a JSON string
list_worker_response_instance = ListWorkerResponse.from_json(json)
# print the JSON string representation of the object
print(ListWorkerResponse.to_json())

# convert the object into a dict
list_worker_response_dict = list_worker_response_instance.to_dict()
# create an instance of ListWorkerResponse from a dict
list_worker_response_from_dict = ListWorkerResponse.from_dict(list_worker_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


