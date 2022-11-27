# ImportJobResponseDefinition


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**define_segment** | **bool** |  | [optional] 
**external_id** | **str** |  | [optional] 
**format** | [**Format**](Format.md) |  | 
**register_endpoints** | **bool** |  | [optional] 
**role_arn** | **str** |  | 
**s3_url** | **str** |  | 
**segment_id** | **str** |  | [optional] 
**segment_name** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.import_job_response_definition import ImportJobResponseDefinition

# TODO update the JSON string below
json = "{}"
# create an instance of ImportJobResponseDefinition from a JSON string
import_job_response_definition_instance = ImportJobResponseDefinition.from_json(json)
# print the JSON string representation of the object
print(ImportJobResponseDefinition.to_json())

# convert the object into a dict
import_job_response_definition_dict = import_job_response_definition_instance.to_dict()
# create an instance of ImportJobResponseDefinition from a dict
import_job_response_definition_from_dict = ImportJobResponseDefinition.from_dict(import_job_response_definition_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


