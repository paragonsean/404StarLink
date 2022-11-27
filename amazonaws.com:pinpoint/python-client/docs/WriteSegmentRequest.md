# WriteSegmentRequest

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
from openapi_client.models.write_segment_request import WriteSegmentRequest

# TODO update the JSON string below
json = "{}"
# create an instance of WriteSegmentRequest from a JSON string
write_segment_request_instance = WriteSegmentRequest.from_json(json)
# print the JSON string representation of the object
print(WriteSegmentRequest.to_json())

# convert the object into a dict
write_segment_request_dict = write_segment_request_instance.to_dict()
# create an instance of WriteSegmentRequest from a dict
write_segment_request_from_dict = WriteSegmentRequest.from_dict(write_segment_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


