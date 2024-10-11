# CreateSegmentRequestWriteSegmentRequestDimensions


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributes** | **Dict** |  | [optional] 
**behavior** | [**SegmentDimensionsBehavior**](SegmentDimensionsBehavior.md) |  | [optional] 
**demographic** | [**SegmentDimensionsDemographic**](SegmentDimensionsDemographic.md) |  | [optional] 
**location** | [**SegmentDimensionsLocation**](SegmentDimensionsLocation.md) |  | [optional] 
**metrics** | **Dict** |  | [optional] 
**user_attributes** | **Dict** |  | [optional] 

## Example

```python
from openapi_client.models.create_segment_request_write_segment_request_dimensions import CreateSegmentRequestWriteSegmentRequestDimensions

# TODO update the JSON string below
json = "{}"
# create an instance of CreateSegmentRequestWriteSegmentRequestDimensions from a JSON string
create_segment_request_write_segment_request_dimensions_instance = CreateSegmentRequestWriteSegmentRequestDimensions.from_json(json)
# print the JSON string representation of the object
print(CreateSegmentRequestWriteSegmentRequestDimensions.to_json())

# convert the object into a dict
create_segment_request_write_segment_request_dimensions_dict = create_segment_request_write_segment_request_dimensions_instance.to_dict()
# create an instance of CreateSegmentRequestWriteSegmentRequestDimensions from a dict
create_segment_request_write_segment_request_dimensions_from_dict = CreateSegmentRequestWriteSegmentRequestDimensions.from_dict(create_segment_request_write_segment_request_dimensions_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


