# CreateInAppTemplateRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**in_app_template_request** | [**InAppTemplateRequest**](InAppTemplateRequest.md) |  | 

## Example

```python
from openapi_client.models.create_in_app_template_request import CreateInAppTemplateRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CreateInAppTemplateRequest from a JSON string
create_in_app_template_request_instance = CreateInAppTemplateRequest.from_json(json)
# print the JSON string representation of the object
print(CreateInAppTemplateRequest.to_json())

# convert the object into a dict
create_in_app_template_request_dict = create_in_app_template_request_instance.to_dict()
# create an instance of CreateInAppTemplateRequest from a dict
create_in_app_template_request_from_dict = CreateInAppTemplateRequest.from_dict(create_in_app_template_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


