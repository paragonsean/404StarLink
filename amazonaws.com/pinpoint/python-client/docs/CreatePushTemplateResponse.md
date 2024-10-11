# CreatePushTemplateResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**create_template_message_body** | [**CreateTemplateMessageBody**](CreateTemplateMessageBody.md) |  | 

## Example

```python
from openapi_client.models.create_push_template_response import CreatePushTemplateResponse

# TODO update the JSON string below
json = "{}"
# create an instance of CreatePushTemplateResponse from a JSON string
create_push_template_response_instance = CreatePushTemplateResponse.from_json(json)
# print the JSON string representation of the object
print(CreatePushTemplateResponse.to_json())

# convert the object into a dict
create_push_template_response_dict = create_push_template_response_instance.to_dict()
# create an instance of CreatePushTemplateResponse from a dict
create_push_template_response_from_dict = CreatePushTemplateResponse.from_dict(create_push_template_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


