# SegmentBehaviors

Specifies dimension settings for including or excluding endpoints from a segment based on how recently an endpoint was active.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**recency** | [**SegmentBehaviorsRecency**](SegmentBehaviorsRecency.md) |  | [optional] 

## Example

```python
from openapi_client.models.segment_behaviors import SegmentBehaviors

# TODO update the JSON string below
json = "{}"
# create an instance of SegmentBehaviors from a JSON string
segment_behaviors_instance = SegmentBehaviors.from_json(json)
# print the JSON string representation of the object
print(SegmentBehaviors.to_json())

# convert the object into a dict
segment_behaviors_dict = segment_behaviors_instance.to_dict()
# create an instance of SegmentBehaviors from a dict
segment_behaviors_from_dict = SegmentBehaviors.from_dict(segment_behaviors_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


