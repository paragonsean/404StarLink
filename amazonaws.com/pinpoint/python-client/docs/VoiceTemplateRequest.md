# VoiceTemplateRequest

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
from openapi_client.models.voice_template_request import VoiceTemplateRequest

# TODO update the JSON string below
json = "{}"
# create an instance of VoiceTemplateRequest from a JSON string
voice_template_request_instance = VoiceTemplateRequest.from_json(json)
# print the JSON string representation of the object
print(VoiceTemplateRequest.to_json())

# convert the object into a dict
voice_template_request_dict = voice_template_request_instance.to_dict()
# create an instance of VoiceTemplateRequest from a dict
voice_template_request_from_dict = VoiceTemplateRequest.from_dict(voice_template_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


