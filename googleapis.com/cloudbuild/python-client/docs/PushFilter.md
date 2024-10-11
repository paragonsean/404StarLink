# PushFilter

Push contains filter properties for matching GitHub git pushes.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**branch** | **str** | Regexes matching branches to build. The syntax of the regular expressions accepted is the syntax accepted by RE2 and described at https://github.com/google/re2/wiki/Syntax | [optional] 
**invert_regex** | **bool** | When true, only trigger a build if the revision regex does NOT match the git_ref regex. | [optional] 
**tag** | **str** | Regexes matching tags to build. The syntax of the regular expressions accepted is the syntax accepted by RE2 and described at https://github.com/google/re2/wiki/Syntax | [optional] 

## Example

```python
from openapi_client.models.push_filter import PushFilter

# TODO update the JSON string below
json = "{}"
# create an instance of PushFilter from a JSON string
push_filter_instance = PushFilter.from_json(json)
# print the JSON string representation of the object
print(PushFilter.to_json())

# convert the object into a dict
push_filter_dict = push_filter_instance.to_dict()
# create an instance of PushFilter from a dict
push_filter_from_dict = PushFilter.from_dict(push_filter_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


