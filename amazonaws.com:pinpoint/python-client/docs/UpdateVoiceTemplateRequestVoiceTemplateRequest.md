# UpdateVoiceTemplateRequestVoiceTemplateRequest

Specifies the content and settings for a message template that can be used in messages that are sent through the voice channel.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**body** | **str** |  | [optional] 
**default_substitutions** | **str** |  | [optional] 
**language_code** | **str** |  | [optional] 
**tags** | **Dict** |  | [optional] 
**template_description** | **str** |  | [optional] 
**voice_id** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.update_voice_template_request_voice_template_request import UpdateVoiceTemplateRequestVoiceTemplateRequest

# TODO update the JSON string below
json = "{}"
# create an instance of UpdateVoiceTemplateRequestVoiceTemplateRequest from a JSON string
update_voice_template_request_voice_template_request_instance = UpdateVoiceTemplateRequestVoiceTemplateRequest.from_json(json)
# print the JSON string representation of the object
print(UpdateVoiceTemplateRequestVoiceTemplateRequest.to_json())

# convert the object into a dict
update_voice_template_request_voice_template_request_dict = update_voice_template_request_voice_template_request_instance.to_dict()
# create an instance of UpdateVoiceTemplateRequestVoiceTemplateRequest from a dict
update_voice_template_request_voice_template_request_from_dict = UpdateVoiceTemplateRequestVoiceTemplateRequest.from_dict(update_voice_template_request_voice_template_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


