# UpdateJobTemplateResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**job_template** | [**CreateJobTemplateResponseJobTemplate**](CreateJobTemplateResponseJobTemplate.md) |  | [optional] 

## Example

```python
from openapi_client.models.update_job_template_response import UpdateJobTemplateResponse

# TODO update the JSON string below
json = "{}"
# create an instance of UpdateJobTemplateResponse from a JSON string
update_job_template_response_instance = UpdateJobTemplateResponse.from_json(json)
# print the JSON string representation of the object
print(UpdateJobTemplateResponse.to_json())

# convert the object into a dict
update_job_template_response_dict = update_job_template_response_instance.to_dict()
# create an instance of UpdateJobTemplateResponse from a dict
update_job_template_response_from_dict = UpdateJobTemplateResponse.from_dict(update_job_template_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


