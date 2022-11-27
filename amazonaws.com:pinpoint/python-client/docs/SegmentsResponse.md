# SegmentsResponse

Provides information about all the segments that are associated with an application.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**item** | **List** |  | 
**next_token** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.segments_response import SegmentsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of SegmentsResponse from a JSON string
segments_response_instance = SegmentsResponse.from_json(json)
# print the JSON string representation of the object
print(SegmentsResponse.to_json())

# convert the object into a dict
segments_response_dict = segments_response_instance.to_dict()
# create an instance of SegmentsResponse from a dict
segments_response_from_dict = SegmentsResponse.from_dict(segments_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


