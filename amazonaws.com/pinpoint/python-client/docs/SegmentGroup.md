# SegmentGroup

Specifies the base segments and dimensions for a segment, and the relationships between these base segments and dimensions.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dimensions** | **List** |  | [optional] 
**source_segments** | **List** |  | [optional] 
**source_type** | [**SourceType**](SourceType.md) |  | [optional] 
**type** | [**Type**](Type.md) |  | [optional] 

## Example

```python
from openapi_client.models.segment_group import SegmentGroup

# TODO update the JSON string below
json = "{}"
# create an instance of SegmentGroup from a JSON string
segment_group_instance = SegmentGroup.from_json(json)
# print the JSON string representation of the object
print(SegmentGroup.to_json())

# convert the object into a dict
segment_group_dict = segment_group_instance.to_dict()
# create an instance of SegmentGroup from a dict
segment_group_from_dict = SegmentGroup.from_dict(segment_group_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


