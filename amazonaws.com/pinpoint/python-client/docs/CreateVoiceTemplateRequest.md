# CreateVoiceTemplateRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**voice_template_request** | [**VoiceTemplateRequest**](VoiceTemplateRequest.md) |  | 

## Example

```python
from openapi_client.models.create_voice_template_request import CreateVoiceTemplateRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CreateVoiceTemplateRequest from a JSON string
create_voice_template_request_instance = CreateVoiceTemplateRequest.from_json(json)
# print the JSON string representation of the object
print(CreateVoiceTemplateRequest.to_json())

# convert the object into a dict
create_voice_template_request_dict = create_voice_template_request_instance.to_dict()
# create an instance of CreateVoiceTemplateRequest from a dict
create_voice_template_request_from_dict = CreateVoiceTemplateRequest.from_dict(create_voice_template_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


