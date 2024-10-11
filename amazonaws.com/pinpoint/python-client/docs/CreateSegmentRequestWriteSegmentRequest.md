# CreateSegmentRequestWriteSegmentRequest

Specifies the configuration, dimension, and other settings for a segment. A WriteSegmentRequest object can include a Dimensions object or a SegmentGroups object, but not both.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dimensions** | [**CreateSegmentRequestWriteSegmentRequestDimensions**](CreateSegmentRequestWriteSegmentRequestDimensions.md) |  | [optional] 
**name** | **str** |  | [optional] 
**segment_groups** | [**CreateSegmentRequestWriteSegmentRequestSegmentGroups**](CreateSegmentRequestWriteSegmentRequestSegmentGroups.md) |  | [optional] 
**tags** | **Dict** |  | [optional] 

## Example

```python
from openapi_client.models.create_segment_request_write_segment_request import CreateSegmentRequestWriteSegmentRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CreateSegmentRequestWriteSegmentRequest from a JSON string
create_segment_request_write_segment_request_instance = CreateSegmentRequestWriteSegmentRequest.from_json(json)
# print the JSON string representation of the object
print(CreateSegmentRequestWriteSegmentRequest.to_json())

# convert the object into a dict
create_segment_request_write_segment_request_dict = create_segment_request_write_segment_request_instance.to_dict()
# create an instance of CreateSegmentRequestWriteSegmentRequest from a dict
create_segment_request_write_segment_request_from_dict = CreateSegmentRequestWriteSegmentRequest.from_dict(create_segment_request_write_segment_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


