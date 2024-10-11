# GetJobTemplateResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**job_template** | [**CreateJobTemplateResponseJobTemplate**](CreateJobTemplateResponseJobTemplate.md) |  | [optional] 

## Example

```python
from openapi_client.models.get_job_template_response import GetJobTemplateResponse

# TODO update the JSON string below
json = "{}"
# create an instance of GetJobTemplateResponse from a JSON string
get_job_template_response_instance = GetJobTemplateResponse.from_json(json)
# print the JSON string representation of the object
print(GetJobTemplateResponse.to_json())

# convert the object into a dict
get_job_template_response_dict = get_job_template_response_instance.to_dict()
# create an instance of GetJobTemplateResponse from a dict
get_job_template_response_from_dict = GetJobTemplateResponse.from_dict(get_job_template_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


