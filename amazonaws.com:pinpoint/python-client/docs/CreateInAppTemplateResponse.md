# CreateInAppTemplateResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**template_create_message_body** | [**TemplateCreateMessageBody**](TemplateCreateMessageBody.md) |  | 

## Example

```python
from openapi_client.models.create_in_app_template_response import CreateInAppTemplateResponse

# TODO update the JSON string below
json = "{}"
# create an instance of CreateInAppTemplateResponse from a JSON string
create_in_app_template_response_instance = CreateInAppTemplateResponse.from_json(json)
# print the JSON string representation of the object
print(CreateInAppTemplateResponse.to_json())

# convert the object into a dict
create_in_app_template_response_dict = create_in_app_template_response_instance.to_dict()
# create an instance of CreateInAppTemplateResponse from a dict
create_in_app_template_response_from_dict = CreateInAppTemplateResponse.from_dict(create_in_app_template_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


