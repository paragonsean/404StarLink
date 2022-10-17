# ListJobTemplatesResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**job_templates** | **List** |  | [optional] 
**next_token** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.list_job_templates_response import ListJobTemplatesResponse

# TODO update the JSON string below
json = "{}"
# create an instance of ListJobTemplatesResponse from a JSON string
list_job_templates_response_instance = ListJobTemplatesResponse.from_json(json)
# print the JSON string representation of the object
print(ListJobTemplatesResponse.to_json())

# convert the object into a dict
list_job_templates_response_dict = list_job_templates_response_instance.to_dict()
# create an instance of ListJobTemplatesResponse from a dict
list_job_templates_response_from_dict = ListJobTemplatesResponse.from_dict(list_job_templates_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


