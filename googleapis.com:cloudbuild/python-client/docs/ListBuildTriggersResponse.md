# ListBuildTriggersResponse

Response containing existing `BuildTriggers`.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**next_page_token** | **str** | Token to receive the next page of results. | [optional] 
**triggers** | [**List[BuildTrigger]**](BuildTrigger.md) | &#x60;BuildTriggers&#x60; for the project, sorted by &#x60;create_time&#x60; descending. | [optional] 

## Example

```python
from openapi_client.models.list_build_triggers_response import ListBuildTriggersResponse

# TODO update the JSON string below
json = "{}"
# create an instance of ListBuildTriggersResponse from a JSON string
list_build_triggers_response_instance = ListBuildTriggersResponse.from_json(json)
# print the JSON string representation of the object
print(ListBuildTriggersResponse.to_json())

# convert the object into a dict
list_build_triggers_response_dict = list_build_triggers_response_instance.to_dict()
# create an instance of ListBuildTriggersResponse from a dict
list_build_triggers_response_from_dict = ListBuildTriggersResponse.from_dict(list_build_triggers_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


