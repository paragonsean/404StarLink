# CheckAnnotation

Check Annotation

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**annotation_level** | **str** |  | 
**blob_href** | **str** |  | 
**end_column** | **int** |  | 
**end_line** | **int** |  | 
**message** | **str** |  | 
**path** | **str** |  | 
**raw_details** | **str** |  | 
**start_column** | **int** |  | 
**start_line** | **int** |  | 
**title** | **str** |  | 

## Example

```python
from openapi_client.models.check_annotation import CheckAnnotation

# TODO update the JSON string below
json = "{}"
# create an instance of CheckAnnotation from a JSON string
check_annotation_instance = CheckAnnotation.from_json(json)
# print the JSON string representation of the object
print(CheckAnnotation.to_json())

# convert the object into a dict
check_annotation_dict = check_annotation_instance.to_dict()
# create an instance of CheckAnnotation from a dict
check_annotation_from_dict = CheckAnnotation.from_dict(check_annotation_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


