# CreateJobTemplateResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**job_template** | [**CreateJobTemplateResponseJobTemplate**](CreateJobTemplateResponseJobTemplate.md) |  | [optional] 

## Example

```python
from openapi_client.models.create_job_template_response import CreateJobTemplateResponse

# TODO update the JSON string below
json = "{}"
# create an instance of CreateJobTemplateResponse from a JSON string
create_job_template_response_instance = CreateJobTemplateResponse.from_json(json)
# print the JSON string representation of the object
print(CreateJobTemplateResponse.to_json())

# convert the object into a dict
create_job_template_response_dict = create_job_template_response_instance.to_dict()
# create an instance of CreateJobTemplateResponse from a dict
create_job_template_response_from_dict = CreateJobTemplateResponse.from_dict(create_job_template_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


