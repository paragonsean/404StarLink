# GetSegmentsResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**segments_response** | [**SegmentsResponse**](SegmentsResponse.md) |  | 

## Example

```python
from openapi_client.models.get_segments_response import GetSegmentsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of GetSegmentsResponse from a JSON string
get_segments_response_instance = GetSegmentsResponse.from_json(json)
# print the JSON string representation of the object
print(GetSegmentsResponse.to_json())

# convert the object into a dict
get_segments_response_dict = get_segments_response_instance.to_dict()
# create an instance of GetSegmentsResponse from a dict
get_segments_response_from_dict = GetSegmentsResponse.from_dict(get_segments_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


