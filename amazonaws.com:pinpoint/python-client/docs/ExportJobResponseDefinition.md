# ExportJobResponseDefinition


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**role_arn** | **str** |  | 
**s3_url_prefix** | **str** |  | 
**segment_id** | **str** |  | [optional] 
**segment_version** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.export_job_response_definition import ExportJobResponseDefinition

# TODO update the JSON string below
json = "{}"
# create an instance of ExportJobResponseDefinition from a JSON string
export_job_response_definition_instance = ExportJobResponseDefinition.from_json(json)
# print the JSON string representation of the object
print(ExportJobResponseDefinition.to_json())

# convert the object into a dict
export_job_response_definition_dict = export_job_response_definition_instance.to_dict()
# create an instance of ExportJobResponseDefinition from a dict
export_job_response_definition_from_dict = ExportJobResponseDefinition.from_dict(export_job_response_definition_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


