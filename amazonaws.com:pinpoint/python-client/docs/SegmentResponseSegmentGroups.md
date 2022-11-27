# SegmentResponseSegmentGroups


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**groups** | **List** |  | [optional] 
**include** | [**Include**](Include.md) |  | [optional] 

## Example

```python
from openapi_client.models.segment_response_segment_groups import SegmentResponseSegmentGroups

# TODO update the JSON string below
json = "{}"
# create an instance of SegmentResponseSegmentGroups from a JSON string
segment_response_segment_groups_instance = SegmentResponseSegmentGroups.from_json(json)
# print the JSON string representation of the object
print(SegmentResponseSegmentGroups.to_json())

# convert the object into a dict
segment_response_segment_groups_dict = segment_response_segment_groups_instance.to_dict()
# create an instance of SegmentResponseSegmentGroups from a dict
segment_response_segment_groups_from_dict = SegmentResponseSegmentGroups.from_dict(segment_response_segment_groups_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


