# SegmentImportResource

Provides information about the import job that created a segment. An import job is a job that creates a user segment by importing endpoint definitions.

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
from openapi_client.models.segment_import_resource import SegmentImportResource

# TODO update the JSON string below
json = "{}"
# create an instance of SegmentImportResource from a JSON string
segment_import_resource_instance = SegmentImportResource.from_json(json)
# print the JSON string representation of the object
print(SegmentImportResource.to_json())

# convert the object into a dict
segment_import_resource_dict = segment_import_resource_instance.to_dict()
# create an instance of SegmentImportResource from a dict
segment_import_resource_from_dict = SegmentImportResource.from_dict(segment_import_resource_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


