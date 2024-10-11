# UpdateVoiceTemplateRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**voice_template_request** | [**UpdateVoiceTemplateRequestVoiceTemplateRequest**](UpdateVoiceTemplateRequestVoiceTemplateRequest.md) |  | 

## Example

```python
from openapi_client.models.update_voice_template_request import UpdateVoiceTemplateRequest

# TODO update the JSON string below
json = "{}"
# create an instance of UpdateVoiceTemplateRequest from a JSON string
update_voice_template_request_instance = UpdateVoiceTemplateRequest.from_json(json)
# print the JSON string representation of the object
print(UpdateVoiceTemplateRequest.to_json())

# convert the object into a dict
update_voice_template_request_dict = update_voice_template_request_instance.to_dict()
# create an instance of UpdateVoiceTemplateRequest from a dict
update_voice_template_request_from_dict = UpdateVoiceTemplateRequest.from_dict(update_voice_template_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


