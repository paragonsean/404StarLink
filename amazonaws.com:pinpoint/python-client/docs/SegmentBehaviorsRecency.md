# SegmentBehaviorsRecency


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**duration** | [**Duration**](Duration.md) |  | 
**recency_type** | [**RecencyType**](RecencyType.md) |  | 

## Example

```python
from openapi_client.models.segment_behaviors_recency import SegmentBehaviorsRecency

# TODO update the JSON string below
json = "{}"
# create an instance of SegmentBehaviorsRecency from a JSON string
segment_behaviors_recency_instance = SegmentBehaviorsRecency.from_json(json)
# print the JSON string representation of the object
print(SegmentBehaviorsRecency.to_json())

# convert the object into a dict
segment_behaviors_recency_dict = segment_behaviors_recency_instance.to_dict()
# create an instance of SegmentBehaviorsRecency from a dict
segment_behaviors_recency_from_dict = SegmentBehaviorsRecency.from_dict(segment_behaviors_recency_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


