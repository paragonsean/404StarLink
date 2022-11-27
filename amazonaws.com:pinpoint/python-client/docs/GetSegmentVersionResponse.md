# GetSegmentVersionResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**segment_response** | [**SegmentResponse**](SegmentResponse.md) |  | 

## Example

```python
from openapi_client.models.get_segment_version_response import GetSegmentVersionResponse

# TODO update the JSON string below
json = "{}"
# create an instance of GetSegmentVersionResponse from a JSON string
get_segment_version_response_instance = GetSegmentVersionResponse.from_json(json)
# print the JSON string representation of the object
print(GetSegmentVersionResponse.to_json())

# convert the object into a dict
get_segment_version_response_dict = get_segment_version_response_instance.to_dict()
# create an instance of GetSegmentVersionResponse from a dict
get_segment_version_response_from_dict = GetSegmentVersionResponse.from_dict(get_segment_version_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


