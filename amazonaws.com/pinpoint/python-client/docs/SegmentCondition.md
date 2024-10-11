# SegmentCondition

Specifies a segment to associate with an activity in a journey.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**segment_id** | **str** |  | 

## Example

```python
from openapi_client.models.segment_condition import SegmentCondition

# TODO update the JSON string below
json = "{}"
# create an instance of SegmentCondition from a JSON string
segment_condition_instance = SegmentCondition.from_json(json)
# print the JSON string representation of the object
print(SegmentCondition.to_json())

# convert the object into a dict
segment_condition_dict = segment_condition_instance.to_dict()
# create an instance of SegmentCondition from a dict
segment_condition_from_dict = SegmentCondition.from_dict(segment_condition_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


