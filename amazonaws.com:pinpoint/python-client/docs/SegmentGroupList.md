# SegmentGroupList

Specifies the settings that define the relationships between segment groups for a segment.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**groups** | **List** |  | [optional] 
**include** | [**Include**](Include.md) |  | [optional] 

## Example

```python
from openapi_client.models.segment_group_list import SegmentGroupList

# TODO update the JSON string below
json = "{}"
# create an instance of SegmentGroupList from a JSON string
segment_group_list_instance = SegmentGroupList.from_json(json)
# print the JSON string representation of the object
print(SegmentGroupList.to_json())

# convert the object into a dict
segment_group_list_dict = segment_group_list_instance.to_dict()
# create an instance of SegmentGroupList from a dict
segment_group_list_from_dict = SegmentGroupList.from_dict(segment_group_list_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


