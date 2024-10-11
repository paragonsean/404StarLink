# ListPresetsResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**next_token** | **str** |  | [optional] 
**presets** | **List** |  | [optional] 

## Example

```python
from openapi_client.models.list_presets_response import ListPresetsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of ListPresetsResponse from a JSON string
list_presets_response_instance = ListPresetsResponse.from_json(json)
# print the JSON string representation of the object
print(ListPresetsResponse.to_json())

# convert the object into a dict
list_presets_response_dict = list_presets_response_instance.to_dict()
# create an instance of ListPresetsResponse from a dict
list_presets_response_from_dict = ListPresetsResponse.from_dict(list_presets_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


