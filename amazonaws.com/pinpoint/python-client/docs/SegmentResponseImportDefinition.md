# SegmentResponseImportDefinition


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**channel_counts** | **Dict** |  | [optional] 
**external_id** | **str** |  | 
**format** | [**Format**](Format.md) |  | 
**role_arn** | **str** |  | 
**s3_url** | **str** |  | 
**size** | **int** |  | 

## Example

```python
from openapi_client.models.segment_response_import_definition import SegmentResponseImportDefinition

# TODO update the JSON string below
json = "{}"
# create an instance of SegmentResponseImportDefinition from a JSON string
segment_response_import_definition_instance = SegmentResponseImportDefinition.from_json(json)
# print the JSON string representation of the object
print(SegmentResponseImportDefinition.to_json())

# convert the object into a dict
segment_response_import_definition_dict = segment_response_import_definition_instance.to_dict()
# create an instance of SegmentResponseImportDefinition from a dict
segment_response_import_definition_from_dict = SegmentResponseImportDefinition.from_dict(segment_response_import_definition_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


