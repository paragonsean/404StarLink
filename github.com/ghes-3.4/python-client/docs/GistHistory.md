# GistHistory

Gist History

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**change_status** | [**CommitStats**](CommitStats.md) |  | [optional] 
**committed_at** | **datetime** |  | [optional] 
**url** | **str** |  | [optional] 
**user** | [**NullableSimpleUser**](NullableSimpleUser.md) |  | [optional] 
**version** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.gist_history import GistHistory

# TODO update the JSON string below
json = "{}"
# create an instance of GistHistory from a JSON string
gist_history_instance = GistHistory.from_json(json)
# print the JSON string representation of the object
print(GistHistory.to_json())

# convert the object into a dict
gist_history_dict = gist_history_instance.to_dict()
# create an instance of GistHistory from a dict
gist_history_from_dict = GistHistory.from_dict(gist_history_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


