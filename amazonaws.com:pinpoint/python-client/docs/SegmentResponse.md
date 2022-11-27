# SegmentResponse

Provides information about the configuration, dimension, and other settings for a segment.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**application_id** | **str** |  | 
**arn** | **str** |  | 
**creation_date** | **str** |  | 
**dimensions** | [**SegmentResponseDimensions**](SegmentResponseDimensions.md) |  | [optional] 
**id** | **str** |  | 
**import_definition** | [**SegmentResponseImportDefinition**](SegmentResponseImportDefinition.md) |  | [optional] 
**last_modified_date** | **str** |  | [optional] 
**name** | **str** |  | [optional] 
**segment_groups** | [**SegmentResponseSegmentGroups**](SegmentResponseSegmentGroups.md) |  | [optional] 
**segment_type** | [**SegmentType**](SegmentType.md) |  | 
**tags** | **Dict** |  | [optional] 
**version** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.segment_response import SegmentResponse

# TODO update the JSON string below
json = "{}"
# create an instance of SegmentResponse from a JSON string
segment_response_instance = SegmentResponse.from_json(json)
# print the JSON string representation of the object
print(SegmentResponse.to_json())

# convert the object into a dict
segment_response_dict = segment_response_instance.to_dict()
# create an instance of SegmentResponse from a dict
segment_response_from_dict = SegmentResponse.from_dict(segment_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


