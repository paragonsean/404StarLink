# DeletePushTemplateResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**message_body** | [**MessageBody**](MessageBody.md) |  | 

## Example

```python
from openapi_client.models.delete_push_template_response import DeletePushTemplateResponse

# TODO update the JSON string below
json = "{}"
# create an instance of DeletePushTemplateResponse from a JSON string
delete_push_template_response_instance = DeletePushTemplateResponse.from_json(json)
# print the JSON string representation of the object
print(DeletePushTemplateResponse.to_json())

# convert the object into a dict
delete_push_template_response_dict = delete_push_template_response_instance.to_dict()
# create an instance of DeletePushTemplateResponse from a dict
delete_push_template_response_from_dict = DeletePushTemplateResponse.from_dict(delete_push_template_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


