# GetSegmentVersionsResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**segments_response** | [**SegmentsResponse**](SegmentsResponse.md) |  | 

## Example

```python
from openapi_client.models.get_segment_versions_response import GetSegmentVersionsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of GetSegmentVersionsResponse from a JSON string
get_segment_versions_response_instance = GetSegmentVersionsResponse.from_json(json)
# print the JSON string representation of the object
print(GetSegmentVersionsResponse.to_json())

# convert the object into a dict
get_segment_versions_response_dict = get_segment_versions_response_instance.to_dict()
# create an instance of GetSegmentVersionsResponse from a dict
get_segment_versions_response_from_dict = GetSegmentVersionsResponse.from_dict(get_segment_versions_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


