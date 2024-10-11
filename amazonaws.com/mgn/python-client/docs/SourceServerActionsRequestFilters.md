# SourceServerActionsRequestFilters

Source server post migration custom action filters.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action_ids** | **List** |  | [optional] 

## Example

```python
from openapi_client.models.source_server_actions_request_filters import SourceServerActionsRequestFilters

# TODO update the JSON string below
json = "{}"
# create an instance of SourceServerActionsRequestFilters from a JSON string
source_server_actions_request_filters_instance = SourceServerActionsRequestFilters.from_json(json)
# print the JSON string representation of the object
print(SourceServerActionsRequestFilters.to_json())

# convert the object into a dict
source_server_actions_request_filters_dict = source_server_actions_request_filters_instance.to_dict()
# create an instance of SourceServerActionsRequestFilters from a dict
source_server_actions_request_filters_from_dict = SourceServerActionsRequestFilters.from_dict(source_server_actions_request_filters_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


