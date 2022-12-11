# RegeneratePreviewResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**link** | [**Href**](Href.md) |  | [optional] 
**source** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.regenerate_preview_response import RegeneratePreviewResponse

# TODO update the JSON string below
json = "{}"
# create an instance of RegeneratePreviewResponse from a JSON string
regenerate_preview_response_instance = RegeneratePreviewResponse.from_json(json)
# print the JSON string representation of the object
print(RegeneratePreviewResponse.to_json())

# convert the object into a dict
regenerate_preview_response_dict = regenerate_preview_response_instance.to_dict()
# create an instance of RegeneratePreviewResponse from a dict
regenerate_preview_response_from_dict = RegeneratePreviewResponse.from_dict(regenerate_preview_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


